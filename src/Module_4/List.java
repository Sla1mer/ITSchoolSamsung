package Module_4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class List {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(45);
        set.add(67);
        set.add(46);
        set.add(45);

        System.out.println(set);



//        LinkedList<Integer> list = new LinkedList<>();
//
//        list.add(11);
//        list.add(22);
//        list.add(33);
//        list.add(44);
//        list.add(22);
//
//        System.out.println(list);
//        System.out.println("Кол-во элементов в списке: " + list.size());
//        System.out.println("Пустой-ли список: " + list.isEmpty());
//        System.out.println("Хэш-код списка: " + list.hashCode());
//        System.out.println("Класс списка: " + list.getClass());
//        System.out.println("Список в виде строки: " + list.toString());
//
//        Iterator<Integer> iterator = list.descendingIterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next() + " ");
//        }
    }
}
