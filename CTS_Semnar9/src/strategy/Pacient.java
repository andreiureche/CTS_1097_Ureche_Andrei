package strategy;

public class Pacient {
    private ModPlata modPlata;

    public Pacient(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void plateste() {
        System.out.println("Incomplet");
    }
}
