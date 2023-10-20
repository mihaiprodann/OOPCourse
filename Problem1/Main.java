public class Main {
    public static void main(String[] args) {

        Elipse elipse = new Elipse(11, 24, 33, 41);

        System.out.println(elipse);

        elipse.move(68, 65);
        elipse.shrink();
        elipse.enlarge();
        elipse.changeInnerColor("green");
        elipse.changeFormColor("black");

        System.out.println("--------------Final stats-----------------");
        System.out.println(elipse);
        System.out.println("----------------------------------------------");


        System.out.println("\n\n\nRectangle\n");
        Rectangle rectangle = new Rectangle(40, 50, 60,70);

        System.out.println(rectangle);


        rectangle.move(6, 6);
        rectangle.shrink();
        rectangle.enlarge();
        rectangle.changeInnerColor("purple");
        rectangle.changeFormColor("cyan");

        System.out.println("--------------Final stats-----------------");
        System.out.println(rectangle);
        System.out.println("----------------------------------------");

    }
}