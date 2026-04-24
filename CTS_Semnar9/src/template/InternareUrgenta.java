package template;

public class InternareUrgenta extends InternareTemplateMethod {
    @Override
    void analizareStarePacient() {
        System.out.println("Urgenta analizare!");
    }

    @Override
    void disponibilitateSaloane() {
        System.out.println("Urgenta disponibilitate!");
    }

    @Override
    void emitereFisaInternare() {
        System.out.println("Urgenta emitere!");
    }
}
