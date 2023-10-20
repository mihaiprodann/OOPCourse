
public abstract class GeometricalForm implements FormOperations {
    protected int xCoord;
    protected int yCoord;
    protected String iColor;
    protected String fColor;

    public GeometricalForm(int x,int y){
        xCoord=x;
        yCoord=y;
    }

    public int getxCoord() {
        return xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    public String getFormColor() {
        return fColor;
    }

    public String getInnerColor() {
        return iColor;
    }
}
