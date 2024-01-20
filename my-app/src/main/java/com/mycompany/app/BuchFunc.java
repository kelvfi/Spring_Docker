package com.mycompany.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BuchFunc {
    Buch buch = new Buch();
    ArrayList<Buch> buchListe;

    public BuchFunc() {
        buchListe = new ArrayList<>();
    }

    public void add(Buch buch) {
        buchListe.add(buch);
    }

    public void listOfBooks() {
        for (Buch buch : buchListe) {
            System.out.println(buch.toString());
        }
    }

    public void searchName(String titel) {
        boolean gefunden = false;

        for (Buch buch : buchListe) {
            if (buch.getTitel().toLowerCase().contains(titel.toLowerCase())) {
                System.out.println(buch.toString());
                gefunden = true;
            }
        }
        if (!gefunden) {
            System.out.println("Dieses Buch konnte nicht gefunden werden!");
        }
    }

    public void priceRange(int minPrice, int maxPrice) {
        boolean gefunden = false;

        for (Buch buch : buchListe) {
            if (buch.getPreis() >= minPrice && buch.getPreis() <= maxPrice) {
                System.out.println(buch.toString());
                gefunden = true;
            }
        }
        if (!gefunden) {
            System.out.println("Es konnte kein Buch in diesem Preisspekrtum gefunden werden!");
        }
    }

    public void fewestOwners() {
        Collections.sort(buchListe, (buch1, buch2) ->
        Integer.compare(buch1.getBesitzer(), buch2.getBesitzer()));

        for (Buch buch : buchListe) {
            System.out.println(buch.toString());
        }
    }

    public void mostOwners() {
        Collections.sort(buchListe, (buch1, buch2) ->
        Integer.compare(buch2.getBesitzer(), buch1.getBesitzer()));

        for (Buch buch : buchListe) {
            System.out.println(buch.toString());
        }
    }

    public void lowestPrice() {
        Collections.sort(buchListe, (buch1, buch2) ->
        Integer.compare(buch1.getPreis(), buch2.getPreis()));

        for (Buch buch : buchListe) {
            System.out.println(buch.toString());
        }
    }

    public void highestPrice() {
        Collections.sort(buchListe, (buch1, buch2) ->
        Integer.compare(buch2.getPreis(), buch1.getPreis()));

        for (Buch buch : buchListe) {
            System.out.println(buch.toString());
        }
    }
}
