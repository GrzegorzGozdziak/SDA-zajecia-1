package zajecia.piate;

/**
 * Created by RENT on 2017-02-06.
 */
public class Zajecia5 {


    public static void triangle(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void square(int number) {
        for (int i = 0; i < number; i++) { //wiersze
            for (int j = 0; j < number; j++) { //kolumny
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void tree(int number) {
        //numer wiersza
        for (int i = 0; i < number; i++) {
            //petla wyswietlajaca spacje
            for (int k = 0; k < (number - i); k++) {
                System.out.print(" ");
            }
            //petla wyswietlajaca gwiazdki
            for (int j = 0; j < (i * 2) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //rysujemy korzen o wysokosci number
        for (int l = 0; l < number; l++) {
            for (int m = 0; m <= (number - 1); m++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }

    public static void oneMatrix(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == j) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void evenMatrix(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        triangle(3);
//        square(5);
//        tree(3);
//        oneMatrix(4);
//        evenMatrix(4);
    }
}
