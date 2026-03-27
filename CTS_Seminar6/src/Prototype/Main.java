package Prototype;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Andrei","0722222222");
        ClientPrototypeFactory clientPrototypeFactory = new ClientPrototypeFactory();
        Client clonaClient = clientPrototypeFactory.getClient("0722222222");
        System.out.println(client == clonaClient);
    }
}
