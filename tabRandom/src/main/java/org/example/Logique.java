package org.example;

import java.util.Scanner;

public class Logique {
    public static void Tab(){
        Scanner scan = new Scanner(System.in);
        System.out.println("veuillez entrer un nombre");
        Integer nbr= scan.nextInt();
        int[] array =  new int[nbr] ;
        for(int i = 0; i < array.length; i++)
        {int complet=(int) (Math.random()*10);
            System.out.println(complet);
            //int complet2=array.length*2;
            System.out.println(array.length);

         }
    }
}
