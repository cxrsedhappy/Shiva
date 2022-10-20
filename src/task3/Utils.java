package task3;

import java.util.Arrays;
import java.util.Random;

public class Utils {
    public static void main(String[] args) {
        // Create Random object
        Random random = new Random();

        // Fill array with random numbers
        int[] array = new int[10];

        // Random variation of random numbers
        for (int i = 0; i < 5; i++){
            array[i] = random.ints(1, 100).findFirst().getAsInt();
        }

        // Math.random() variation of random numbers
        for (int i = 5; i < 10; i++){
            array[i] = 1 + (int)(Math.random() * 100);
        }

        // Output array
        for (int i : array){
            System.out.print(i + " ");
        }

        // Sorting
        System.out.println();
        Arrays.sort(array);

        // Output array with sorting
        for (int i : array){
            System.out.print(i + " ");
        }


    }
}
