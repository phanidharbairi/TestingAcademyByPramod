package ex_Functions;

import java.util.Scanner;

public class Lab001 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int reversed = 0;

        for (; number!=0; number = number/10){
            int digit = number%10;
            reversed = reversed*10 + digit;
        }

        System.out.println("Reversed number= "+ reversed);
    }
}
