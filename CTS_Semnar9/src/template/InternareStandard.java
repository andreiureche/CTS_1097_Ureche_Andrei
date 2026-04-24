package template;

public class InternareStandard extends InternareTemplateMethod {
    @Override
    void analizareStarePacient() {
        System.out.println("Standard stare!");
    }

    @Override
    void disponibilitateSaloane() {
        System.out.println("Standard disponibilitate!");
    }

    @Override
    void emitereFisaInternare() {
        System.out.println("Standard emitere");
    }
}
