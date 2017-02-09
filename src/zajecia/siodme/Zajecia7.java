package zajecia.siodme;

import java.util.Random;

/**
 * Created by RENT on 2017-02-08.
 */
public class Zajecia7 {
    public static void main(String[] args) {

//        String randomString = randomLowerCase(50);
//        int[] statisticsFromRandomString = stringStatistics(randomString);
//        printStringStatistics(statisticsFromRandomString);

        String string = "Ala_ma_kota";
        String string2 = "Test";
        String string3 = "()((3-8)))";
        String string4 = "Ala ma 2 koty i 3 psy";

//        String convertedString = convertSpace(string);
//        System.out.println(convertedString);

//        String reversString = reversString(string);
//        System.out.println(reversString);

//        System.out.println(isPalindrome(string3));

//        int sum = sumFromString(string4);
//        System.out.println("Ala ma " + sum + " zwierzat");

        System.out.println(checkRoundBraces(string3));
    }

    public static boolean checkRoundBraces(String message) {
        int braces = 0;
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 40) {
                braces++;
            } else if (charArray[i] == 41) {
                braces--;
                if (braces < 0) {
                    break;
                }
            }
        }
        return braces == 0;
    }

    public static int sumFromString(String message) {
        char[] charArray = message.toCharArray();
        int sum = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 48 && charArray[i] < 58) {
                sum += charArray[i] - 48;
            }
        }
        return sum;
    }

    public static boolean isPalindrome(String message) {
        char[] charArray = message.toCharArray();
        boolean flag = true;
        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[charArray.length - i - 1]) {
                flag = false;
                break;
            }
        }
        return flag;
    }


    public static String reversString(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            char tmp = charArray[i];
            charArray[i] = charArray[charArray.length - 1 - i];
            charArray[charArray.length - 1 - i] = tmp;
        }
        return String.valueOf(charArray);
    }

    public static String convertSpace(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 95) {
                charArray[i] = (char) 32;
            }

        }
        return String.valueOf(charArray);
    }

    public static String randomLowerCase(int size) {
        Random random = new Random();

        //char[] array = new char[size];
        // //String tmpMessage = "";
        StringBuilder stringBulider = new StringBuilder();

        //for (int i = 0; i < array.length; i++) {
        for (int i = 0; i < size; i++) {
            int randomChar = random.nextInt(26) + 97;
            //array[i] = (char)randomChar;
            // //String generatedValueAsString = String.valueOf((char)randomChar);
            // //tmpMessage += generatedValueAsString;
            stringBulider.append((char) randomChar);
        }

        //return String.valueOf(array);
        // //return tmpMessage;
        return stringBulider.toString();
    }

    public static int[] stringStatistics(String message) {
        char[] charsArray = message.toCharArray();
        int[] statisticsArray = new int[26]; //bo chodzi o tablice małych liter
        for (int i = 0; i < charsArray.length; i++) {
            if (charsArray[i] >= 97 && charsArray[i] <= 122) {
                int index = charsArray[i] - 97;
                statisticsArray[index]++;
            }

        }
        return statisticsArray;
    }

    public static void printStringStatistics(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                System.out.print((char) (i + 97));
            }
        }
    }
}
