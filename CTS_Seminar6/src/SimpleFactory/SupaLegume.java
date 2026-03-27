package SimpleFactory;

public class SupaLegume extends Supa{

    public SupaLegume(String denumire) {
        super(denumire);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Supa legume "+super.getDenumire());
    }
}
