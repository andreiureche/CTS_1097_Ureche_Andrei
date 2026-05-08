package memento;

public class Autobuz {
    private String model;
    private int anFabricatie;
    private int nrLocuri;
    private String numeSofer;
    private double consumMediu;


    public Autobuz(String model, int anFabricatie, int nrLocuri, String numeSofer, double consumMediu) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.nrLocuri = nrLocuri;
        this.numeSofer = numeSofer;
        this.consumMediu = consumMediu;
    }

    public  AutobuzMemento salvareMemento(){
       return  new AutobuzMemento(this.numeSofer,this.consumMediu);
    }

    public void restaurareMemento(AutobuzMemento memento){
        this.numeSofer=memento.getNumeSofer();
        this.consumMediu=memento.getConsumMediu();
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public void setConsumMediu(double consumMediu) {
        this.consumMediu = consumMediu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("model='").append(model).append('\'');
        sb.append(", anFabricatie=").append(anFabricatie);
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append(", numeSofer='").append(numeSofer).append('\'');
        sb.append(", consumMediu=").append(consumMediu);
        sb.append('}');
        return sb.toString();
    }
}
