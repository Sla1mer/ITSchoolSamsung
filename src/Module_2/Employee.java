package Module_2;

public class Employee extends Person {
    private String company;

    public Employee(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    @Override
    public String toString() {
        String li2="("+getName()+", "+getAge()+", "+company+")";
        return li2;
    }
    public String work(){
        return "Manager";
    }
}
