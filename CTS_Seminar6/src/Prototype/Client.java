package Prototype;

public class Client implements ClientClonable{
    private String nume;
    private String numarTelefon;

    public Client(String nume, String numarTelefon) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
    }

    public Client(Client altClient) {
        this.nume = altClient.nume;
        this.numarTelefon = altClient.numarTelefon;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", numarTelefon='" + numarTelefon + '\'' +
                '}';
    }

    @Override
    public ClientClonable cloneaza() {
        return null;
    }
}
