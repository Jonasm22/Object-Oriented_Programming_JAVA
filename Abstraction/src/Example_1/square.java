package Example_1;

public class square extends Figure {

    private  double side;

    public square() {
    }

    public square(double x, double y, double side) {
        super(x, y);
        this.side = side;
    }


    @Override
    public double CalculateArea() {
        double result = side * side ;
     return  result;
    }






}
