package com;

import java.util.Scanner;

public class Carta {
    private String valore;
    private String seme;

    public Carta(String valore, String seme) {
        if (!controllaValore(valore) || !controllaSeme(seme)) {
            throw new IllegalArgumentException("Valore o seme non validi");
        }
        this.valore = valore;
        this.seme = seme;
    }

    public boolean confronta(String altroValore, String altroSeme) {
        return this.valore.equals(altroValore) && this.seme.equals(	Seme);
    }

    private boolean controllaValore(String valore) {
        String[] valoriValidi = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        for (String v : valoriValidi) {
            if (v.equals(valore)) {
                return true;
            }
        }
        return false;
    }

    private boolean controllaSeme(String seme) {
        String[] semiValidi = {"Cuori", "Fiori", "Picche", "Quadri"};
        for (String s : semiValidi) {
            if (s.equals(seme)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il valore della carta da 1 a 10 o solo J,Q,K: ");
        String valore = input.nextLine();
        System.out.print("Inserisci il seme della carta, tra Cuori, Fiori, Picche e Quadri: ");
        String seme = input.nextLine();
        try {
            Carta carta = new Carta(valore, seme);
            System.out.println("Carta creata: " + carta.valore + " di " + carta.seme);
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}