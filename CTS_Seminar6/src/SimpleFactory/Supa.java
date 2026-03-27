package SimpleFactory;

public abstract class Supa {
    private String denumire;

    public Supa(String denumire) {
        this.denumire = denumire;
    }

    public String getDenumire() {
        return denumire;
    }

    public abstract void afiseazaDetalii();

    @Override
    public String toString() {
        return "Supa{" +
                "denumire='" + denumire + '\'' +
                '}';
    }
}
