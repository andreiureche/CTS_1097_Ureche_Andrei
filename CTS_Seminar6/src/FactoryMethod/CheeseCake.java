package FactoryMethod;

public class CheeseCake extends FeluriMancare {
    private Double gramaj;

    public CheeseCake(String denumire, Double gramaj) {
        super(denumire);
        this.gramaj = gramaj;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("CheeseCake " + super.getDenumire() + ", " + this.gramaj);
    }

    @Override
    public String toString() {
        return super.toString() +
                "gramaj=" + gramaj +
                '}';
    }
}
