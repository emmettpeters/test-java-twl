package shapes;

public class ShapesTest {
    public static void main (String[] args){
        Rectangle one = new Rectangle(6,12);
        System.out.println(one.getArea());

        Square two = new Square(6);
        System.out.println(two.getArea());
        System.out.println(two.getPerimeter());
    }
}
