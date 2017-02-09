package zajecia.osme;

/**
 * Created by RENT on 2017-02-09.
 */
public class Zajecia8 {
    public static void main(String[] args) {
//        System.out.println(factorialUpdate(-4));
        System.out.println(fibonacciNumber(0));
        System.out.println(fibonacciNumberUpdate(0));
        System.out.println(fibonacciNumber(1));
        System.out.println(fibonacciNumberUpdate(1));
        System.out.println(fibonacciNumber(2));
        System.out.println(fibonacciNumberUpdate(2));
        System.out.println(fibonacciNumber(3));
        System.out.println(fibonacciNumberUpdate(3));
        System.out.println(fibonacciNumberUpdate(4));
        System.out.println(fibonacciNumberUpdate(5));
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
