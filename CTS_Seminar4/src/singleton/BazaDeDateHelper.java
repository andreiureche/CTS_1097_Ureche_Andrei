package singleton;

public class BazaDeDateHelper {
    private String denumire;
    private int numarCampuri;
    private static class BazaDeDateInner {
        private static BazaDeDateHelper instanta = new BazaDeDateHelper();
    }

    private static BazaDeDateHelper instanta = null;

    public static synchronized BazaDeDateHelper getInstanta(String denumire, int numarCampuri) {
        return BazaDeDateHelper.instanta;
    }

    public BazaDeDateHelper() {
        this.denumire = "Denumire";
        this.numarCampuri = 3;
    }

    @Override
    public String toString() {
        return "singleton.BazaDeDateHelper{" +
                "denumire='" + denumire + '\'' +
                ", numarCampuri=" + numarCampuri +
                '}';
    }
}


