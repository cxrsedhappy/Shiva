package task1;

public class Main {
    public static void main(String[] args) {
        subtask1();

        int num = subtask5(6); // 120
        System.out.println(num);
    }
    public static void subtask1(){
        int[] myArray = new int[]{3, 5, 6, 23, 12, 65, 33, 69, 322, 228};

        // Part with "for"
        int sumOfArrayNum = 0;
        for (int i : myArray) {
            sumOfArrayNum += i;
        }
        System.out.println("for: " + sumOfArrayNum);

        // Part with "while"
        sumOfArrayNum = 0;
        int i = 0;
        while (i < myArray.length) {
            sumOfArrayNum += myArray[i];
            i++;
        }
        System.out.println("while: " + sumOfArrayNum);

        // Part with "do while"
        sumOfArrayNum = 0;
        i = 0;
        do {
            sumOfArrayNum += myArray[i];
            i++;
        } while (i < myArray.length);
        System.out.println("do while: " + sumOfArrayNum);
    }
    public static void subtask2(){
        System.out.println("asd");
    }
    public static void subtask3(){
        System.out.println("zxc");
    }
    public static void subtask4(){
        System.out.println("zxc");
    }
    public static int subtask5(int num){
        int sum = 1;
        for (int i = 1; i < num; i++){
            sum *= i;
        }
        return sum;
    }
}