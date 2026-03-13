package factory;

public class FactoryPersonal {
    public static PersonalSpital getPersonal(TipPersonalSpital tipPersonalSpital) {
        switch (tipPersonalSpital) {
            case TipPersonalSpital.Asistent -> {
                return new Asistent();
            }
            case TipPersonalSpital.Brancardier -> {
                return new Brancardier();
            }
            case TipPersonalSpital.Medic -> {
                return new Medic();
            }
            default -> {
                return null;
            }
        }
    }
}
