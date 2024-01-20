package com.mycompany.app;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Buch {
    
    private int preis;
    private String titel;
    private int besitzer;

    // Setter mit Validierung
    public void setPreis(int preis) {
        if (preis <= 0) {
            System.out.println("Preis darf nicht 0 oder kleiner als 0 sein.");
        } else {
            this.preis = preis;
        }
    }

    public void settitel(String titel) {
        if (titel == null) {
            System.out.println("titel darf nicht leer sein!");
        } else if(titel.length() < 2) {
            System.out.println("titel muss länger als 2 Zeichen sein!");
        } else {
            this.titel = titel;
        }
    }

    public void setBesitzer(int besitzer) {
        if (besitzer <= 0) {
            System.out.println("Vorbesitzer dürfen nicht leer sein!");
        } else {
            this.besitzer = besitzer;
        }
    }

    // toString() Methode zum Ausgeben.
    @Override
    public String toString() {
        return String.format("Titel: %s | Vorbesitzer: %d | Preis: %d€", titel, besitzer, preis);
    }

}
