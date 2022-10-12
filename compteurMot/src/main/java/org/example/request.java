import java.util.Scanner;

public class request {
    public  static  void getPrint(){
        Scanner scan = new Scanner(System.in);
        System.out.println("veuillez entrer un nombre");
        Integer nbr= scan.nextInt();
        System.out.println("vous avez choisis le nombre" + " " + nbr);
        if (nbr%2==0){
            System.out.println("ceci est un nombre pair");
        }else
            System.out.println("cice est un nombre impaire");
    }
}
