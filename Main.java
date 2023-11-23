import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int input1 = sc.nextInt();
          int[] array = new int[input1];

          for (int i = 0; i < array.length; i++) {
              array[i] = (int) (Math.random()*input1);
              System.out.println(" " + array);
          }

          int[] pole = {4, 8, 5, 5, 1, 5, 69, 1, 5, 6, 2, 85};
          int licha = 0;
          int suda = 0;

          for (int i = 0; i < pole.length; i++) {
              if (pole[i] % 2 == 0) {
                  suda += pole[i];
              } else {
                  licha += pole[i];
              }
          }
          System.out.println("lichy: " + licha + " sudy: " + suda);

          int[] arraylist = {4,9,36,100,400};
          int[] odmocniny = new int[arraylist.length];

          for (int i = 0; i < arraylist.length; i++) {
              odmocniny[i] = (int) (Math.sqrt(arraylist[i]));
          }
          System.out.println("Odmocniny cisel: 4,9,36,100,400 jsou: " + odmocniny);
          int[] pole1 = {1, 2, 3, 4, 5, 3, 6};
          System.out.println("Zadej cislo");
          int input = sc.nextInt();
          int vyskyt = 0;

          for (int i = 0; i < pole1.length; i++) {
              if (input == pole[i]) {
                  vyskyt++;
              }
          }
          System.out.println("Cislo " + input + " se v poli vyskytuje " + vyskyt + " x ");

          int[] emptyArray = new int[10];
          int input2;

          for (int i = 0; i < emptyArray.length; i++) {
              System.out.println("Zadej číslo");
              input2 = sc.nextInt();
              for (int j = 0; j < i; j++) {
                  if (input2 > 100 || input2 <10) {
                      System.out.println("Zadávej prosím číslo od 10 do 100");
                      i--;
                  }
              }
          }
          System.out.println("Zadal jsi dostatečný počet čísel");
    }
}

