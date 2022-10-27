package com.company;

public class Boy extends Person implements OInoit,Okuyt{
    public Boy(String adress, String name, String surname, int age, int weight) {
        super(adress, name, surname, age, weight);
    }

    @Override
    public void oynoyt() {
        System.out.println(getName() + " Oynoyt");

    }

    @Override
    public void okuyt() {
        System.out.println(getName() + " Okuyt");

    }
}
