package state;

public class SubObservatie implements Stare {
    @Override
    public void interneaza() {
        System.out.println("Pacientul a iesit din observatie, dar ramane internat.");
    }

    @Override
    public void trecereSubObservatie() {
        System.out.println("Pacientul este deja sub observatie!");
    }

    @Override
    public void externeaza() {
        System.out.println("Pacientul a iesit din observatie si a fost externat.");
    }
}
