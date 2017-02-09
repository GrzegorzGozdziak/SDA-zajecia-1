package zajecia.osme;

import zajecia.siodme.Zajecia7;

/**
 * Created by RENT on 2017-02-09.
 */
public class Zajecia8 {
    public static void main(String[] args) {
//        System.out.println(factorialUpdate(-4));
//        System.out.println(fibonacciNumber(0));
//        System.out.println(fibonacciNumberUpdate(0));
//        System.out.println(fibonacciNumber(1));
//        System.out.println(fibonacciNumberUpdate(1));
//        System.out.println(fibonacciNumber(2));
//        System.out.println(fibonacciNumberUpdate(2));
//        System.out.println(fibonacciNumber(3));
//        System.out.println(fibonacciNumberUpdate(3));
//        System.out.println(fibonacciNumberUpdate(4));
//        System.out.println(fibonacciNumberUpdate(5));

//        String message = "AlA mA kotA";
//        System.out.println(switchCase(message));
//        System.out.println(switchCaseWithBulider(message));

//        int number = 12345;
//        System.out.println(sumOfDigitsFromNumber(number));
//        System.out.println(sumOfDigitsFromNumberUpdate(number));

        String message = "Ala ma kota";
        String expression = "Ala";
        System.out.println(startsWith1(message, expression));
        System.out.println(startsWith2(message, expression));
        System.out.println(startsWith3(message, expression));

    }

    

    public static boolean startsWith1(String message, String expression){
        return message.startsWith(expression);
    }

    /*
    * Can trow exeption
    */
    public static boolean startsWith2(String message, String expression){
        return message.substring(0,expression.length()).equals(expression);
    }

    public static boolean startsWith3(String message, String expression){
        boolean flag = true;
        char[] messageArray = message.toCharArray();
        char[] expressionArray = expression.toCharArray();
        for (int i = 0; i < expressionArray.length; i++) {
            if(messageArray[i] != expressionArray[i]){
                flag = false;
            }
        }
        return flag;
    }

    public static int sumOfDigitsFromNumberUpdate(int number){
        String numberAsString = String.valueOf(number);
        return Zajecia7.sumFromString(numberAsString);
    }

    public static int sumOfDigitsFromNumber(int number){
        // suma cyfr w liczbie
         int sum = 0;
         while(number != 0){
             sum += number%10;
             number /= 10;
         }
         return sum;
     }


    public static String switchCase(String message){
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i] >=65 && charArray[i] <=90){
                charArray[i] += 32;
            } else if(charArray[i] >= 97 && charArray[i] <= 122){
                charArray[i] -=32;
            }
        }
        return String.valueOf(charArray);
    }

    public static String switchCaseWithBulider(String message){
        StringBuilder stringBulider = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char tmp = message.charAt(i);
            if(tmp >=65 && tmp <=90){
                stringBulider.append((char)(tmp + 32));
            } else if(tmp >= 97 && tmp <= 122) {
                stringBulider.append((char)(tmp - 32));
            } else {
                stringBulider.append(tmp);
            }
        }
        return stringBulider.toString();
    }

    public static long fibonacciNumberUpdate(int index) {
        //rekurencyjnie
        if (index < 0) {
            return -1;
        }
        if (index == 0) {
            return 0;
        }
        if (index == 1) {
            return 1;
        }
        return fibonacciNumberUpdate(index - 2) + fibonacciNumberUpdate(index - 1);
    }

    public static long fibonacciNumber(int index) {
        // 0 1 1 2 3 5 8 13
        int left = 0;
        int right = 1;
        int result = 0;
        for (int i = 1; i < index; i++) {
            result = left + right;
            left = right;
            right = result;
        }
        if(index ==1){
            result = 1;
        }
        return result;
    }

    public static long factorialUpdate(int number) {
        // metoda obliczajaca silnie rekurencyjnie
        if (number < 0){
            return -1;
        }
        if(number == 0){
            return 1;
        }
        return number * factorialUpdate(number - 1);
    }

    public static long factorial(int number) {
        // metoda obliczajaca silnie
        long tmp = 1;
        for (int i = 1; i <= number; i++) {
            tmp *= i;
        }
        return tmp;
    }
}
