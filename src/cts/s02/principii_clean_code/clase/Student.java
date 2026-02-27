package cts.s02.principii_clean_code.clase;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;
	private int sumaFinantare = 20;

	public Student() {
		super();
	}

	public Student(String nume, String prenume, int varsta, int punctaj, int numarProiecte, String[] denumiriProiecte, String facultate, int anStudii) {
		super(nume, prenume, varsta, punctaj, numarProiecte, denumiriProiecte);
		this.facultate = facultate;
		this.anStudii = anStudii;
	}
	
	public String getFacultate() {
		return facultate;
	}

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}

	public int getAnStudii() {
		return anStudii;
	}

	public void setAnStudii(int anStudii) {
		this.anStudii = anStudii;
	}

	@Override
	public String toString() {
		return "Student: Nume="+this.nume+", Prenume="+this.prenume+", Varsta="+this.varsta+", Punctaj="+this.punctaj+", NumarProiecte="+this.numarProiecte+", DenumiriProiecte="+Arrays.toString(this.denumiriProiecte)+"Facultate="+this.facultate+", AnStudii="+this.anStudii;
	}

	public void afisareFinantare() {
		System.out.println("Studentul "+getNume()+" "+getPrenume()+" primeste"+this.sumaFinantare+" Euro/zi in proiect.");
	}
}
