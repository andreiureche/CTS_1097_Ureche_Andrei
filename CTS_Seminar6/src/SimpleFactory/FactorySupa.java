package SimpleFactory;

public class FactorySupa {
    private static FactorySupa instanta;

    private FactorySupa() {}

    public static FactorySupa getInstance() {
        if(FactorySupa.instanta == null) {
            FactorySupa.instanta = new FactorySupa();
        }
        return FactorySupa.instanta;
    }

    public Supa getSupa(TipSupa tipSupa, String denumire) throws Exception {
        return switch (tipSupa) {
            case TipSupa.LEGUME -> new SupaLegume(denumire);
            case TipSupa.CIUPERCI -> new SupaCiuperci(denumire);
            default -> throw new Exception("Tip invalid");
        };
    }

//    public Supa getSupa(TipSupa tipSupa, String denumire, Double gramaj) throws Exception {
//        return switch (tipSupa) {
//            case TipSupa.VITA -> new SupaVita(denumire, gramaj);
//        }
//
//    }
}
