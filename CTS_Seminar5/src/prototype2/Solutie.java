package prototype2;

public class Solutie {
    private String nume;
    private Double cantitate;

    public Solutie(String nume, Double cantitate) {
        this.nume = nume;
        this.cantitate = cantitate;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setCantitate(Double cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        return "Solutie{" +
                "nume='" + nume + '\'' +
                ", cantitate=" + cantitate +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
