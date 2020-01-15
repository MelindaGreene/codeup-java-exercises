package shapes;

public class Square extends Quadrilateral{
    public Square(double side) {
        super(side, side);
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
        return 4 * super.length;
    }

    @Override
    public double getArea() {
        return super.length * super.width;
    }
}

//hello world
