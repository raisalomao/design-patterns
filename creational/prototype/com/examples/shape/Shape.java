package creational.prototype.com.examples.shape;

public abstract class Shape {
    
    Integer x, y;
    String color;

    public Shape(Integer x, Integer y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Shape(Shape shape) {
        this.x = shape.x;
        this.y = shape.y;
        this.color = shape.color;
    }

    public abstract Shape clone();

}