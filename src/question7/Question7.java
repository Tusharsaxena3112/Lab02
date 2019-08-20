package question7;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char c1 = input.next().charAt(0);
        if ((int) c1 >= 65 && (int) c1 <= 91 || (int) c1 >= 97 && (int) c1 <= 122) {
            System.out.println("Alphabet");
        } else if ((int) c1 >= 48 && (int) c1 <= 57) {
            System.out.println("Digit");
        } else {
            System.out.println("special character");
        }
    }
}
