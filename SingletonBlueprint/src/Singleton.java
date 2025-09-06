public class Singleton {
    // Store the single instance inside a private static member variable
    private static Singleton instance;

    // The constructor must be private so no other part of the program
    // can create new instances of the class using new.
    private Singleton() {}

    // A public static method (usually named getInstance()) that checks
    // if the instance exists, and creates it if it doesn’t, then returns it.
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String ShowMessage() {
        return "Hello, I am a singleton!";
    }
}