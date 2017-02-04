package zajecia;

/**
 * Created by RENT on 2017-02-04.
 */
public class Zajecia4 {
    public static void main(String[] args) {
        //int[] array = {-1, -3, 4, 5, 6, -9, 2, 6, 7, -9};
        //printLessThan(5);
        //printEvenLessThan(5);
        //sumOfLessthan(10);

        //gdy jest int:
        //System.out.println(productOfLessThan(4));
        //gdy jest void:
        //productOfLessThan(4);


        //System.out.println(celsiusToFahrenheit(23));
        //System.out.println(fahrenheitToCelsius(73.4));

        int[] array = {-1, -3, 4, 5, 6, -9, 2, 6, 7, -9};
        int[] array2 = {1, 2, 3, 4, 5, 6};

        statistics(array2);


    }

    public static void statistics(int[] array) {
        //srednia wszystkich elementow w tablicy
        System.out.println("Srednia z elementow tablicy: "+avg(array));

        //suma wszystkich elementow
        System.out.println("Suma wszystkich elementow: "+sumOfAll(array));

        //iloczyn elementow
        System.out.println("Iloczyn wszystkich elementow: "+productOfAll(array));

        //ilosc parzystych
        System.out.println("Ilosc el. parzystych: "+numberOfAllEven(array));

        //ilosc nieparzystych
        System.out.println("Ilosc el. nieparzystych: "+numberOfAllOdd(array));

    }

    public static int sumOfAllEven(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(isEven(array[i])) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static int numberOfAllOdd(int[] array) {
        int sum = numberOfAll(array) - numberOfAllEven(array);
        /*int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(!isEven(array[i])) {
                sum += array[i];
            }
        }*/
        return sum;
    }

    public static double avg(int[] array) {
        double avg = (double)sumOfAll(array)/array.length;
        return avg;
    }

    /*public static int sumOfAllEven(int[] array) {

    }

    public static int sumOfAllOdd(int[] array) {

    }*/

    public static int sumOfAll(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int numberOfAll(int[] array){
        return array.length;
    }

    public static int numberOfAllEven(int[] array){
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if(isEven(array[i])){
                counter++;
            }
        }
        return counter;
    }

    public static int productOfAll(int[] array) {
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            product *= array[i];
        }
        return product;
    }

    public static boolean isPositive(int number) {
        if(number > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEven(int number) {
        if(number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //////////////////////////////////////

    public static double fahrenheitToCelsius(double value) {
        return (value - 32) / 1.8;
    }

    public static double celsiusToFahrenheit(int value) {
        return (value * (9.0/5.0)) + 32;
    }

    public static int productOfLessThan(int number) {
        int product = 1;
        for (int i = 1; i < number; i++) {
            product *= i;
        }
        return product;
        //System.out.println(product);
    }

    public static void sumOfLessthan(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void printEvenLessThan(int number) {
        for (int i = 0 ; i < number ; i += 2) {
            System.out.println(i);
        }
    }

    public static void printLessThan(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(i);
        }
    }


///////////////////////////////////////////////




}
