package hw_3;

import java.util.Random;
import java.util.Scanner;

//Задание 3.2. Угадайка.
//        Пишем игру угадайка. В приложении описаны все возможные значения цветов радуги.
//        При запуске приложение случайно выбирает одно из значений как "загаданное".
//        Далее - сообщите пользователю о том, что ему необходимо угадать один из цветов,
//        выведите все доступные цвета в консоль, и получите ввод пользователя из консоли.
//        Сравните без учета регистра введенное пользователем значения с реально загаданным.
//        Выведите в консоль результат сравнения, в формате "[результат игры]: 'boolean_value'".
//        (по возможности в консольных выводах используем String.format())
public class GuessWhat {
    public static String[] rainbow = {"красный", "оранжевый", "желтый", "зеленый", "голубой", "синий", "фиолетовый"};
    public static void main(String[] args) {
        String randomColor = randomSelectColor();
        printRainbowColor();
        String userColor = getUserAssume();
        if (compareColor(randomColor,userColor)){
            System.out.println("Вы победили!");
        }
        else {
            System.out.println("Вы проиграли:(");
        }
    }

    public static String randomSelectColor(){
        Random random = new Random();
        int number = random.nextInt(7);
        return rainbow[number];
    }

    public static void printRainbowColor(){
        System.out.println("Игра Угадайка");
        System.out.println("Выберите цвет радуги из списка ниже");
        System.out.println(String.join(", ", rainbow));
    }

    public static String getUserAssume(){
        Scanner input = new Scanner(System.in);
        return input.next();
    }

    public static boolean compareColor(String selectColor, String userColor){
        selectColor = selectColor.toLowerCase();
        userColor = userColor.toLowerCase();
        return selectColor.equals(userColor);
    }

}
