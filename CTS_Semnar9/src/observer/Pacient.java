package observer;

public class Pacient implements IObserver {
    private String nume;

    public Pacient(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Pacientul " + this.nume + " a primit urmatorul mesaj: " + mesaj);
    }
}
