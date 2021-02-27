
package lab12;


public class Rectangle extends Shape{
    private int rectangleId;
    private static int rectangleCounter;
    
    public Rectangle(double side1,double side2){
        super(side1,side2);
        rectangleCounter++;
        rectangleId = rectangleCounter;
    }
    public void setSide1(double side1){
        setDimension1(side1);
    }
    public double getSide1(){
        return getDimension1();
    }
    public void setSide2(double side2){
        setDimension2(side2);
    }
    public double getSide2(){
        return getDimension2();
    }

    public int getRectangleId() {
        return rectangleId;
    }

    public void setRectangleId(int rectangleId) {
        this.rectangleId = rectangleId;
    }

    public static int getRectangleCounter() {
        return rectangleCounter;
    }

    public static void setRectangleCounter(int rectangleCounter) {
        Rectangle.rectangleCounter = rectangleCounter;
    }
    @Override
    public String getName(){
        return "Rectangle";
    }
    
    @Override
    public double getArea(){
        return Math.PI*getSide1()*getSide2();
    }

    @Override
    public String toString() {
        return "Rectangle{" + "Sides : "+getSide1()+","+getSide2()+'}';
    }

    
}
