package Figure;

public class Triangle extends Figure {

    private double sideA;
    private double sideB;
    private double sideC;

    private String name = "Triangle";

    public Triangle (double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
    double area = (sideA + sideB)/2;
    return area;
    }
    @Override
    public double getPerimeter(){
        double p = (sideA + sideB + sideC);
        return p;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }
    @Override
    public String getName() {
        return name;
    }
}
