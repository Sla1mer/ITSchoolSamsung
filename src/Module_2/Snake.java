package Module_2;

public class Snake extends Animal implements Slepeable, Printable {
    private double length;

    public Snake(String name, String vid, int age, double length) {
        super(name, vid, age);
        this.length = length;
    }

    @Override
    public void Go() {
        System.out.println("Ползу!");
    }

    @Override
    public void Eat() {
        System.out.println("Ем мышей!");
    }

    @Override
    public void Print() {
        System.out.println(name+" "+vid+" "+age+" "+length);
    }

    @Override
    public void Sleep() {
        System.out.println("Сплю калачиком!");
    }
}
