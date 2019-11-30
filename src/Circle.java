public class Circle extends Figure{
    private double Radius;

    public Circle(double radius) {
        Radius = radius;
    }

    public double getRadius() {
        return Radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Radius * Radius;
    }

    @Override
    public double getPerimetr() {
        return 2*Math.PI*Radius;
    }
}
