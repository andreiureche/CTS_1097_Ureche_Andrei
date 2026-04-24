package state;

public class Pacient {
    private String nume;
    private Stare stare;

    public Pacient(String nume) {
        this.nume = nume;
        this.stare = new Internare();
    }

    public void setStare(Stare stare) {
        this.stare = stare;
    }

    public void interneaza() {
        this.stare.interneaza();
        this.setStare(new Internare());
    }

    public void externeaza() {
        this.stare.externeaza();
        this.setStare(new Externare());
    }

    public void trecereSubObservatie() {
        this.stare.trecereSubObservatie();
        this.setStare(new SubObservatie());
    }
}
