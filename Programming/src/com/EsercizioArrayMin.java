package com;

import java.util.Scanner;

public class EsercizioArrayMin {

	public static void main(String[] args) {

		int[] tmp = {10,3,2,2,3};
		
		//troviamo il piu piccolo
		int min = tmp[0];
		int indexMin = 0;
		for (int i = 0; i < tmp.length; i++) {
			if(tmp[i] < min)
			{
				min = tmp[i];
				indexMin = i;
			}
		}
		
		int minSecondo = 0;	
		for (int i = 0; i < tmp.length; i++) {
			if(tmp[i] != min)
			{
				minSecondo = tmp[i];
			}
		}
		
		// troviamo il secondo più piccolo
		for (int i = 0; i < tmp.length; i++) {
			if(tmp[i] < minSecondo && tmp[i] != min)
			{
				minSecondo = tmp[i];
			}
		}
		
		System.out.println("il minimo è:"+min);
		System.out.println("il secondo minimo è:"+minSecondo);		
	}

}
