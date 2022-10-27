package com.company;

public class Person {
    private String adress;
    private String name;
    private String surname;
    private int age;
    private int weight;

    public Person(String adress, String name, String surname, int age, int weight) {
        this.adress = adress;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "School" +
                " adress " + adress +" " +
                ", name " + name + " " +
                "  , surname " + surname + '\'' +
                ", age" + age +
                ", weight" + weight;
    }
}
