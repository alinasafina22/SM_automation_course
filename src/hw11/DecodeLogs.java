package hw11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DecodeLogs {

    public static void main(String[] args) throws IOException {
        StringBuilder logs = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader("/Users/AZharkevich/IdeaProjects/SM_automation_course/src/hw11/logs.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                logs.append(line).append("\n");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Теперь переменная content содержит все строки из файла
        String text = logs.toString();
        getTimeAndMessage(text);
        System.out.println(replaceTimeToUnknown(text));
    }

    public static void getTimeAndMessage(String logs){
        String matchRegexp = ".*(\\d{2}:\\d{2}:\\d{2}\\.\\d{3}).* : (.*)";
        Pattern pattern = Pattern.compile(matchRegexp);
        Matcher matcher = pattern.matcher(logs);
        while (matcher.find()) {
            System.out.printf("Время - %s, сообщение: %s \n", matcher.group(1), matcher.group(2));
        }
    }

    // задание 3
    // заменить все отметки времени (не даты) на строку "<time unknown>"
    public static String replaceTimeToUnknown(String logs){
        String timeRedexp = "\\d{2}:\\d{2}:\\d{2}\\.\\d{3}";
        logs = logs.replaceAll(timeRedexp, "<time unknown>");
        return logs;
    }

    // задание 2
    //провалидировать каждую полученную строку на наличие блока даты, времени и класса

}
