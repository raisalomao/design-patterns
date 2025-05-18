package creational.singleton.com.examples.database;

public class Database {

    private static Database instance;

    private Database() {
        // Private constructor to prevent instantiation
    }

    // static {
    //     // Static block to initialize the instance
    //     Database.instance = new Database();
    // }

    // public static Database getInstance() {
    //     return instance;
    // }

    public static synchronized Database getInstance() {
        if (instance == null)
            instance = new Database();
        return instance;
    }

    public void connect() {
        System.out.println("Connected to the database.");
    }

    public void disconnect() {
        System.out.println("Disconnected from the database.");
    }
    
}