package question12;
//This is actually ques 13.

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rem;
        int sum = 0;
        int num = input.nextInt();
        for (int i = num; i > 0; i = i / 10) {
            rem = i % 10;
            sum += rem;
        }
        System.out.println(sum);
        input.close();
    }

}
