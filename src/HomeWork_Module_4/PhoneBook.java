package HomeWork_Module_4;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    private String lastName;
    private String name;
    private String numberPhone;
    private int day;
    private int month;
    private int year;

    String nln;
    String phone;
    String dayOfBirth;

    ArrayList dm1 = new ArrayList();

    public void addInforamtion(String lastName, String name, String numberPhone, short day, short month, short year){
        nln = lastName + " " + name;
        phone = numberPhone;
        dayOfBirth = day + " " + month + " " + year;

        dm1.add(nln);
        dm1.add(phone);
        dm1.add(dayOfBirth);
    }
}
