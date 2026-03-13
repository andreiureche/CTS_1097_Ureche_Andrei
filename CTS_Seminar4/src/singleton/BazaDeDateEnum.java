package singleton;

public enum BazaDeDateEnum {
    instanta;
    private String denumire;
    private int numarCampuri;

    BazaDeDateEnum() {
        this.denumire = "denumire";
        this.numarCampuri = 3;
    }

    @Override
    public String toString() {
        return "singleton.BazaDeDateEnum{" +
                "denumire='" + denumire + '\'' +
                ", numarCampuri=" + numarCampuri +
                '}';
    }
}

