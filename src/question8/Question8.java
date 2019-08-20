package question8;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String gen = input.nextLine();
        int age = input.nextInt();
        if (gen.equals("female") && age >= 1 && age <= 58) {
            System.out.println("8.2%");
        } else if (gen.equals("female") && age >= 59 && age <= 100) {
            System.out.println("9.2%");
        } else if (gen.equals("male") && age >= 1 && age <= 58) {
            System.out.println("8.4%");
        } else if (gen.equals("male") && age >= 59 && age <= 100) {
            System.out.println("10.5%");
        } else {
            System.out.println("Invalid input !Error");
        }
        input.close();
    }

}
