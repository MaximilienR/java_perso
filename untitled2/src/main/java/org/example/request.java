package org.example;

import java.util.Scanner;

public class request {
    public static void getPrint(){
        Scanner scan =new Scanner(System.in);
        System.out.println("veuillez saisir une phrase");
        String phrase = scan.nextLine();
        System.out.println(phrase);
        String[] somme= phrase.split("\\s+");
        System.out.println(somme.length);
    }
}
