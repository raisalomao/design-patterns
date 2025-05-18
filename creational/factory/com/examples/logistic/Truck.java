package creational.factory.com.examples.logistic;

public class Truck implements Transport {
    
    @Override
    public void deliver() {
        System.out.println("Delivering by truck");
    }
    
}