package org.afpa.UI;

import org.afpa.tool.Exos;

import java.util.Scanner;

public class Menu {
    public static void init() {
        Scanner scanner = new Scanner(System.in);
        String ret;
        boolean encore = true;
        do {
            System.out.println("==============================================");
            System.out.println("|| Choisissez un exo (1 ou 2) 0 pour quitter ||");
            System.out.println("|| 1: les triangles");
            System.out.println("|| 2: les voyelles");
            System.out.println("|| 0: quitter");
            ret = scanner.nextLine();
            switch (ret) {
                case "1":
                    Exos.afficheTriangle();
                    break;
                case "2":
                    Exos.compteVoyelles();
                    break;
                case "0":
                    System.out.println("===========================================");
                    System.out.println("|            Merci et à bientôt           |");
                    System.out.println("===========================================");
                    encore= false;
                    break;
                default:
                    System.out.println("entrez une valeur correct");
                    break;

            }
        } while (encore);


    }
}
