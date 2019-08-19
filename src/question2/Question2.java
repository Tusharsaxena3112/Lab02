package question2;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String first = input.nextLine().trim();
        String second = input.nextLine().trim();
        System.out.printf("%s University %s ", first, second);
        input.close();

    }

}
