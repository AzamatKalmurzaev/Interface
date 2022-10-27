package com.company;

public class Girl extends Person implements Biyleyt,Okuyt{


    public Girl(String adress, String name, String surname, int age, int weight) {
        super(adress, name, surname, age, weight);
    }

    @Override
    public void biyleyt() {
        System.out.println(getName() + " Biyleyt");



    }

    @Override
    public void okuyt() {
        System.out.println(getName() + " Okuyt");

    }
}
