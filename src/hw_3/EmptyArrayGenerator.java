package hw_3;

import java.util.Random;

public class EmptyArrayGenerator {

    public static void main(String[] args) {
        printArray(generateArray());

    }

    public static int[] generateArray(){
        Random random = new Random();
        int[] array = new int[random.nextInt(4, 16)];
        return array;
    }

    public static void printArray(int[] array){
        for (int element: array) {
            System.out.println(element);
        }
    }
}
