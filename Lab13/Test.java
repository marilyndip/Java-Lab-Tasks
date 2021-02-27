
package lab13;

public class Test {
    public static void main(String[] args) {
        Shape s1 = new Circle(7,"Blue",true);
        System.out.println("Color : "+s1.getColor());
        System.out.println("Filled : "+s1.isFilled());
        System.out.println("Area : "+s1.getArea());
        System.out.println("Perimeter : "+s1.getPerimiter());
        System.out.println();
        
        Circle c1 = (Circle)s1;
        System.out.println("Color : "+c1.getColor());
        System.out.println("Filled : "+c1.isFilled());
        System.out.println("Area : "+c1.getArea());
        System.out.println("Perimeter : "+c1.getPerimiter());
        System.out.println("Radius : "+c1.getRadius());
        System.out.println();
        
        Shape s2 = new Rectangle(4,5,"green",false);
        System.out.println("Color : "+c1.getColor());
        System.out.println("Filled : "+c1.isFilled());
        System.out.println("Area : "+c1.getArea());
        System.out.println("Perimeter : "+c1.getPerimiter());
        System.out.println();
        
        Rectangle r1 = (Rectangle)s2;
        System.out.println("Color : "+r1.getColor());
        System.out.println("Filled : "+r1.isFilled());
        System.out.println("Area : "+r1.getArea());
        System.out.println("Perimeter : "+r1.getPerimiter());
        System.out.println("Width : "+r1.getWidth());
        System.out.println("Length : "+r1.getLength());
    }
}
