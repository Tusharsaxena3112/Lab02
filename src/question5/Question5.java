package question5;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even");
        } else if (num % 2 != 0) {
            System.out.println("Odd");
        } else {
            System.out.println("Invalid");
        }
    }
}
