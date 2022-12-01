// Underneath is the description of the practice problem in Bosnian
/*
Napravite klasu Person koja opisuje neku osobu. Person sadrzi atribute
name (String), surname (String), age (int). Napisite konstruktor, get
i set metode, te metode toString i equals (dvije osobe su jednake ako
imaju isto ime i prezime te broj godina).
 */
public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname + ", age=" + this.age;
    }

    public boolean equals(Person p) {
        return (this.name.equals(p.name) && this.surname.equals(p.surname) && this.age == p.age);
    }
}