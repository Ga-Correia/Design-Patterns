package singleton;
public class RasterBox {
    private Coords topLeft, bottomRight;
    public RasterBox(){
        this.topLeft = new Coords();
        this.bottomRight = new Coords();
    }
    public Coords getTopLeft(){
        return topLeft;
    }
    public Coords getBottomRight() {
        return bottomRight;
    }
}
