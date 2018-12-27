package com.company;

public class Student {
    String surname;
    String name;
    String patronymic;
    String birthdate;

    Student(String surname, String name, String patronymic, String birthdate){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthdate = birthdate;
    }

    public Student(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    //void say(String str) {
    //    System.out.println(str);
    //}



}
