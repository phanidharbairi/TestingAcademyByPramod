import java.util.Scanner;
import java.util.Random;

public class main{
    public static void main(String[] args) {
        Scanner s1 =  new Scanner(System.in);
        Random r = new Random();
        int rows;
        int columns;
        int randomNumber = r.nextInt(1, 101);
//        char symbol;

        System.out.print("Enter the no. of rows: ");
        rows = s1.nextInt();
        System.out.print("Enter the no. of columns: ");
        columns = s1.nextInt();
//        System.out.print("Enter the symbol to be in the matrix: ");
//        symbol = s1.next().charAt(0);

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(randomNumber);
            }
            System.out.println();
        }

        s1.close();
    }
}
