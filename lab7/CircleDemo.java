package lab7;

public class CircleDemo {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Radius : " + c1.getRadius());
        System.out.println("Color: " + c1.getColor());
        System.out.printf("Area : %.2f\n", c1.getArea());
        System.out.println();
        
        Circle c2 = new Circle(2.0);
        System.out.println("Radius : " + c2.getRadius());
        System.out.println("Color: " + c2.getColor());
        System.out.printf("Area : %.2f\n", c2.getArea());

        System.out.println();
        Circle c3 = new Circle(5.0, "blue");
        System.out.println("Radius : " + c3.getRadius());
        System.out.println("Color: " + c3.getColor());
        System.out.printf("Area : %.2f\n", c3.getArea());

        System.out.println();

    }
}
