package level2.exercise2;

public class Main {

    public static void main(String[] args) {

        GenericMethods gm = new GenericMethods();

        System.out.println("--- Example 1: Multiple Strings ---");
        gm.printVariableArguments("Mamon", "Mango", "Cambur");

        System.out.println("--- Example 2: Multiple Integers ---");
        gm.printVariableArguments(10, 20, 30, 40, 50);

        System.out.println("--- Example 3: Multiple Persona Objects ---");
        Person person1 = new Person("Pepe", "Pepito", 30);
        Person person2 = new Person("Juan", "Perez", 25);
        Person person3 = new Person("Fito", "Paez", 12);

        gm.printVariableArguments(person1, person2, person3);


        System.out.println("--- Example 4: Single Argument (Double) ---");
        gm.printVariableArguments(99.99);


        System.out.println("--- Example 5: No Arguments ---");
        gm.printVariableArguments();
    }

}

