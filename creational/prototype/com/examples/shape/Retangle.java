package creational.prototype.com.examples.shape;

public class Retangle extends Shape {
    
    private int width;
    private int height;

    public Retangle(int width, int height, String color) {
        super(width, height, color);
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public Retangle(Retangle retangle) {
        super(retangle);
        this.width = retangle.width;
        this.height = retangle.height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Retangle [width=" + width + ", height=" + height + "]";
    }

    @Override
    public Shape clone() {
        return new Retangle(this);  // Return copy of self
    }

}