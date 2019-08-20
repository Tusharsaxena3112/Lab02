package question11;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        int end = input.nextInt();
        int m;
        if (start % 2 != 0) {
            m = start + 1;
        } else {
            m = start;
        }
        for (int i = m; i <= end; i = i + 2) {
            System.out.println(i);
        }
        input.close();
    }
}
