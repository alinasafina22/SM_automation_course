package hw_5;

import java.util.Arrays;
import java.util.Random;

public class EasySort {

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        int[] array = generateArray();
        System.out.println(Arrays.toString(bubbleSort(array)));
        System.out.println(Arrays.toString(revertBubbleSort(array)));
        System.out.println(linearSearch(array, 434));
        System.out.println(linearSearch(array, 634));
        System.out.println(binarySearch(array, 434));
        System.out.println(binarySearch(array, 634));
        System.out.println(System.currentTimeMillis() - time);
    }

    public static int[] generateArray() {
        Random random = new Random();
        int[] array = new int[50000];
        for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(501);
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

    public static int[] revertBubbleSort(int[] array){
        int buffer;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    buffer = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buffer;
                    printArrayWithHighlight(array, j, j+1);
                }
            }
        }
        return array;
    }

    public static int linearSearch(int[] array, int searchingNumber){
        for (int i=0; i< array.length; i++){
            if (array[i] == searchingNumber){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int searchingNumber){
        array = bubbleSort(array);
        int index = -1;
        int low = 0;
        int high = array.length-1;
        while(low<=high){
            int mid = low + (high -low)/2;
            if (array[mid]<searchingNumber){
                low = mid+1;
            } else if (array[mid]>searchingNumber) {
                high = mid -1;
            } else if (array[mid] == searchingNumber) {
                index = mid;
                break;
            }
        }
        return index;
    }
    public static void printArrayWithHighlight(int[] arr, int idx1, int idx2) {
        for (int i = 0; i < arr.length; i++) {
            if (i == idx1 || i == idx2) {
                System.out.print("{" + arr[i] + "} ");
            } else {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
