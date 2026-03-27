package FactoryMethod;

public class FactorySupa extends FeluriDeMancareFactory {
    private static FactorySupa instanta;

    @Override
    public FeluriMancare getFeluriDeMancare(TipFelMancare tipFelMancare, String denumire) throws Exception {
        return switch (tipFelMancare) {
            case TipSupe.LEGUME -> new SupaLegume(denumire);
            case TipSupe.CIUPERCI -> new SupaCiuperci(denumire);
            default -> throw new Exception("Tip invalid");
        };
    }

    @Override
    public FeluriMancare getFeluriDeMancare(TipFelMancare tipFelMancare, String denumire, Double gramaj) throws Exception{
        return switch (tipFelMancare) {
            case TipSupe.VITA -> new SupaVita(denumire, gramaj);
            default -> this.getFeluriDeMancare(tipFelMancare, denumire);
        };
    }

    private FactorySupa() {

    }

    public synchronized static FactorySupa getIntanta() {
        if (instanta == null) {
            instanta = new FactorySupa();
        }
        return instanta;
    }
}
