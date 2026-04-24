package state;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Pacient1");
        pacient.interneaza();
        pacient.setStare(new SubObservatie());
        pacient.trecereSubObservatie();
        pacient.setStare(new Externare());
        pacient.externeaza();
    }
}
