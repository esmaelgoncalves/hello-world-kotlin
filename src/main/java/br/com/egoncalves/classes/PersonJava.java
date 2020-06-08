package br.com.egoncalves.classes;

public class PersonJava {
    private final String name;
    private final Integer age;
    private final Boolean active;

    public PersonJava(String name, Integer age, Boolean active) {
        this.name = name;
        this.age = age;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isActive() {
        return active;
    }
}

class PersonJavaMain {
    public static void main(String[] args) {
        PersonJava person = new PersonJava("Fulano Java", 30, true);
        PersonJava person2 = new PersonJava("Fulano Java", 30, true);

        System.out.println(
                "Person(name: " + person.getName()
                        + ", age: " + person.getAge()
                        + ", active: " + person.isActive() + ")"); //Person(name: Fulano Java, age: 30, active: true)

        System.out.println(person); // br.com.egoncalves.classes.PersonJava@7852e922

        // should compare content equality
        System.out.println(person.equals(person2)); // false

        // should compare reference equality
        System.out.println(person == person2); // false
    }
}
