package task3;

import java.util.Scanner;

public class Gorillaz {
    public static void main(String[] args) {

        // Init scanner and n
        Scanner scan = new Scanner(System.in);
        int n;

        // Checker
        do { n = scan.nextInt(); }
        while (n < 0);

        // Init two arrays
        int[] arrayOne = new int[n];
        int[] arrayTwo = new int[n / 2];

        // Fill array woth random numbers
        for (int i = 0; i < n; i++){
            arrayOne[i] = (int) (Math.random() * n);
            System.out.print(arrayOne[i] + " ");
        }

        System.out.println();

        // Fill second array with even numbers
        for (int i = 0; i < n; i++){
            if (i % 2 == 0) {
                arrayTwo[i / 2] = arrayOne[i];
                System.out.print(arrayOne[i] + " ");
            }
        }

    }
}
