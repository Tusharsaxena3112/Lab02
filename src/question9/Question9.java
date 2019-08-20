package question9;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char c = input.next().charAt(0);
        if ((int) c >= 65 && (int) c <= 90) {
            System.out.printf("%c", (int) c + 32);
        } else if ((int) c >= 97 && (int) c <= 122) {
            System.out.printf("%c", (int) c - 32);
        }
        input.close();
    }
}
