public class Main {
    public static void main(String[] args) {
//        Circle circle = new Circle(45);
//        System.out.println(circle.getArea());
//        System.out.println(circle.getPerimetr());
//
//        Triangle triangle = new Triangle(45,78,34);
//        System.out.println(triangle.getArea());
//        System.out.println(triangle.getPerimetr());
//
//        Figure c2 = new Circle(67);
//        System.out.println(c2.getArea());
//        System.out.println(c2.getPerimetr());

        Tigre tigre = new Tigre("Rest", "Бенгальский", 20, 80, 50);
        tigre.Go();
        tigre.Eat();
        tigre.Print();
        tigre.Sleep();

        System.out.println();

        Snake snake = new Snake("Robert", "Питон", 5, 10);
        snake.Go();
        snake.Eat();
        snake.Print();
        snake.Sleep();

        Point<Integer> point1 = new Point<>(4,8);
        Point<Double> point2 = new Point<>(6.5, 8.9);
    }
}
