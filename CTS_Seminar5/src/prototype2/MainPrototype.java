package prototype2;

import java.util.Map;

public class MainPrototype {
    public static void main(String[] args) {
        RetetaMedicament retetaMedicament = new RetetaMedicament("medicament", Map.of("solutia1",10.1,"solutia2",20.2));
        RetetaMedicament copieRetetaMedicament = (RetetaMedicament) retetaMedicament.cloneaza();
        System.out.println(retetaMedicament == copieRetetaMedicament);
        System.out.println(retetaMedicament);
        System.out.println(copieRetetaMedicament);
    }
}
