package org.example;

import java.util.Scanner;

public class Logique {

        public static  void Notes(){
            //initailisation d'un tableau avec le nombre de resultat attantant
            int[] tab = new int[10];
            Scanner sc = new Scanner(System.in);
            //tant que la boucle est inférrieure au tableau souhaiter je continue
            for(int i=0;i<10;i++){
                //j'affiche les r
                System.out.println("Note n° " +i);
                int valeur = sc.nextInt();
                tab[i] =  valeur;
            }
            for(int i=0;i<tab.length;i++){
                System.out.println(tab[i]);
            }
        }
    }

