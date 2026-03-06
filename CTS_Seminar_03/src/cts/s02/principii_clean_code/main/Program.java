package cts.s02.principii_clean_code.main;

import java.util.List;

import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.readers.AplicantReader;
import cts.s02.principii_clean_code.readers.ElevReader;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaElevi;
		AplicantReader reader = new ElevReader();
		try {
			listaElevi = reader.citireAplicanti("elevi.txt");
		} catch (Exception e) {
			throw new RuntimeException();
		}
		for (Aplicant aplicant : listaElevi)
			System.out.println(aplicant.toString());
	}
}
