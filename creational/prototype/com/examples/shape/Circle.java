package creational.prototype.com.examples.shape;

public class Circle extends Shape {

    private int radius;

    public Circle(Integer x, Integer y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    public Circle(Circle circle) {
        super(circle);
        this.radius = circle.radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", x=" + x + ", y=" + y + ", color=" + color + "]";
    }

    @Override
    public Shape clone() {
        return new Circle(this);  // Return copy of self
    }

}