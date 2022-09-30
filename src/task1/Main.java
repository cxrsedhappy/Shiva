package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        subtask1();
        subtask2();
        subtask3(args);
        System.out.println("[4] -------------------");
        subtask4(1);
        System.out.println();
        System.out.println("Factorial of 5 is " + subtask5(5));
    }
    public static void subtask1(){
        System.out.println("[1] -------------------");
        int[] array = new int[]{3, 2, 6, 7, 5};
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
            System.out.println("Sum at " + i + " iteration: " + sum);
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (double)sum / array.length);
    }
    public static void subtask2(){
        System.out.println("[2] -------------------");
        Scanner scan = new Scanner(System.in);
        int min = 99999999, max = 0, sum = 0, i = 0;
        do {
            int num = scan.nextInt();
            if (num < min) { min = num; }
            if (num > max) { max = num; }
            sum += num;
            i++;
        } while (i < 5);
        System.out.println("Sum: " + sum);
        System.out.println("Max number: " + max);
        System.out.println("Min Number: " + min);

    }
    public static void subtask3(String[] args){
        System.out.println("[3] -------------------");
        for (String arg : args) {
            System.out.println(arg);
        }
    }
    public static void subtask4(int num){
        if (num < 11){
            System.out.print((double)1 / num + " ");
            subtask4(num + 1);
        }
    }
    public static int subtask5(int num){
        System.out.println("[5] -------------------");
        int sum = 1;
        for (int i = 1; i <= num; i++){
            sum *= i;
        }
        return sum;
    }
}