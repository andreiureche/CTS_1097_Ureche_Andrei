package state;

public class Internare implements Stare {
    @Override
    public void interneaza() {
        System.out.println("Pacientul deja este internat!");
    }

    @Override
    public void trecereSubObservatie() {
        System.out.println("Pacientul se simte mai rau si va fi trecut sub observatie.");
    }

    @Override
    public void externeaza() {
        System.out.println("Pacientul se simte bine si va fi externat.");
    }
}
