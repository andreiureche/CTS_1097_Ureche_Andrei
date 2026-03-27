package SimpleFactory;

public class SupaVita extends Supa{
    private Double gramaj;

    public SupaVita(String denumire, Double gramaj) {
        super(denumire);
        this.gramaj = gramaj;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Supa vita "+super.getDenumire());
    }

    @Override
    public String toString() {
        return super.toString() + "SupaVita{" +
                "gramaj=" + gramaj +
                '}';
    }
}
