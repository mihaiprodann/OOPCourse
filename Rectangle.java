public class Rectangle extends GeometricalForm {

    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height){
        super(x,y);
        this.width=width;
        this.height=height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void move(int x, int y) {
        this.xCoord = x;
        this.yCoord = y;
    }

    @Override
    public void shrink() {
        width--;
        height--;
    }

    @Override
    public void enlarge() {
        width++;
        height++;
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
        System.out.println("Width: " + this.width);
        System.out.println("Height: " + this.height);
        System.out.println("Inner color: " + this.iColor);
        System.out.println("Form color: " + this.fColor);
        return null;
    }
}
