package zajecia.czwarte;

import java.util.Scanner;

/**
 * Created by RENT on 2017-02-04.
 */
public class ZadaniaZeScannerem {
    public static void main(String[] args) {
        //scannerExample();
        //checkNumberFromUser();
        //listNumberFromUser();

        compareThreeNumbers();
    }
    public static void compareThreeNumbers() {
        //compare 3 numbesr
        //show max
        // show min
        System.out.println("Insert three numbers and I will show U which is max and min...");
        int number1 = getNumberFromUser();
        int number2 = getNumberFromUser();
        int number3 = getNumberFromUser();
        System.out.println("Max: "+max(number1,number2, number3));
        System.out.println("Min: "+min(number1,number2, number3));
    }

    public static int max(int a, int b, int c){
        if(a >= b && a >= c){
            return a;
        } else if(b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static int min(int a, int b, int c){
        if(a <= b && a <= c){
            return a;
        } else if(b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void listNumberFromUser(){
        int number = getNumberFromUser();
        Zajecia4.printLessThan(number);
    }

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert some number:");
        return scanner.nextInt();
    }

    public static void checkNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert some number:");
        int numberFromUser = getNumberFromUser();
        if(Zajecia4.isEven(numberFromUser)) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

    }

    public static void scannerExample() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert Your name:");
        String name = scanner.nextLine();
        System.out.println("Please insert Your last name:");
        String lastname = scanner.nextLine();

        System.out.println("U R: "+name+" "+lastname);
    }
}
