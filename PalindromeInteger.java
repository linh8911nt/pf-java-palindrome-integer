import java.util.Scanner;

public class PalindromeInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();
        int reverseNumber = reverse(number);

        System.out.println("Number :" + number);
        System.out.println("Reverse Number: " + reverseNumber);
        if (number == reverseNumber)
            System.out.println("Number is symmetric number");
        else
            System.out.println("Number is not symmetric number");
    }

    public static int reverse(int number) {
        int reverseNumber = 0;
        int digit;
        while (number % 10 != 0) {
            digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
            number = number / 10;
        }
        return reverseNumber;
    }
}
