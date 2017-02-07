package zajecia.szoste;

import zajecia.czwarte.ZadaniaZeScannerem;

/**
 * Created by RENT on 2017-02-07.
 */
public class Zajecia6 {
    public static void main(String[] args) {
//        System.out.println("Number of steps: "+sumUntil(10));
//        System.out.println("Number of steps: "+avgUntil(2));
//        calculator();
//        System.out.println(cezarCode("Wojna"));
//        System.out.println(cezarCode("Hello World"));
        System.out.println(decodeCezarCode("Xpkob", 1));

    }

    public static String decodeCezarCode(String coddedMessage) {
        return cezarCode(coddedMessage, -1);
    }

    public static String decodeCezarCode(String coddedMessage, int key) {
        char[] charArray = coddedMessage.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (charArray[i] - key);
        }
        return String.valueOf(charArray);
    }

    public static String cezarCode(String message) {
        return cezarCode(message, 1);
    }

    public static String cezarCode(String message, int key) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (charArray[i] + key);
        }
        return String.valueOf(charArray);
    }


    public static void calculator() {
        boolean flag = true;
        while (flag) {
            System.out.println("1. Dodawanie");
            System.out.println("2. Odejmowanie");
            System.out.println("3. Mnożenie");
            System.out.println("4. Dzielenie");
            System.out.println("0. Koniec");
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser("Podaj działanie");
            int firstNumber = 0;
            int secondNumber = 0;
            if (numberFromUser > 0 && numberFromUser <= 4) {
                firstNumber = ZadaniaZeScannerem.getNumberFromUser("Podaj pierwszą liczbę");
                secondNumber = ZadaniaZeScannerem.getNumberFromUser("Podaj drugą liczbę");
            }
            switch (numberFromUser) {
                case 1:
                    System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
                    break;
                case 2:
                    System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
                    break;
                case 3:
                    System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
                    break;
                case 4:
                    if (secondNumber == 0) {
                        System.out.println("Nie dzielimy przez zero!");
                    } else {
                        System.out.println(firstNumber + " / " + secondNumber + " = " + ((double) firstNumber / secondNumber));
                    }
                    break;
                case 0:
                    System.out.println("Koniec");
                    flag = false;
                    break;
                default:
                    System.out.println("Podano złą wartość");
                    break;
            }
            System.out.println();
            System.out.println();
        }
    }

    public static int sumUntil(int number) {
        int steps = 0;
        int sum = 0;
        boolean flag = true;
        while (flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser();
            sum += numberFromUser;
            steps++;
            if (sum > number) {
                flag = false;
            }
        }
        return steps;
    }

    public static int avgUntil(int number) {
        int steps = 0;
        int avg = 1;
        int sum = 0;
        boolean flag = true;
        while (flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser();
            steps++;
            sum += numberFromUser;
            if ((double) sum / steps > number) {
                flag = false;
            }
        }
        return steps;
    }
}
