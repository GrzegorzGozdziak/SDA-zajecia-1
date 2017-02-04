package zajecia.czwarte;

import java.util.Scanner;

/**
 * Created by RENT on 2017-02-04.
 */
public class ZadaniaZeScannerem {
    public static void main(String[] args) {
        //scannerExample();
        checkNumberFromUser();
    }

    public static void checkNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert some number:");
        int number = scanner.nextInt();
        if(Zajecia4.isEven(number)) {
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
