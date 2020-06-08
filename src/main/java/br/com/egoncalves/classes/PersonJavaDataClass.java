package br.com.egoncalves.classes;

// Java Way 'Data Class' - implementing manually equals, hash code and toString methods
public class PersonJavaDataClass {
    private final String name;
    private final Integer age;
    private Boolean active;

    public PersonJavaDataClass(String name, Integer age, Boolean active) {
        this.name = name;
        this.age = age;
        this.active = active != null ? active : true;
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

    public void setActive(boolean active) {
        this.active = active;
    }

    public PersonJavaDataClass copy(String name, Integer age, Boolean active){
        String cloneName =  name != null ? name : this.name;
        int cloneAge =  age != null ? age : this.age;
        boolean cloneActive = active != null ? active : this.active;

        return new PersonJavaDataClass(cloneName, cloneAge, cloneActive);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonJavaDataClass that = (PersonJavaDataClass) o;

        if (age != that.age) return false;
        if (active != that.active) return false;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + (active ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PersonJavaDataClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", active=" + active +
                '}';
    }
}

class PersonJavaDataClassMain {
    public static void main(String[] args) {
        PersonJavaDataClass personData = new PersonJavaDataClass("Fulano Java Class", 30, false);
        PersonJavaDataClass personData2 = new PersonJavaDataClass("Fulano Java Class", 30, false);

        System.out.println(personData); // PersonJavaDataClass{name='Fulano Java Class', age=30, active=false}

        // should compare content equality
        System.out.println(personData.equals(personData2)); // true

        // should compare reference equality
        System.out.println(personData == personData2); // false

        // simulate the same behavior than kotlin implementing copy method
        System.out.println(personData.copy("Novo Nome", null, null));
    }
}
