package cts.s02.principii_clean_code.clase;

import java.util.Arrays;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int numarProiecte;
	protected String[] denumiriProiecte;
	private static int pragAcceptare = 80;

	public Aplicant() {
		super();
	}

	public Aplicant(String nume, String prenume, int varsta, int punctaj, int numarProiecte, String[] denumiriProiecte) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.numarProiecte = numarProiecte;
		this.denumiriProiecte = denumiriProiecte;
	}

	public String getNume() {
		return this.nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return this.prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public int getVarsta() {
		return this.varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public int getPunctaj() {
		return this.punctaj;
	}

	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}

	public int getNumarProiecte() {
		return this.numarProiecte;
	}

	public void setNumarProiecte(int numarProiecte, String[] denumiriProiecte) {
		this.numarProiecte = numarProiecte;
		this.denumiriProiecte = new String[numarProiecte];
		for (int i =0; i < numarProiecte; i++) {
			this.denumiriProiecte[i] = denumiriProiecte[i];
		}
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Aplicant (nume=");
		stringBuilder.append(this.nume);
		stringBuilder.append(", prenume=");
		stringBuilder.append(this.prenume);
		stringBuilder.append(", varsta=");
		stringBuilder.append(this.varsta);
		stringBuilder.append(", punctaj=");
		stringBuilder.append(this.punctaj);
		stringBuilder.append(", numarProiecte=");
		stringBuilder.append(this.numarProiecte);
		stringBuilder.append(", denumiriProiecte");
		stringBuilder.append(Arrays.toString(this.denumiriProiecte));
		return stringBuilder.toString();
	}

	public void statutAplicant() {
		System.out.println("Aplicantul "+this.nume+" "+this.prenume+(this.punctaj > this.pragAcceptare ? " " : " nu ")+"a fost acceptat.");
	}
}
