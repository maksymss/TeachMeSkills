package Figure;

public class Rectangle extends Figure {

    private double width;
    private double hight;
    private String name = "Rectangle";

    public Rectangle(double width, double hight) {
        this.width = width;
        this.hight = hight;
    }
    @Override
    public double getArea() {
        double area = width * hight;
        return area;
    }
    @Override
    public double getPerimeter() {
        double p = (width * hight)*2;
        return p;
    }

    public double getHight() {
        return hight;
    }

    public double getWidth() {
        return width;
    }
    @Override
    public String getName() {
        return name;
    }
}
