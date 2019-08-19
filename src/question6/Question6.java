package question6;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch1 = input.nextLine().trim().charAt(0);
        char ch2 = input.nextLine().trim().charAt(0);
        if (ch1 > ch2) {
            System.out.println(ch2 + " " + ch1);
        } else {
            System.out.println(ch1 + " " + ch2);
        }
        input.close();
    }
}
