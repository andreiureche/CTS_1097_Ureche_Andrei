package command;

public class Medic {
    protected String nume;



   public void internare(){
       System.out.println("internare pacient");
    }



    public void tratareImediata(){
        System.out.println("internate imediata");
    }

    public Medic(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void anuleazaTratareImediata(){
        System.out.println("tratatarea imediata a fost anulata!");
    }

    public void anuleazaInternarePacient(){
        System.out.println("anuleaza internare");
    }

    public void refaceAnuleazaTratareImediata(){
        System.out.println("reface tratare imediata");
    }

    public void refaceAnuleazaInternarePacient(){
        System.out.println("refacae internare");
    }
}
