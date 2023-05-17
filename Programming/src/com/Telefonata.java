package com;

import java.util.Arrays;
import java.util.Scanner; 

public class Telefonata {
	
	private String numero;
	private int durata;
	private double costo;
	
	
	public Telefonata (String numero, int durata, double costo) {
		
		this.numero = numero;
		this.durata = durata;
		this.costo = costo;
		
	}


	public String getNumero() {
		return numero;
	}


	public int getDurata() {
		return durata;
	}


	public double getCosto() {
		return costo;
	}
	
	public class Sim {
		
		private String numero;
		private double importo;
		private Telefonata [] ultimeTelefonateFatte;
		private Telefonata [] ultimeTelefonateRicevute;
		private int numTelefonateFatte;
		private int numTelefonateRicevute;
		
	
	public Sim (String numero, double importo) {
		
		this.numero = numero;
		this.importo = importo;
		this.ultimeTelefonateFatte = new Telefonata [10];
		this.ultimeTelefonateRicevute = new Telefonata [10];
		this.numTelefonateFatte = 0;
		this.numTelefonateRicevute = 0;
		
	}
	
	public void AggiungiTelefonataFatta (Telefonata telefonata) {
		
		if (numTelefonateFatte<10) {
			ultimeTelefonateFatte[numTelefonateFatte]= telefonata;
			numTelefonateFatte ++;
			
		}else {
			for (int i=0; i<9; i++) {
				ultimeTelefonateFatte[i] = ultimeTelefonateFatte[i+1];
				
			}
		}
		ultimeTelefonateFatte[9]=telefonata;
		
	}
	public void AggiungiTelefonataRicevuta (Telefonata telefonata) {
		
		if(numTelefonateRicevute<10) {
			ultimeTelefonateRicevute[numTelefonateRicevute]= telefonata;
			numTelefonateRicevute ++;
			
		}else {
			for (int i=0; i<9; i++) {
				ultimeTelefonateRicevute[i] = ultimeTelefonateRicevute[i+1];
			}
		}
		ultimeTelefonateRicevute[9] = telefonata; 
	}
	
	public double CostoTotaleChiamate () {
		
		double costoTotale = 0.0;
		for (int i=0; i<numTelefonateFatte; i++) {
			costoTotale = costoTotale + ultimeTelefonateFatte[i].getCosto();
		}
			return costoTotale;	
	}
	
	public int DurataTotaleChiamate () {
		
		int durataTotale = 0;
		for (int i=0; i<numTelefonateFatte; i++) {
			durataTotale = durataTotale + ultimeTelefonateFatte[i].getDurata();
		}
		return durataTotale;
	}
	}
	
	public class Main {
		
		public static void main (String [] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Inserisci il numero di telefono: ");
			String numeroSim = scanner.nextLine();
			
			System.out.print("Dammi l'importo presente sulla SIM : ");
			double importoSim = scanner.nextDouble();
			
			Sim sim = new Sim(numeroSim, importoSim);
			
			
			
			
		}
	}
}
		