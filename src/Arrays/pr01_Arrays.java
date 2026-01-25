package Arrays;

public class pr01_Arrays {
    public static void main(String[] args) {

        int[] a = {10, 45, 85, 63, 1};

        if (a.length != 0) {

            int min = a[0];
            int max = a[0];

            for (int i = 1; i < a.length; i++) {

                if (a[i] > max) {
                    max = a[i];
                }

                if (a[i] < min) {
                    min = a[i];
                }
            }

            System.out.println("Maximum value: " + max);
            System.out.println("Minimum value: " + min);

        } else {
            System.out.println("Array is empty. Cannot proceed.");
        }
    }
}
