package hw_4;

import java.util.Random;

//Сгенерировать 2 двухмерных массива случайных элементов, каждый размером 5 на 5,
// генерируемые значения лежат в диапазоне от 0 до 5 включительно.
// В цикле последовательно сравнить каждый из элементов из обоих массивов (с одинаковыми индексами),
// вывести в консоль оба элемента и результат сравнения в виде текстового значения "равны / не равны"
// на каждой итерации цикла.
// Пример вывода: "Элемент по индексу [4][2] из 1го массива: '4', из 2го массива: '5', результат сравнения: 'не равны'"
// Приветствуется использование тернарного выражения.
public class ArrayGenerator {

    public static void main(String[] args) {
        int[][] a = generateArray();
        int[][] b = generateArray();
        isArraysEquals(a, b);
    }
    public static int[][] generateArray() {
        Random random = new Random();
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(6);
            }
        }
        return array;
    }

    public static void isArraysEquals(int[][] a, int[][] b) {
        String result;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                result = (a[i][j]==b[i][j]) ? String.format("Элемент по индексу [%s][%s] из 1го массива: '%s', , из 2го массива: '%s', результат сравнения: 'равны'",
                        i, j, a[i][j],b[i][j] ) :
                        String.format("Элемент по индексу [%s][%s] из 1го массива: '%s', , из 2го массива: '%s', результат сравнения: 'не равны'",
                                i, j, a[i][j],b[i][j] );
                System.out.println(result);
                }
            }
        }
    }
