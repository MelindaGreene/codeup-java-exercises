
package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape = new Rectangle(5,4);
        System.out.println((int)myShape.getArea());
        System.out.println((int)myShape.getPerimeter());
        Measurable myShape2 = new Square(5);
        System.out.println((int)myShape2.getArea());
        System.out.println((int)myShape2.getPerimeter());

    }
}


//hello world
