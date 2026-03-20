package prototype;

import prototype2.Solutie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RetetaMedicament implements RetetaClonable{
    private String nume;
    private List<Solutie> solutii;

    public RetetaMedicament(String nume, List<Solutie> solutii) {
        this.nume = nume;
        this.solutii = new ArrayList<>(solutii);
    }

    public RetetaMedicament(RetetaMedicament altaReteta) {
        this.nume = altaReteta.nume;
        this.solutii = new ArrayList<>(altaReteta.solutii);
    }

    @Override
    public String toString() {
        return "RetetaMedicament{" +
                "nume='" + nume + '\'' +
                ", solutii=" + solutii +
                '}';
    }

    @Override
    public RetetaClonable cloneaza() {
        return new RetetaMedicament(this);
    }
}
