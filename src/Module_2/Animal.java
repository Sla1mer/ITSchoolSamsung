package Module_2;

public abstract class Animal {
    protected String name;
    protected String vid;
    protected int age;

    public Animal(String name, String vid, int age) {
        this.name = name;
        this.vid = vid;
        this.age = age;
    }
    abstract public void Go();
    abstract public void Eat();
}
