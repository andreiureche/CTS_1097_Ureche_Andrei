package Builder;

public class Rezervare {
    private boolean areAsezareLaGeam;
    private boolean areScauneErgonomice;
    private boolean areMuzicaAmbientala;
    private boolean areMasaDecorativa;
    private String genMuzica;

    protected Rezervare(boolean areAsezareLaGeam, boolean areScauneErgonomice, boolean areMuzicaAmbientala, boolean areMasaDecorativa, String genMuzica) {
        this.areAsezareLaGeam = areAsezareLaGeam;
        this.areScauneErgonomice = areScauneErgonomice;
        this.areMuzicaAmbientala = areMuzicaAmbientala;
        this.areMasaDecorativa = areMasaDecorativa;
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "areAsezareLaGeam=" + areAsezareLaGeam +
                ", areScauneErgonomice=" + areScauneErgonomice +
                ", areMuzicaAmbientala=" + areMuzicaAmbientala +
                ", areMasaDecorativa=" + areMasaDecorativa +
                ", genMuzica='" + genMuzica + '\'' +
                '}';
    }
}
