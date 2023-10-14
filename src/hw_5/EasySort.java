package hw_5;

import java.util.Arrays;
import java.util.Random;

public class EasySort {

    public static void main(String[] args) {
        int[] array = generateArray();
        System.out.println(Arrays.toString(bubbleSort(array)));
    }

    public static int[] generateArray() {
        Random random = new Random();
        int[] array = new int[50000];
        for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(500);
        }
        return array;
    }

    public static int[] bubbleSort(int[] array){
        int buffer;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    buffer = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buffer;
                }
            }
        }
        return array;
    }
}
