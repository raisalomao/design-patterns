package creational.singleton.com.examples.database;

public class Client {

    public static void main(String[] args) {
        // Get the singleton instance of Database
        Database db1 = Database.getInstance();
        db1.connect();

        // Get another reference to the singleton instance
        Database db2 = Database.getInstance();
        db1.disconnect();

        // Check if both references point to the same instance
        System.out.println("Are both instances the same? " + (db1 == db2));
    }
    
}