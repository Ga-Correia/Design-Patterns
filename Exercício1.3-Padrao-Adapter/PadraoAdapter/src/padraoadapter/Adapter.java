package padraoadapter;
public class Adapter extends Shape{
    RasterBox raster = new RasterBox();
    public Adapter(){
        super();
    }
    public int getX(){
        Coords BRcoords = raster.getBottomRight();
        BRcoords.x = 55;
        x = BRcoords.x;
        return x; 
    }
    public int getY(){
        Coords BRcoords = raster.getBottomRight();
        BRcoords.y = 60;
        y = BRcoords.y;
        return y; 
    }
    public int getHeight(){
        Coords TLcoords = raster.getTopLeft();
        TLcoords.y = 73;
        height = TLcoords.y;
        return height; 
    }
    public int getWidth(){
        Coords TLcoords = raster.getTopLeft();
        TLcoords.x = 77;
        width = TLcoords.x;
        return width; 
    }
}
