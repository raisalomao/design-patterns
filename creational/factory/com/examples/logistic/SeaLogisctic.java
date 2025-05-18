package creational.factory.com.examples.logistic;

public class SeaLogisctic extends LogisticFactory {

    @Override
    public void planDelivery() {
        System.out.println("Plan delivery by sea");
    }

    @Override
    public void createTransport() {
        new Ship();
        System.out.println("Create a ship for sea transport");
    }

}