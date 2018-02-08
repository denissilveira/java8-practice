package br.com.estudos.alura.java8;

public class Person {

    private String name;
    private int personId, age;

    Person() {
    }

    Person(int personId, String name, int age) {
        this.personId = personId;
        this.name = name;
        this.age = age;
    }

    public int getPersonId() {
        return personId;
    }
    public void setPersonId(int personId) {
        this.personId = personId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "[Id= " + getPersonId() + ", Name= " + getName() + ", Age= " + getAge() + "]";
    }

}