package Module_1;

import java.util.Scanner;

public class MainClass
{
    public static void main(String[] args)
    {
        System.out.println("Введиие имя: ");
        Scanner in= new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Введиие возраст: ");
        int age = in.nextInt();
        System.out.println("Меня зовут, " + name + " мне " + age + " лет");//
    }
}
