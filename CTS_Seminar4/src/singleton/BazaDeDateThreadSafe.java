package singleton;

public class BazaDeDateThreadSafe {
    private String denumire;
    private int numarCampuri;

    private static BazaDeDateThreadSafe instanta = null;

    public static synchronized BazaDeDateThreadSafe getInstanta(String denumire, int numarCampuri) {
        if (instanta == null) {
            instanta = new BazaDeDateThreadSafe(denumire, numarCampuri);
        }
        return instanta;
    }

    public BazaDeDateThreadSafe(String denumire, int numarCampuri) {
        this.denumire = denumire;
        this.numarCampuri = numarCampuri;
    }

    @Override
    public String toString() {
        return "singleton.BazaDeDateThreadSafe{" +
                "denumire='" + denumire + '\'' +
                ", numarCampuri=" + numarCampuri +
                '}';
    }
}

