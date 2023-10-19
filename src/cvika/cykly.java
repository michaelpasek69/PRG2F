package cvika;

import java.util.Scanner;

public class cykly {
    public static void main(String[] args) {
//        System.out.println("Zadej čísla, ukoncis zadanim -1");
        Scanner sc =new Scanner(System.in);
        int input = sc.nextInt();
//        while (input != -1) {
//            if (input % 2 == 0) {
//                System.out.println(input);
//            }
//            input = sc.nextInt();
//        }
//        System.out.println("Zadej max cislo");
//       input = sc.nextInt();
//        for (int i = 0; i < input; i++) {
//            if (i % 2 ==0 ){
//                System.out.println(i);
//            }
        System.out.println("zadej cislo");
        input = sc.nextInt ();
        boolean prime = true;
        for (int i = 2; i <input; i++) {
            if (input % i ==0){
                prime = false;
            }
        }
        System.out.println("je prvocislo? " + prime);
    }

}

