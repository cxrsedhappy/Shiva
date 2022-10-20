package task3;

public class Randint {
    public static void main(String[] args) {

        // Init array
        int[] array = new int[4];

        // Fill array
        for (int i = 0; i < 4; i++) {
            array[i] = 10 + (int) (Math.random() * 89);
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]){
                System.out.println("\nNot Increasing sequence");
                return;
            }
        }

        System.out.println("\nIncreasing sequence");

    }
}
