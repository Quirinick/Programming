package com;


import java.util.Scanner;

public class Car {
	
	double resaCarburante; // litri per km auto
	double prezzoCarburante; // prezzo a litro del carburante
	double litriCarburanteConsumati ; //  quello che consumi facendo tot km
	double distanza; // distanza percorsa con auto
	double importoPieno; // quanto è l'importo in euro del pieno nella tua auto
	double litriCaricati;// litri derivanti dall'importo
	
	
	

	public Car(double resaCarburante, double prezzoCarburante) {
		super();
		this.resaCarburante = resaCarburante;
		this.prezzoCarburante = prezzoCarburante;
		this.litriCarburanteConsumati = 0;
		this.distanza = 0;
		this.importoPieno = 0;
		this.litriCaricati = 0;
	}
	
	public double Drive () {
		
		double importoPieno = 0;
		double prezzoCarburante = 0;
		double lirtriCaricati = importoPieno / prezzoCarburante;
		double resaCarburante = 0;
		double litriCarburanteConsumati = distanza / resaCarburante ;
		double chilometriPercorsi = lirtriCaricati * resaCarburante; 
		
		if (importoPieno > 0 && litriCarburanteConsumati <= litriCaricati) {
			
			System.out.print("La macchina ha percorso km: " + " " + chilometriPercorsi + "consumando litri" + " " + litriCarburanteConsumati);
		}else {
			System.out.print("La macchina deve fermarsi alla pompa per caricare carburante");
		}
		
		return litriCarburanteConsumati;
			
		
	}
	
	public double GetGas () {
		
		double litriDisponibili = 0;
		
		if (litriCaricati > litriCarburanteConsumati) {
			litriCaricati = litriDisponibili;
			System.out.print("Sono ancora disponibili questi litri nel serbatoio: " + " " + litriDisponibili );
			
		}else {
			System.out.print("Non hai più carburante devi fermarti per farlo");
		}
		
		return litriDisponibili;
		}
		
	public double addGas () {
		
		double litriIndisponibili = 0;
		if (litriCarburanteConsumati > litriCaricati) {
			litriCaricati = litriIndisponibili;
			System.out.print("Sei a secco fai carburante");
		}
		
		return litriIndisponibili;
		
	}
	
	public static void main (String []args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Dimmi quanti km/litro fa la tua auto :");
		
		double a = scan.nextDouble();
		
		System.out.print("Inserisci il costo a litro del carburante");
		
		double c = scan.nextDouble();
		
		System.out.print("Fai il pieno di carburante");
		
		double p = scan.nextDouble();
		
		
		Car car = new Car(a, c);
		
		System.out.print(" " + car.Drive());
		System.out.print (" " + car.GetGas());
		System.out.print("" + car.addGas());
		
	}
	}
	