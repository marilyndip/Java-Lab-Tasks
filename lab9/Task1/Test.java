
package lab9;

public class Test {
    public static void main(String[] args) {
        Stack myStack = new Stack(6);
        for (int i = 0; i < 6; i++) {
           myStack.push(i); 
        }
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        
    }
}
