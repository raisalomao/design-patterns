package creational.prototype.com.examples.shape;

public class Client {

    public static void main(String[] args) {

        Shape circle = new Circle(10, 20, "red", 5);

        // // ((Circle) circle).setRadius(100);
        // //     // when u change in the original the clone also changes

        Shape clonedCircle = circle.clone();
    
        System.out.println("Original Circle: " + circle.toString());
        System.out.println("Cloned Circle: " + clonedCircle.toString());

        Shape retangle = new Retangle(10, 20, "blue");

        // ((Retangle) retangle).setWidth(1230);
            // when u change in the original the clone also changes

        Shape clonedRetangle = retangle.clone();
    
        System.out.println("Original Retangle: " + retangle.toString());
        System.out.println("Cloned Retangle: " + clonedRetangle.toString());

    }
    
}