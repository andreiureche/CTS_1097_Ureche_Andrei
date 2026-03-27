package FactoryMethod;

public class SupaCiuperci extends FeluriMancare {

    public SupaCiuperci(String denumire) {
        super(denumire);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Supa de ciuperci " + super.getDenumire());
    }
}
