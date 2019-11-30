public class Tigre extends Animal {
    private double weight;
    private double height;

    public Tigre(String name, String vid, int age, double weight, double height) {
        super(name, vid, age);
        this.weight = weight;
        this.height = height;
    }

    @Override
    public void Go() {
        System.out.println("Бегаю!");
    }

    @Override
    public void Eat() {
        System.out.println("Ем мясо!");
    }
}
