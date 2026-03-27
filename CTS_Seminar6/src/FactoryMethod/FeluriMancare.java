package FactoryMethod;

public abstract class FeluriMancare {
    private String denumire;

    public FeluriMancare(String denumire) {
        this.denumire = denumire;
    }

    public String getDenumire() {
        return denumire;
    }

    public abstract void afiseazaDetalii();

    @Override
    public String toString() {
        return "FeluriMancare{" +
                "denumire='" + denumire + '\'' +
                '}';
    }
}
