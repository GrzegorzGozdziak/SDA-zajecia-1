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


        //calculator();
        calculateBMI();


    }

    public static void calculateBMI() {
        System.out.println("Calculate Your BMI");
        double weight = getDoubleFromUser("Please insert Your weight [in kilograms]");
        double growth = getDoubleFromUser("Please insert Your growth [in meters]");
        if(weight <= 0 || growth <= 0){
            System.out.println("WRONG data inserted!");
        } else {
            double result = weight / (growth*growth);

            double[] array = {16.0, 17.0, 18.5, 25, 30, 35, 40};
            String[] array2 = {
                    "starvation / wygłodzenie",
                    "emaciation / wychudzenie [spowodowane czesto przez ciężką chorobę]",
                    "underweight / niedowaga",
                    "correct / wartość prawidłowa",
                    "overweight / nadwaga",
                    "the first stage of obesity / I stopień otyłości",
                    "the second stage of obesity / II stopień otyłości",
                    "the third stage of obesity / III stopień otyłości [skrajna otyłość]"
            };


            System.out.println("Your BMI is: "+result);

            for (int i = 0; i < array.length; i++) {
                if(i == 0 && result < array[i]){
                        System.out.println(array2[i]);
                } else {
                    if(array[i] < result && result < array[i+1]){
                        System.out.println(array2[i+1]);
                    }
                }
            }


        }
    }

    public static void calculator() {
        System.out.println("Calculator - options list:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int action = getNumberFromUser("Please insert a number of option:");
        int result = 0;
        if (action < 0 || action > 4) {
            System.out.println("You selected the incorrect options");
        } else {
            int number1 = getNumberFromUser("Insert first number: ");
            int number2 = getNumberFromUser("Inser second number: ");
            if (action == 1) {
                result = number1 + number2;
            } else if (action == 2) {
                result = number1 - number2;
            } else if (action == 3) {
                result = number1 * number2;
            } else {
                if (number2 == 0) {
                    System.out.println("We do not divide by 0!");
                } else {
                    result = number1 / number2;
                }
            }
            System.out.println("Your result is: " + result);
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

    public static double getDoubleFromUser(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextDouble();
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
