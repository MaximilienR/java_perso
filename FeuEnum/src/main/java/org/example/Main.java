package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("veuillez entrer un nombre");
        Integer choice=scan.nextInt();
        //System.out.println(choice);
        if (choice==1) {
            System.out.println(Logique.Vert);
        }else if (choice==2){
            System.out.println(Logique.Orange);
        }else if (choice==3){
            System.out.println(Logique.Rouge);
        }else {
            /*while (choice!= 1 )
            System.out.println("veuillez choisir un autre nombre");
            Integer choice2=scan.nextInt();
*/
        }
    }
}