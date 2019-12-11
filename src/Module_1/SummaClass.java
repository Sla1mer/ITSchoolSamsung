package Module_1;

import java.util.Scanner;

public class SummaClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Создание объекта
        System.out.println("Введите а: "); // Подсказка
        int a = in.nextInt(); // Поле для ввода числа пользователю
        System.out.println("Введите b: "); // Подсказка
        int b = in.nextInt(); // Поле для ввода числа пользователю
        int s = a + b; // Создание перменной, которой хранится сумма a + b
        System.out.println(a + "+" + b + "=" + s); // Вывод на суммы на экран
    }
}
