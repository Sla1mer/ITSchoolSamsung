package HomeWork_Module_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner in = new Scanner(System.in);

        short dateDay;
        short dateMonth;
        short dateYear;

        String[] array;

        while (true) {
            System.out.println( "1. Добавить" + " " + "2. Удалить" + "3. Показать по алфавиту" + " " + "4. Показать по дате ");
            int ot = in.nextByte();
            switch (ot){
                case 1:
                    System.out.println("Введите фамилию");
                    String lastName = in.nextLine();
                    System.out.println("Введите имя");
                    String name = in.nextLine();
                    System.out.println("Введите номер телефона в формате " + "+79114927913");
                    String numberPhone = in.nextLine();
                    System.out.println("Введите дату рождения в формате дд мм гггг");
                    dateDay = in.nextShort();
                    dateMonth = in.nextShort();
                    dateYear = in.nextShort();
                    phoneBook.addInforamtion(lastName, name, numberPhone, dateDay, dateMonth, dateYear);
                    break;

                case 2:
                    break;
                case 3:
                    array = new String[phoneBook.dm1.size()];
                    phoneBook.dm1.toArray(array);

            }
        }
    }
}
