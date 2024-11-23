package Example_1;

public class circle extends Figure {

    private double radio;

    public circle() {
    }

    public circle(double x, double y, double radio) {
        super(x, y);
        this.radio = radio;
    }


    @Override
    public double CalculateArea() {
        double PI = 3.14;

        double result =  PI * radio * radio;
        return result;
    }






}
