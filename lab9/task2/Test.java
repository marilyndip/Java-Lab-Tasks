
package lab9.task2;

public class Test {
    public static void main(String[] args) {
        Point p = new Point();
        System.out.println(p);
        Point q = new Point(3,4);
        System.out.println(q);
         Line a = new Line(p,q);
         System.out.println(a+ " : Distance : "+a.getLength());
         Line b = new Line(0,0,3,4);
         System.out.println(a+ " : Distance : "+b.getLength());
    }
}
