
package lab12;

public class Circle extends Shape{
    private int circleId;
    private static int circleCounter;
    
    public Circle(double radius){
        super(radius,radius);
        circleCounter++;
        circleId = circleCounter;
    }
    
    public void setRadius(double radius){
        setDimension1(radius);
        setDimension2(radius);
    }
    public double getRadius(){
        return getDimension1();
    }

    public int getCircleId() {
        return circleId;
    }

    public void setCircleId(int circleId) {
        this.circleId = circleId;
    }

    public static int getCircleCounter() {
        return circleCounter;
    }

    public static void setCircleCounter(int circleCounter) {
        Circle.circleCounter = circleCounter;
    }
    @Override
    public String getName(){
        return "Circle";
    }
    
    @Override
    public double getArea(){
        return Math.PI*getRadius()*getRadius();
    }

    @Override
    public String toString() {
        return "Circle{" + "Radius : " + getRadius() + '}';
    }
    
}
