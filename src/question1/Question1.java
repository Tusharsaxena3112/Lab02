package question1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine().trim(); //method chaining
        System.out.printf("Welcome ,%s!", name);
        input.close();
    }
}
