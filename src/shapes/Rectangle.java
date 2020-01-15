package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width) {
        super(length,width);
    }

    @Override
    public double setLength() {
        return super.length;
    }

    @Override
    public double setWidth() {
        return super.width;
    }

    @Override
    public double getPerimeter() {
        return 2 * super.length + 2 * super.width;
    }

    @Override
    public double getArea() {
        return super.length * super.width;
    }
}

//hello world
