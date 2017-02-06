package zajecia.piate;

import zajecia.czwarte.ZadaniaZeScannerem;

import java.util.Random;

/**
 * Created by RENT on 2017-02-06.
 */
public class Zajecia5 {

    public static void main(String[] args) {
//        triangle(3);
//        square(5);
//        tree(3);
//        oneMatrix(4);
//        evenMatrix(4);
//        System.out.println(sumOfNumbersFromUser());
//        System.out.println(arrayFromNumbersFromUser());
//        printArray(arrayFromNumbersFromUser());
        Random random = new Random();
        int stepsToWin = game(random.nextInt(100));
        System.out.println("U WIN! Ilość kroków: "+stepsToWin);
    }

    public static int[] arrayFromNumbersFromUser() {
        int[] tmpArray = new int[100];
        int size = 0;
        boolean flag = true;
        while(flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser("Insert next number");
            if(numberFromUser != 0) {
                tmpArray[size] = numberFromUser;
                size++;
            } else {
                flag = false;
            }
        }
        return revriteArray(tmpArray, size);
    }

    public static int game(int number) {
        int steps = 0;
        boolean flag = true;
        while(flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser("Podaj kolejną liczbę: ");
            steps++;
            if(number == numberFromUser) {
                flag = false;
            } else if (number < numberFromUser) {
                System.out.println("Podałeś zbyt dużą liczbę");
            } else {
                System.out.println("Podałeś zbyt małą liczbę");
            }
        }
        return steps;
    }

    public static int[] revriteArray(int[] bigArray, int size) {
        int [] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = bigArray[i];
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int sumOfNumbersFromUser() {
        int sum = 0;
        boolean flag = true;
        while(flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser("Insert next number");
            if(numberFromUser != 0) {
                sum += numberFromUser;
            } else {
                flag = false;
            }
        }
        return sum;
    }

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


}
