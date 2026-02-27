package cts.s02.principii_clean_code.clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	private int sumaFinantare = 30;

	public Elev() {
		super();
	}

	public Elev(String nume, String prenume, int varsta, int punctaj,
				 int numarProiecte, String[] denumiriProiecte, int clasa, String tutore) {
		super(nume, prenume, varsta, punctaj, numarProiecte, denumiriProiecte);
		this.clasa = clasa;
		this.tutore = tutore;
	}

	public int getClasa() {
		return this.clasa;
	}

	public void setClasa(int i) {
		this.clasa = i;
	}

	public String getTutore() {
		return this.tutore;
	}

	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	@Override
	public String toString() {
		return "Elev: Nume=" + nume + ", Prenume=" + prenume + ", Varsta="
				+ varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + numarProiecte  + ", DenumireProiect="
				+ Arrays.toString(denumiriProiecte) + "Clasa=" + clasa + ", Tutore=" + tutore;
	}
	
	public void afisareFinantare() {
		System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste"+sumaFinantare+" Euro/zi in proiect.");
	}
}
