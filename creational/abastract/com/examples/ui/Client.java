package creational.abastract.com.examples.ui;

public class Client {
    
    public static void main(String[] args) {
        
        // Create a Victorian furniture factory
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        
        Chair victorianChair = victorianFactory.createChair();
        Table victorianTable = victorianFactory.createTable();
        Sofa victorianSofa = victorianFactory.createSofa();
        
        System.out.println("Victorian Chair: " + victorianChair);
        System.out.println("Victorian Table: " + victorianTable);
        System.out.println("Victorian Sofa: " + victorianSofa);

        // Create a Modern furniture factory
        FurnitureFactory modernFactory = new VictorianFurnitureFactory();
        
        Chair modernChair = modernFactory.createChair();
        Table modernTable = modernFactory.createTable();
        Sofa modernSofa = modernFactory.createSofa();
        
        System.out.println("Victorian Chair: " + modernChair);
        System.out.println("Victorian Table: " + modernTable);
        System.out.println("Victorian Sofa: " + modernSofa);

    }

}