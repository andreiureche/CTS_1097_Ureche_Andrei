package template;

public abstract class InternareTemplateMethod {
    abstract void analizareStarePacient();
    abstract void  disponibilitateSaloane();
    abstract void emitereFisaInternare();
    public void internare() {
        this.analizareStarePacient();
        this.disponibilitateSaloane();
        this.emitereFisaInternare();
    }
}
