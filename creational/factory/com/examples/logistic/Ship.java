package creational.factory.com.examples.logistic;

public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivering by ship");
    }
    
}