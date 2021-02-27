
package lab8;

public class Box {
    private double width;
    private double height;
    private double depth;
    
    public Box(){
        width = 1.0;
        height = 2.0;
        depth = 3.0;
    }
    
    public Box(double len){
        width = len;
        height = len;
        depth = len;
    }
    
    public Box(double width,double height,double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    
    public Box(Box box){
        this.width = box.width;
        this.height = box.height;
        this.depth = box.depth;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public double getDepth(){
        return depth;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setDepth(double depth){
        this.depth = depth;
    }
    public void setDim(double width,double height,double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    
    
    public boolean equalTo(Box o){
        if((width == o.width) && (height == o.height) &&(depth== o.depth)){
            return true;
        }
        else{
            return false;
        }
    }
    public double Volume(){
        return width*height*depth;
    }
    @Override
    public String toString(){
        return "Box[width: " +width + ",height: "+height +",depth: "+depth+"]";
    }
}
