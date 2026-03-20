//package builder2;
//
//public class BuilderPacient implements IBuilderPacient {
//    private final boolean arePatRabatabil;
//    private final boolean areMicDejun;
//    private final boolean arePapuci;
//    private final boolean areHalat;
//    private final String nume;
//
//    public BuilderPacient() {
//        this.arePatRabatabil = false;
//        this.areMicDejun = false;
//        this.arePapuci = false;
//        this.areHalat = false;
//        this.nume = "Anonim";
//
//    }
//
//    @Override
//    public Pacient buildPacient() {
//        return this.pacient;
//    }
//
//    @Override
//    public IBuilderPacient setPatRabatabil(boolean arePatRabatabil) {
//        this.arePatRabatabil = true;
//        return this;
//    }
//
//    @Override
//    public IBuilderPacient setMicDejun(boolean areMicDejun) {
//        this.areMicDejun = true;
//        return this;
//    }
//
//    @Override
//    public IBuilderPacient setPapuci(boolean arePapuci) {
//        this.arePapuci = true;
//        return this;
//    }
//
//    @Override
//    public IBuilderPacient setHalat(boolean areHalat) {
//        this.areHalat = true;
//        return this;
//    }
//
//    @Override
//    public IBuilderPacient setNume(String nume) {
//        this.nume = nume;
//        return this;
//    }
//}