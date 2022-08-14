package padraoprototype;
public abstract class Prototipo implements Cloneable{
    protected int area;
    abstract int getArea();
    abstract void createFigura();
    public Object clone()
    {
        Object clone = null;
        try
        {
            clone = super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return clone;
    }
}
