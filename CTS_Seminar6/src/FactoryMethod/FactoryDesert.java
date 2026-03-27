package FactoryMethod;

public class FactoryDesert extends FeluriDeMancareFactory {
    private static FactoryDesert instanta;

    @Override
    public FeluriMancare getFeluriDeMancare(TipFelMancare tipFelMancare, String denumire) throws Exception {
        return switch (tipFelMancare) {
            case TipDesert.CLATITE -> new SupaLegume(denumire);
            case TipDesert.PAPANASI -> new SupaCiuperci(denumire);
            default -> throw new Exception("Tip invalid");
        };
    }

    @Override
    public FeluriMancare getFeluriDeMancare(TipFelMancare tipFelMancare, String denumire, Double gramaj) throws Exception{
        return switch (tipFelMancare) {
            case TipDesert.CHEESECAKE -> new SupaVita(denumire, gramaj);
            default -> this.getFeluriDeMancare(tipFelMancare, denumire);
        };
    }

    private FactoryDesert() {

    }

    public synchronized static FactoryDesert getIntanta() {
        if (instanta == null) {
            instanta = new FactoryDesert();
        }
        return instanta;
    }
}
