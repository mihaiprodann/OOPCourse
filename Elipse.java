public class Elipse extends GeometricalForm {
    private int hRadius;
    private int vRadius;

    public Elipse(int x, int y, int hr,  int vr){
        super(x,y);
        hRadius=hr;
        vRadius=vr;
    }

    public int getHorizRadius(){
        return  hRadius;
    }

    public int getVertRadius() {
        return vRadius;
    }

    @Override
    public void move(int x, int y) {
        this.xCoord = x;
        this.yCoord = y;
    }

    @Override
    public void shrink() {
        hRadius --;
        vRadius --;
    }

    @Override
    public void enlarge() {
        hRadius ++;
        vRadius ++;
    }

    @Override
    public void changeInnerColor(String color) {
        this.iColor=color;
    }

    @Override
    public void changeFormColor(String color) {
        this.fColor=color;
    }

    @Override
    public String toString() {
        System.out.println("Coordinates: (" + this.xCoord + ", " + this.yCoord + ")");
        System.out.println("Horizontal radius: " + this.hRadius);
        System.out.println("Vertical radius: " + this.vRadius);
        System.out.println("Inner color: " + this.iColor);
        System.out.println("Form color: " + this.fColor);
        return null;
    }
}