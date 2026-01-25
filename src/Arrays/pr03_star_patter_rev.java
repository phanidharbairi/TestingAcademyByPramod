package Arrays;

import java.util.Scanner;

public class pr03_star_patter_rev {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n = s.nextInt();

        for (int i = n; i > 0; i--) {

            // 1️⃣ Print spaces
            for (int space = 0; space < n - i; space++) {
                System.out.print("  ");
            }

            // 2️⃣ Print stars
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            // 3️⃣ New line
            System.out.println();
        }
    }
}