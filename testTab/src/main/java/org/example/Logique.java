package org.example;

import java.util.Scanner;

public class Logique {
    public  static void Nbr(){
    int[] tab = new int[4];
        System.out.println("veuillez entrer un nombre");
    Scanner  scan = new Scanner(System.in);

    for(int i=0;i<4;i++){
        //System.out.println(i);
        int foo = scan.nextInt();
        tab[i]=foo;
    }
    for (int i=0;i<tab.length;i++){
        System.out.println(tab[i]);
    }
}
}