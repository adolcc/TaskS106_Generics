package level2.exercise2;

public class GenericMethods {


    @SafeVarargs
    public final <T> void printVariableArguments(T... items) {

        System.out.println("--- Printing Variable Arguments ---");

        if (items.length == 0) {
            System.out.println("No arguments provided.");
            return;
        }

        for (int i = 0; i < items.length; i++) {
            System.out.println("Item " + (i + 1) + ": " + items[i]);
        }

        System.out.println("---------------------------------");
    }

}
