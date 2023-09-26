import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected String address;
    protected int age;
    //...

    public Person(String name, String surname) {
        //...
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        //...
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
        //...
    }

    //...

    public boolean hasAge() {
        return (this.age > 0);
    }

    public boolean hasAddress() {
        return (address != null);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        age += 1;
    }

    @Override
    public String toString() {
        return (name);
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 7;
        result = prime * result + (name != null ? name.hashCode() : 0);
        result = prime * result + (surname != null ? surname.hashCode() : 0);
        result = prime * result + (address != null ? address.hashCode() : 0);
        return result;
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder person = new PersonBuilder()
                .setAge(0)
                .setSurname(this.surname)
                .setAddress(this.address);
        return person;
    }
}