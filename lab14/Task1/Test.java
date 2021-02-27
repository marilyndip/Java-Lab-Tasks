
package lab14.Task1;

public class Test {
    public static void main(String[] args) {
        MovablePoint m1 = new MovablePoint(2,3,1,1);
        System.out.println(m1);
        m1.moveUp();
        m1.moveLeft();
        System.out.println(m1);
        
        MovableCircle mc = new MovableCircle(2,3,1,1,5);
        System.out.println(mc);
        mc.moveUp();
        mc.moveLeft();
        System.out.println(mc);
    }
    
    
}
