package Figure;

public class Circle extends Figure {
    private double radius;
    private String name = "Circle";

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
        public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
    @Override
    public double getPerimeter() {
    double p = 2 * Math.PI * radius;
    return p;
    }

    public double getRadius() {
        return radius;
    }
    @Override
    public String getName() {
        return name;
    }
}
