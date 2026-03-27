package Builder;

public class BuilderRezervare extends Builder {
    private static BuilderRezervare instanta

    private boolean areAsezareLaGeam;
    private boolean areScauneErgonomice;
    private boolean areMuzicaAmbientala;
    private boolean areMasaDecorativa;
    private String genMuzica;

    private BuilderRezervare() {
        this.resetare();
    }

    public BuilderRezervare setAreAsezareLaGeam(boolean areAsezareLaGeam) {
        this.areAsezareLaGeam = areAsezareLaGeam;
        return this;
    }

    public BuilderRezervare setAreScauneErgonomice(boolean areScauneErgonomice) {
        this.areScauneErgonomice = areScauneErgonomice;
        return this;
    }

    public BuilderRezervare setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
        this.areMuzicaAmbientala = areMuzicaAmbientala;
        return this;
    }

    public BuilderRezervare setAreMasaDecorativa(boolean areMasaDecorativa) {
        this.areMasaDecorativa = areMasaDecorativa;
        return this;
    }

    public BuilderRezervare setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }

    @Override
    public Rezervare build() {
        return new Rezervare(this.areAsezareLaGeam, this.areScauneErgonomice, this.areMuzicaAmbientala, this.areMasaDecorativa, this.genMuzica);
    }

    public static BuilderRezervare getInstance() {
        if(BuilderRezervare.instanta == null){
            BuilderRezervare.instanta = new BuilderRezervare();
        }
        return BuilderRezervare.instanta;
    }

    public void resetare() {
        this.areAsezareLaGeam = false;
        this.areScauneErgonomice = false;
        this.areMuzicaAmbientala = false;
        this.areMasaDecorativa = false;
        this.genMuzica = "Necunoscut";
    }
}
