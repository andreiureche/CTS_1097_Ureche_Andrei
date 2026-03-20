package builder3;

public class Pacient {
    private boolean arePatRabatabil;
    private boolean areMicDejun;
    private boolean arePapuci;
    private boolean areHalat;
    private String nume;

    protected Pacient(boolean arePatRabatabil, boolean areMicDejun, boolean arePapuci, boolean areHalat, String nume) {
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejun = areMicDejun;
        this.arePapuci = arePapuci;
        this.areHalat = areHalat;
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "arePatRabatabil=" + arePatRabatabil +
                ", areMicDejun=" + areMicDejun +
                ", arePapuci=" + arePapuci +
                ", areHalat=" + areHalat +
                ", nume='" + nume + '\'' +
                '}';
    }
}