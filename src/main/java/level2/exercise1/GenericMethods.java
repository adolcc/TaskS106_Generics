package level2.exercise1;

public class GenericMethods {

    // A generic method where the second argument is a specific type (String).
    // Only T1 and T3 are generic type parameters.

    public <T1, T3> void printArgumentsFixed(T1 arg1, String fixedStringArg, T3 arg3) {
        System.out.println("Generic Argument 1: " + arg1);
        System.out.println("Fixed String Argument: " + fixedStringArg); // This one is always a String
        System.out.println("Generic Argument 3: " + arg3);
        System.out.println("---"); // Separator for clarity
    }

}
