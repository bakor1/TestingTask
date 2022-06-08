import java.util.*;
import java.util.regex.Pattern;

public class Service {

    public static boolean isNumeric(String string) {
        String regex = "[0-9]+[\\.]?[0-9]*";
        return Pattern.matches(regex, string);
    }

    public static void compareNumber(double number) {
        if (number > 7) {
            System.out.println("Привет\n");
        }
    }

    public static void compareName(String name) {

        String forCompare = "вячеслав";

        if (name.compareToIgnoreCase(forCompare) == 0) {
            System.out.println("Привет, Вячеслав\n");
        } else {
            System.out.println("Нет такого имени\n");
        }
    }

    public static void multiplicitySearch(ArrayList<Integer> array) {

        ArrayList<Integer> arrOutput = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 3 == 0) {
                arrOutput.add(array.get(i));
            }
        }
        System.out.println("Исходный массив: " + array);
        System.out.println("Элементы кратные трём: " + arrOutput + "\n");
    }
}