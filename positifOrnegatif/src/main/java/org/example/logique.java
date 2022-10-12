package org.example;

import java.util.Scanner;

public class logique {
    public static void getPrint() {
        Scanner scan = new Scanner(System.in);
        System.out.println("saisir un nombre");
        Integer nombre =scan.nextInt();
        System.out.println(nombre);
        if (nombre<0){System.out.println("ce nombre est négatif ");}
        else
        System.out.println("ce nombre estr positif");
    }
}
