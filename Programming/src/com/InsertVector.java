
// Scrivere una classe java che contenga al suo interno un metodo main, nel quale si chiede all'utente di inserire 
// un vettore di numeri reali V e si calcolano il valore minimo e il secondo minimo, stampandoli sullo schermo.



package com;

import java.util.Arrays;
import java.util.Scanner;


public class InsertVector {
	
	public static void main (String [] args) {
		
		double min1 = 0; // inizializzo le variabili per riconoscere il minimo e il secondo minimo
		double min2 = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inserisci la dimensione dell' array : "); 
		
		int size = scan.nextInt(); // il numero che inserirò qui dentro mi darà la lunghezza del mio array
		
		double [] realNumbers = new double [size]; // definiamo la lunghezza
		
		System.out.println("Inserisci i numeri nell'array: ");
		
		for (int i = 0; i< realNumbers.length; i++) { // ciclo interno all'array 
			
			System.out.println("Numero :" + (i+1) + ":" ); // diciamo al contatore di scrivere ogni volta numero per inserirne uno nuovo
			
			realNumbers[i] = scan.nextDouble(); // inseriamo effettivamente il numero nell'array
				
		}
		min1 = realNumbers[0]; // devo inizializzaere con un valore, il primo indice array min1
		min2 = realNumbers[1]; //lo stesso, ma qui al secondo indice
		
		for (int i = 2; i<realNumbers.length; i++ ){  // il ciclo lo inizio da 2 perchè i primi due slot sono già occupati
			
			if (realNumbers[i] < min1) {   // se il numero iesimo dell'array realNumbers è inferiore a min1
				
				min2 = min1;    
			// Durante il ciclo, se troviamo un nuovo valore più piccolo di min1, 
			//dobbiamo spostare il valore precedente di min1 a min2 e aggiornare min1 con il nuovo valore.
			
				min1 = realNumbers[i]; // min 1 viene aggiornato con il nuovo valore più piccolo trovato nel ciclo
				
			 }else if (realNumbers[i] < min2 || min1 == min2) { // se iterando nel ciclo trovo un numero inferiore a al pi
				min2=realNumbers[i];	// non devo fare altro che assegnarlo a min2 perchè sarà comunque rappresentato con	
		}
					
			}
		 Arrays.sort(realNumbers);

	     System.out.println("I numeri inseriti e ordinati sono: " + Arrays.toString(realNumbers));
	     System.out.println("Il primo minimo è: " + min1);
	     System.out.println("Il secondo minimo è: " + min2);

	     scan.close();	
		
		}
	}

