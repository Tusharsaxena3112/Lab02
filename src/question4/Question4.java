package question4;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        if (num1 > 0) {
            System.out.println("Positive");
        } else if (num1 < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
        input.close();
    }


}
