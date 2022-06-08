import java.util.*;

public class Main {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            // Переменная для номера команды из меню управления
            int command = 0;

            // Командное меню управления через консоль
            do {
                try {
                    System.out.println("Выберите алгоритм:");
                    System.out.println("1 - Если введенное число больше 7, то вывести “Привет”.");
                    System.out.println("2 - Если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести \"Нет такого имени\".");
                    System.out.println("3 - На входе есть числовой массив, необходимо вывести элементы массива кратные 3.");
                    System.out.println("4 - Выход.");
                    command = scanner.nextInt();

                    switch (command) {
                        case (1):
                            System.out.println("Введите число:");
                            scanner.nextLine();
                            String[] number = scanner.nextLine().split(" ");
                            if (number.length > 1) {
                                System.out.println("Введите одно число!\n");
                            } else if (Service.isNumeric(number[0])) {
                                double numberOut = Double.parseDouble(number[0]);
                                Service.compareNumber(numberOut);
                            } else
                                System.out.println("Вы ввели не число!\n");
                            break;
                        case (2):
                            System.out.println("Введите имя:");
                            scanner.nextLine();
                            String[] name = scanner.nextLine().split(" ");
                            if (name.length > 1) {
                                System.out.println("Имя должно состоять из одного слова!\n");
                            } else Service.compareName(name[0]);
                            break;
                        case (3):
                            System.out.println("Введите элементы массива, разделяя их пробелами:");
                            scanner.nextLine();
                            String[] array = scanner.nextLine().split("\\s+");
                            ArrayList<Integer> arrInput = new ArrayList<>();
                            for (int i = 0; i < array.length; i++) {
                                if (Service.isNumeric(array[i])) {
                                    try {
                                        arrInput.add(i, Integer.parseInt(array[i]));
                                    } catch (NumberFormatException nfe) {
                                        System.out.println("Массив должен содержать целые числа!\n");
                                        break;
                                    }
                                } else {
                                    System.out.println("Массив должен содержать целые числа!\n");
                                    break;
                                }
                            }
                            if (arrInput.size() == array.length) {
                                Service.multiplicitySearch(arrInput);
                            }
                            break;
                        case (4):
                            break;
                        default:
                            System.out.println("Неверный код команды!\n");
                            break;
                    }
                } catch (InputMismatchException ex) {
                    System.out.println("Неверный код команды!\n");
                    scanner.next();
                }

            } while (command != 4);
        }

    }
}
