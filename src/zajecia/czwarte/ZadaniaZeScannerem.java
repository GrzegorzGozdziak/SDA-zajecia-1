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

        //compareThreeNumbersFromUser();
        //int[] array = {1, 2, 3, 4, 5, 6, 7};
        //System.out.println("MIN from array: "+min(array));
        //System.out.println("MAX from array: "+max(array));

        //double avg = avgOfGrades();
        //System.out.println("Your AVG is equal: " + avg);
        int calculator = calculator();
        System.out.println("Twoj wynik to: "+calculator);


    }
    public static int calculator() {
        System.out.println("Kalkulator - dostepne opcje:");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnozenie");
        System.out.println("4. Dzielenie");
        int action = getNumberFromUser("Podaj numer dzialania, ktore chcesz wykonac:");
        int number1 = getNumberFromUser("Podaj pierwsza liczbe: ");
        int number2 = getNumberFromUser("Podaj druga liczbe: ");
        if(action == 1) {
            return number1 + number2;
        } else if(action == 2) {
            return number1 - number2;
        } else if(action == 3) {
            return number1*number2;
        }else {
            if(number2 == 0 ){
                System.out.println("Nie dzielimy przez 0!");
                return 0;
            } else {
                return number1/number2;
            }
        }
    }

    public static double avgOfGrades() {
        int size = getNumberFromUser("How many grade U want to avg?");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = getNumberFromUser("Insert " + (i + 1) + " grade");
        }
        return Zajecia4.avg(array);
    }

    public static void compareThreeNumbersFromUser() {
        String[] message = {"Insert first number", "Insert second number", "Insert third number"};
        System.out.println("Insert three numbers and I will show U which is max and min...");
        int number1 = getNumberFromUser(message[0]);
        int number2 = getNumberFromUser(message[1]);
        int number3 = getNumberFromUser(message[2]);
        System.out.println("Max: " + max(number1, number2, number3));
        System.out.println("Min: " + min(number1, number2, number3));
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int max(int a, int b, int c) {
        int[] array = {a, b, c};
        return max(array);
    }

    public static int min(int a, int b, int c) {
        int[] array = {a, b, c};
        return min(array);
    }

    public static void listNumberFromUser() {
        int number = getNumberFromUser();
        Zajecia4.printLessThan(number);
    }

    public static int getNumberFromUser() {
        return getNumberFromUser("Please insert some number");
    }

    public static int getNumberFromUser(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }


    public static void checkNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert some number:");
        int numberFromUser = getNumberFromUser();
        if (Zajecia4.isEven(numberFromUser)) {
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

        System.out.println("U R: " + name + " " + lastname);
    }
}
