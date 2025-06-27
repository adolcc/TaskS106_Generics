package level1.exercise2;

public class Main {

    public static void main(String[] args) {

        GenericMethods gm = new GenericMethods();

        System.out.println("--- Example 1: Persona, String, int ---");

        Person person1 = new Person("Adolfo", "Caicaguare", 37);

        gm.printArguments(person1, "Hello Generics!", 123);

        System.out.println("--- Example 2: Double, Boolean, String ---");

        gm.printArguments(3.14, true, "Another example");

        System.out.println("--- Example 3: All Strings ---");

        gm.printArguments("First", "Second", "Third");

        System.out.println("--- Example 4: int, Persona, String ---");

        Person person2 = new Person("Isabella", "Caicaguare", 13);

        gm.printArguments(22, person2, "Mixed Order!");

    }


}
