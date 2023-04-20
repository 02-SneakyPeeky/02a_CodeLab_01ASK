package com.cc.java;

// public class App {
    
//     public static void main(String[] args) {
    
//     }


//     private static void output(String outputStr) {
//         System.out.println(outputStr);
//     } 
//     Konto konto1 = new Konto();
//     Konto konto2 = new Konto();
//     Konto konto3 = new Konto();
// }

public class App {
    public static void main(String[] args) {
        Konto konto1 = new Konto();
        Konto konto2 = new Konto();
        Konto konto3 = new Konto();

        System.out.println("Anfangs-Kontostand von konto1: " + konto1.getKontostand());
        System.out.println("Anfangs-Kontostand von konto2: " + konto2.getKontostand());
        System.out.println("Anfangs-Kontostand von konto3: " + konto3.getKontostand());

        konto1.setKontostand(konto1.getKontostand() * 2);
        konto2.setKontostand(konto2.getKontostand() * 3);
        konto3.setKontostand(konto3.getKontostand() * 10);

        System.out.println("Aktueller Kontostand von konto1: " + konto1.getKontostand());
        System.out.println("Aktueller Kontostand von konto2: " + konto2.getKontostand());
        System.out.println("Aktueller Kontostand von konto3: " + konto3.getKontostand());
    }
}