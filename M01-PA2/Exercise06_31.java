import java.util.Scanner;

public class Exercise06_31 {
    // return true if the card number is valid
    public static boolean isValid(long number) {
        for (int i = 13; i <= 16; i++) {
            if (getSize(number) == i && prefixMatched(number, 4) || prefixMatched(number, 5)
                    || prefixMatched(number, 6) || prefixMatched(number, 37)) {
                if ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    // get sum of single digits
    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        String numStr = Long.toString(number);
        for (int i = numStr.length() - 2; i >= 0; i -= 2) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            sum += getDigit(digit * 2);
        }
        return sum;
    }

    // return single digit number, otherwise sum
    public static int getDigit(int number) {
        if (number < 10) {
            return number;
        } else {
            return number / 10 + number % 10;
        }

    }

    // return sum of odd place digits
    public static int sumOfOddPlace(long number) {
        int sum = 0;
        String numStr = Long.toString(number);
        for (int i = numStr.length() - 1; i >= 0; i -= 2) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            sum += digit;
        }
        return sum;
    }

    // return true is number d is a prefix for number
    public static boolean prefixMatched(long number, int d) {
        int k = getSize(d);
        long prefix = getPrefix(number, k);
        return prefix == d;
    }

    // return the number of digits in d
    public static int getSize(long d) {
        return Long.toString(d).length();
    }

    // return the first k number of digits from number. If the number of digits in
    // number is less than k, return number
    public static long getPrefix(long number, int k) {
        String numStr = Long.toString(number);
        if (numStr.length() < k) {
            return number;
        } else {
            return Long.parseLong(numStr.substring(0, k));
        }
    }

    // print whether the card number is valid or invalid (main method)
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a credit card number as a long integer: ");
            long number = input.nextLong();

            if (isValid(number)) {
                System.out.println(number + " is valid");
            } else {
                System.out.println(number + " is invalid");
            }
        }
    }
}
