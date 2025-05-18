package creational.factory.com.examples.logistic;

public class RoadLogistic extends LogisticFactory {

    @Override
    public void planDelivery() {
        System.out.println("Planning delivery by road");
    }

    @Override
    public void createTransport() {
        new Truck();
        System.out.println("Creating a truck for road transport");
    }
    
}