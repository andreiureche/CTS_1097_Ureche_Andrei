package Prototype;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClientPrototypeFactory {
    Map<String,Client> clienti;

    public ClientPrototypeFactory() {
        this.clienti = new HashMap<>();
    }

    public void adaugaClient (Client client) {
        this.clienti.put(client.getNumarTelefon(), client);
    }

    public Client getClient(String numarTelefon) {
        Client client = clienti.get(numarTelefon);
        if(client == null) {
            Scanner scanner = new Scanner(System.in);
            String nume = scanner.nextLine();
            client = new Client(nume, numarTelefon);
            this.adaugaClient(client);
        }
        return (Client) client.cloneaza();
    }
}
