
// Scrivere una classe Domanda1 che contenga al suo interno un metodo main, nel quale si dichiari
// l'array di interi V=[6,3,1,2,9] e si calcoli la media dell'array, stampandola sullo schermo.

package com;

public class ArrayProject1 {
	
	public static void main (String [] args) {
	
	int [] arrayInt = {23,65,98,11,25}; // inizializziamo un array con valori interi all'interno
	
	double media = 0; // bisogna inizializzare una variabile per il calcolo della media.
	
	double sum = 0;
	
	for (int i = 0; i<arrayInt.length; i++) {  //ciclo for per iterare lungo la lunghezza del nostro array di interi
		
		sum = sum + arrayInt[i];
		
	}
	media =  sum / arrayInt.length;
	System.out.println("la somma e' :" + "" + sum);
	System.out.println("la media e' :" + "" + media);
	
	
	}

}
