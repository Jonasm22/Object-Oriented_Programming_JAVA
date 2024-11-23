package Example_1;

public abstract class Figure {

    protected  double x;  // Position in X
    protected  double y; // Position in Y

    protected Figure() {
    }

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract  double CalculateArea();



}
