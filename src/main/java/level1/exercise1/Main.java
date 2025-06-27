package level1.exercise1;

public class Main {

    public static void main(String[] args) {

        System.out.println("--- Testing with String objects ---");

        NoGenericMethods stringContainer = new NoGenericMethods("Testone", "testTwo", "TestThree");

        System.out.println("Initial items: " + stringContainer.getItem(1) + ", " +
                stringContainer.getItem(2) + ", " +
                stringContainer.getItem(3));

        stringContainer.setItem(2, "DifferentOne");

        System.out.println("After setting item 2: " + stringContainer.getItem(1) + ", " +
                stringContainer.getItem(2) + ", " +
                stringContainer.getItem(3));

        System.out.println("\n--- Testing with Integer objects ---");

        NoGenericMethods intContainer = new NoGenericMethods(3, 7, 29);
        System.out.println("Initial items: " + intContainer.getItem(1) + ", " +
                intContainer.getItem(2) + ", " +
                intContainer.getItem(3));

        intContainer.setItem(1, 100);
        System.out.println("After setting item 1: " + intContainer.getItem(1) + ", " +
                intContainer.getItem(2) + ", " +
                intContainer.getItem(3));

        System.out.println("\n--- Checking constructor argument positions ---");
        NoGenericMethods mixedOrder = new NoGenericMethods("First", 123, true);
        System.out.println("Mixed order constructor (Object types): " +
                mixedOrder.getItem(1) + ", " +
                mixedOrder.getItem(2) + ", " +
                mixedOrder.getItem(3));

    }
}


