package ex_Functions;

import java.util.Scanner;

public class Lab_003_Leap_fix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int year;

        System.out.print("Enter a year: ");

        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter year in integer format.");
            sc.next(); // discard invalid input
            System.out.print("Enter a year: ");
        }

        year = sc.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is Not a Leap Year");
        }

        sc.close();
    }
}
