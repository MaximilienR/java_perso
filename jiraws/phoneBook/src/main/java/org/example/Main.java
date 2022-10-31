package org.example;

import java.util.Scanner;

public class Main {
    public  static Scanner scan =null;

    public static void main(String[] args) {

       //entré
        scan=new Scanner(System.in);

        String firstName=recuparationInfo("veuillez saisir votre nom de fammile");
        String lastnNme=recuparationInfo("veuillez saisir votre prenom");
        String phone=recuparationInfo("veuillez saisir votre numero de telephone");

        //objet
        Contact contact1= new Contact("random","smith","06666666");

       //affichage
        System.out.println("vous vous appelez "+ " " +firstName+" "+lastnNme+" "+"et votre numero de tel est le "+" "+phone);
        System.out.println(contact1);


        /*
        test controle de champs
        if (recuparationInfo(nomDeFamille)==null){
            System.out.println("veuillez remplir ce champs ");
        }*/


    }
    //appel la methode de saisi plutot que réecrie trois fois sout (c'est la factoriasation)

    public static String recuparationInfo(String info){


        System.out.println(info);
        String UserLastName=scan.nextLine();

        return UserLastName;

    }
}
