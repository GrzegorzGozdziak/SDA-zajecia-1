package zajecia.czwarte;

import java.util.Scanner;

/**
 * Created by RENT on 2017-02-04.
 */
public class ZadaniaZeScannerem {
    public static void main(String[] args) {
        //scannerExample();
        //checkNumberFromUser();
        listNumberFromUser();
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
