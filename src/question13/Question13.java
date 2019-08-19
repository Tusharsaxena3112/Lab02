package question13;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int counter = 0;
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            System.out.printf("%d is a prime no.", num1);
        } else {
            System.out.printf("%d is not prime no.", num1);
        }
    }

}
