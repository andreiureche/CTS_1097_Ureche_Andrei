package observer;

public class Spital extends Subject {
    private String numeSpital;

    public Spital(String numeSpital) {
        this.numeSpital = numeSpital;
    }

    public void notificaDespreVirus(String numeVirus) {
        super.notifyObserver("E un virus nou in oras! " + numeVirus);
    }
}
