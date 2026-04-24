package flyweight;

import java.util.HashMap;
import java.util.Map;

public class PacientFlyweightFactory {
    private static Map<String, Flyweight> flyweights = new HashMap<>();

    public static Flyweight getFlyweight(String nume, String numarTelefon, String adresa) {
        if (!flyweights.containsKey(numarTelefon)) {
            flyweights.put(numarTelefon, new PacientFlyweight(new Pacient(nume, numarTelefon, adresa)));
        }
        return flyweights.get(numarTelefon);
    }
}
