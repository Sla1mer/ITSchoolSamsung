public class intCircle<T> {
    private T R;

    public intCircle(T r) {
        R = r;
    }

    public double Area(){
        return Math.PI*(double)R*(double)R;
    }

    public double Perimetr(){
        return Math.PI*2*(double)R;
    }
}
