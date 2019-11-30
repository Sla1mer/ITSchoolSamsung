public class Triangle extends Figure{
    private double a,b,c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public double getArea() {
        double pp = getPerimetr()/2;
        return Math.sqrt(pp*(pp-a)*(pp-b)*(pp-c));
    }

    @Override
    public double getPerimetr() {
        return a+b+c;
    }
}
