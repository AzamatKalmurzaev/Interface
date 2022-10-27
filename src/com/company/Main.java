package com.company;

public class Main {

    public static void main(String[] args) {

        Girl girl = new Girl("Melnikova", "Ayday", "Kasymova", 25, 55);
        Boy boy = new Boy("Volgogradskiy prosprect", "Daniyar", "Asanov", 19, 60);
        School school = new School(boy,girl);
        System.out.println(school);
        System.out.println();
        System.out.println(girl);
        girl.biyleyt();
        girl.okuyt();
        System.out.println();
        System.out.println(boy);
        boy.oynoyt();
        boy.okuyt();






    }
}



