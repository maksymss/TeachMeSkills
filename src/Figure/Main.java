package Figure;

public class Main {
    public static void main(String[] args) {
        Figure[] figure =
                {
                new Rectangle(5, 10),
                new Triangle(8, 13, 8),
                new Circle(15)
                };
        for(Figure shape: figure) {
            System.out.println(shape.getName() + " area is: " + shape.getArea());
            System.out.println();
            System.out.println(shape.getName() + " perimeter is: " + shape.getPerimeter());
            System.out.println();

        }
        System.out.println("The sum of all perimeters is: " + figure[0].getPerimeter() +
                                                              figure[1].getPerimeter() +
                                                              figure[2].getPerimeter());
    }
}
