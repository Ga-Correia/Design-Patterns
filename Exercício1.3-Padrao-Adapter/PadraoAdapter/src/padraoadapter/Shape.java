package padraoadapter;
public class Shape {
    protected int x, y, height, width;
    public Shape(){
        this.x=20;
        this.y=25;
        this.height=40;
        this.width=46;
    }
    public int getX(){ 
        return x; 
    }
    public int getY(){
        return y; 
    }
    public int getHeight(){
        return height; 
    }
    public int getWidth(){
        return width; 
    }
}
