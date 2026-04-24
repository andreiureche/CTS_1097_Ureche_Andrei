package observer;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("Mihnea");
        Pacient pacient2 = new Pacient("Ionut");
        Pacient pacient3 = new Pacient("Dan");

        Spital spital = new Spital("Spitalul Militar");
        spital.addObserver(pacient1);
        spital.addObserver(pacient2);
        spital.addObserver(pacient3);
        spital.notificaDespreVirus("CoronaVirus");
        spital.deleteObserver(pacient1);
        spital.notificaDespreVirus("EbolaVirus");
    }
}
