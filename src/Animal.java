public abstract class Animal {
    private String name;
    private String vid;
    private int age;

    public Animal(String name, String vid, int age) {
        this.name = name;
        this.vid = vid;
        this.age = age;
    }
    abstract public void Go();
    abstract public void Eat();
}
