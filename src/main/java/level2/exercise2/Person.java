package level2.exercise2;

public class Person {

    private String name;
    private String lastName;
    private int age;

    public Person(String name, String lastName, int age) {

        this.name = name;
        this.lastName = lastName;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }


}
