
package lab14.Task1;

public class MovableCircle implements Movable{
    int radius;
    MovablePoint center;
    
    public MovableCircle(int x,int y,int xSpeed,int ySpeed,int radius){
        center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }
            
    @Override
    public void moveUp(){
        center.y = center.y + center.ySpeed;
    }
    @Override
    public void moveDown(){
         center.y = center.y - center.ySpeed;
    }
    @Override
    public void moveLeft(){
         center.x = center.x - center.xSpeed;
    }
    @Override
    public void moveRight(){
        center.x = center.x + center.xSpeed;
    }

    @Override
    public String toString() {
        return "MovableCircle{" + "radius=" + radius + ", center=" + center.x + ","+center.y+'}';
    }
    
}
