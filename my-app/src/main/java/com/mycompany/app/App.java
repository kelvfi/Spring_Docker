package com.mycompany.app;

public class App 
{
    public static void main( String[] args )
    {
        BuchFunc buchFunc = new BuchFunc();

        // Erzeugen neuer Buch Objekte
        Buch b1 = new Buch(30, "Harry Potter und der Stein der Weisen", 2);
        Buch b2 = new Buch(20, "Zurück in die Zukunft", 1);

        // Bücher hinzufügen
        buchFunc.add(b1);
        buchFunc.add(b2);

        // Buchliste ausgeben
        System.out.println("LISTE");
        buchFunc.listOfBooks();
        System.out.println("\n");

        System.out.println("SUCHE");
        buchFunc.searchName("zukunft");
        System.out.println("\n");

        System.out.println("PREISBEREICH");
        buchFunc.priceRange(20, 50);
        System.out.println("\n");

        System.out.println("WENIGSTE VORBESITZER");
        buchFunc.fewestOwners();
        System.out.println("\n");

        System.out.println("MEISTE VORBESITZER");
        buchFunc.mostOwners();
        System.out.println("\n");

        System.out.println("GERINGSTER PREIS");
        buchFunc.lowestPrice();
        System.out.println("\n");

        System.out.println("HOCHSTER PREIS");
        buchFunc.highestPrice();
        System.out.println("\n");
    }
}
