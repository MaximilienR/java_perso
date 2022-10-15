package org.example;

public class Logique {
    public  static void Tab(){
        int max=0;
        //creation d'un tableau 2 dimansion
   Integer[][] nbr={
           {22,12,18,56,1},
           {26,99,5,6,74},
           {77,45,68,78,98}
   };
   //parcourir et afficher le tableau
   for (Integer[]tab:nbr){
       for (Integer i:tab){
           System.out.println(i+"\t");
           //System.out.println("la valeur de max est egal à" + max);
           //System.out.println("la valeur de i est egal à" + i);
            if(i >max)
               max=i;


       }
       //espace
       System.out.println("\n");
       System.out.println("le plus grand nom est égale à " + max);
      // System.out.println(nbr[1][1]);
   }
    }
}
