package creational.abastract.com.examples.ui;

public class VictorianFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        System.out.println("Victorian Chair created");
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        System.out.println("Victorian Sofa created");
        return new VictorianSofa();
    }

    @Override
    public Table createTable() {
        System.out.println("Victorian Table created");
        return new VictorianTable();
    }

}