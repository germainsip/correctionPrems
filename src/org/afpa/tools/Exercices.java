package org.afpa.tools;

import java.util.Scanner;

public class Exercices {
    public static void afficheTriangle() {
        Scanner sc = new Scanner(System.in);
        int nbLignes;
        System.out.println("===========================================");
        System.out.println("|      Et si on dessinait un triangle     |");
        System.out.println("===========================================");
        System.out.println("Entrez un nombre de lignes: ");
        nbLignes = sc.nextInt();
        //affichage du triangle
        for (int i = 1; i < nbLignes + 1; i++) {
            System.out.println(" ".repeat(nbLignes - i) + "*".repeat(2 * i - 1));
        }

    }

    public static boolean nbVoyelles() {
        Scanner sc = new Scanner(System.in);
        boolean test = true;
        String mot;
        int nbVoyelles = 0;
        String VOYELLES = "aeiouy";

        System.out.println("===========================================");
        System.out.println("| Maintenant je vais compter les voyelles |");
        System.out.println("===========================================");
        System.out.println("Entrez un mot: ");
        mot = sc.nextLine().toLowerCase();
        for (char a : mot.toCharArray()) {
            nbVoyelles = (VOYELLES.indexOf(a) >= 0) ? (nbVoyelles + 1) : nbVoyelles;
        }
        System.out.printf("Il y a %d voyelle(s) dans %s.\n", nbVoyelles, mot);
        return test;
    }
}
