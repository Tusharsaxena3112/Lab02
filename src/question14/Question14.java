package question14;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int num1 = num;
        int rem = 0, rev = 0;
        for (int i = num; i > 0; i = i / 10) {
            rem = i % 10;
            rev = rev * 10 + rem;
        }
        if (rev == num1) {
            System.out.printf("%d is a palindrome", num1);
        } else {
            System.out.printf("%d is not a palindrome", num1);
        }
        input.close();
    }
}
