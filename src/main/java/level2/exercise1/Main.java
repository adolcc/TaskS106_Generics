package level2.exercise1;

public class Main {

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();

        Person person = new Person("Adolfo", "Caicaguare", 37);

        // 1. Call with a Persona, a fixed String, and an int
        System.out.println("--- Example 1: Persona, Fixed String, int ---");
        gm.printArgumentsFixed(person, "This is a fixed message", 123);

        // 2. Call with a Double, a fixed String, and a Boolean
        System.out.println("--- Example 2: Double, Fixed String, Boolean ---");
        gm.printArgumentsFixed(3.14, "Another fixed message", true);

        // 3. Call with an Integer, a fixed String, and a different Persona object
        System.out.println("--- Example 3: Integer, Fixed String, Persona ---");
        Person anotherPerson = new Person("Isabella", "Caicaguare", 13);
        gm.printArgumentsFixed(999, "Last fixed message", anotherPerson);

        // You cannot pass anything other than a String for the second argument now.
        // The following line would cause a compile-time error:
        // gm.printArgumentsFixed(10, 20, 30); // Error: argument 2 cannot be converted from int to String
    }
}

