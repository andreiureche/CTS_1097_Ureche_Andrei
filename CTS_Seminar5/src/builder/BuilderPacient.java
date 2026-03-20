package builder;

public class BuilderPacient implements IBuilderPacient{
    private Pacient pacient;

    public BuilderPacient() {
        this.pacient =  new Pacient();
    }

    @Override
    public Pacient buildPacient() {
        return this.pacient;
    }

    @Override
    public IBuilderPacient setPatRabatabil(boolean arePatRabatabil) {
        this.pacient.setArePatRabatabil(true);
        return this;
    }

    @Override
    public IBuilderPacient setMicDejun(boolean areMicDejun) {
        this.pacient.setAreMicDejun(true);
        return this;
    }

    @Override
    public IBuilderPacient setPapuci(boolean arePapuci) {
        this.pacient.setArePapuci(true);
        return this;
    }

    @Override
    public IBuilderPacient setHalat(boolean areHalat) {
        this.pacient.setAreHalat(true);
        return this;
    }

    @Override
    public IBuilderPacient setNume(String nume) {
        this.pacient.setNume(nume);
        return this;
    }
}