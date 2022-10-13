package org.example;

public class Table {
    public static void getReq() {
        int[] array1={1,10,5};
        for (int i: array1){
            System.out.println(i);
        }
        int total =0;
        for (int i=0; i<array1.length;i++){
            total+=array1[i];
            System.out.println(total);
        }
        float moyenne =(float) total/array1.length;
        System.out.println("la moyen est de "+" "+ moyenne);
        System.out.println("le plus petit est "+Math.min(total.array);
    }


}
