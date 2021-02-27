
package lab8;

public class TestBox {
    public static void main(String[] args) {
        Box b1 = new Box();
        System.out.println(b1+" => Volume :"+b1.Volume());
        
        Box b2= new Box(4.0);
        System.out.println(b2+" => Volume : "+b2.Volume());
        
        Box b3 = new Box(4.0,5.0,7.0);
        System.out.println(b3+" => Volume: "+b3.Volume());
        
        Box b4 = new Box(b3);
        System.out.println(b4+ " => Volume : "+b4.Volume());
        
        System.out.println("Are b1 and b2 equal? "+b1.equalTo(b2));
        System.out.println("Are b3 and b4 equal? "+b3.equalTo(b4));
    }
}
