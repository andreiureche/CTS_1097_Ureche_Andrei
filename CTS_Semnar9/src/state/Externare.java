package state;

public class Externare implements Stare {
    @Override
    public void interneaza() {
        System.out.println("Pacientul va fi reinternat.");
    }

    @Override
    public void trecereSubObservatie() {
        System.out.println("Pacientul nu poate fi observat, nu este internat!");
    }

    @Override
    public void externeaza() {
        System.out.println("Pacientul este deja externat!");
    }
}
