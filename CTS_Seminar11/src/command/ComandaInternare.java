package command;

public class ComandaInternare extends Command{
    public ComandaInternare(String numePacient, Medic medic) {
        super(numePacient, medic);
    }

    @Override
    public void executa() {
        super.getMedic().internare();
    }

    @Override
    public void undo() {
        super.getMedic().anuleazaInternarePacient();
    }

    @Override
    public void redo() {
        super.getMedic().refaceAnuleazaInternarePacient();
    }
}
