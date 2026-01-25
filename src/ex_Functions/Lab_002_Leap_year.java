package ex_Functions;

import java.util.Scanner;

public class Lab_002_Leap_year {
    public static void main(String[] args) {
        int year = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        if (sc.hasNextInt()) {
            year = sc.nextInt();
        } else {
            System.out.println("Invalid Input. Enter an year in integer format.");
        }

        for (int i = 1; i <= 1; i++) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println("It is a leap year");
            } else {
                System.out.println("It is not a leap year");
            }
        }
    }
}
