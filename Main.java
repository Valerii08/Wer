package com.company;



import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Student st1 = new Student("Иванов", "Иван", "Иванович", "01.02.2001");
        String Student_1 = st1.surname + " " + st1.name + " " + st1.patronymic + " " + st1.birthdate;
        System.out.println(Student_1);
        System.out.println();

        Student st2 = new Student("Петров", "Петр", "Иванович", "05.02.2001");
        String Student_2 = st2.surname + " " + st2.name + " " + st2.patronymic + " " + st2.birthdate;
        System.out.println(Student_2);

        Student st3 = new Student("Сергеев", "Сергей", "Игоревич", "11.04.2000");
        String Student_3 = st3.surname + " " + st3.name + " " + st3.patronymic + " " + st3.birthdate;
        System.out.println(Student_3);

        Student st4 = new Student("Усик", "Степан", "Романович", "15.12.2000");
        String Student_4 = st4.surname + " " + st4.name + " " + st4.patronymic + " " + st4.birthdate;
        System.out.println(Student_4);

        Student st5 = new Student("Филатов", "Алексей", "Страхович", "21.08.2001");
        String Student_5 = st5.surname + " " + st5.name + " " + st5.patronymic + " " + st5.birthdate;
        System.out.println(Student_5);

        Student st6 = new Student("Курочка", "Оксана", "Федоровна", "22.07.2000");
        String Student_6 = st6.surname + " " + st6.name + " " + st6.patronymic + " " + st6.birthdate;
        System.out.println(Student_6);

        Student st7 = new Student("Степанюк", "Анна", "Ивановна", "06.07.2001");
        String Student_7 = st7.surname + " " + st7.name + " " + st7.patronymic + " " + st7.birthdate;
        System.out.println(Student_7);

        Student st8 = new Student("Вакула", "Татьяна", "Олеговна", "01.02.2001");
        String Student_8 = st8.surname + " " + st8.name + " " + st8.patronymic + " " + st8.birthdate;
        System.out.println(Student_8);

        Student st9 = new Student("Приз", "Елена", "Митрофановна", "12.09.2000");
        String Student_9 = st9.surname + " " + st9.name + " " + st9.patronymic + " " + st9.birthdate;
        System.out.println(Student_9);

        Student st10 = new Student("Богданов", "Евгений", "Васильевич", "17.10.2001");
        String Student_10 = st10.surname + " " + st10.name + " " + st10.patronymic + " " + st10.birthdate;
        System.out.println(Student_10);

        System.out.println();

        List<String> array = new ArrayList();
        array.add(Student_1);
        array.add(Student_2);
        array.add(Student_3);
        array.add(Student_4);
        array.add(Student_5);
        array.add(Student_6);
        array.add(Student_7);
        array.add(Student_8);
        array.add(Student_9);
        array.add(Student_10);
        Collections.sort(array);
        for (String item : array) {
            System.out.println(item);

        }

        Group s1 = new Group("Богданов", "Евгений", 3.45);
        Group s2 = new Group("Вакула", "Татьяна", 3.5);
        Group s3 = new Group("Иванов", "Иван", 4.45);
        Group s4 = new Group("Курочка", "Оксана", 4.35);
        Group s5 = new Group("Петров", "Петр", 4.71);
        Group s6 = new Group("Приз", "Елена", 4.65);
        Group s7 = new Group("Сергеев", "Сергей", 3.78);
        Group s8 = new Group("Степанюк", "Анна", 4.25);
        Group s9 = new Group("Усик", "Степан", 4.77);
        Group s10 = new Group("Филатов", "Алексей", 4.65);




        System.out.println();

        HashMap<String, Double> array2 = new HashMap<String, Double>();
        array2.put(s1.surname, s1.point);
        array2.put(s2.surname, s2.point);
        array2.put(s3.surname, s3.point);
        array2.put(s4.surname, s4.point);
        array2.put(s5.surname, s5.point);
        array2.put(s6.surname, s6.point);
        array2.put(s7.surname, s7.point);
        array2.put(s8.surname, s8.point);
        array2.put(s9.surname, s9.point);
        array2.put(s10.surname, s10.point);

        for (Map.Entry entry : array2.entrySet()) System.out.println(entry.getKey() + " = " + entry.getValue());
        for (String item2 : array2.keySet()) {
            if (array2.get(item2) > 4.75) {
                System.out.println();
                System.out.println(item2 + " - Староста группы  и его количество баллов = " + array2.get(item2) + ".");

            }

            }


        }
    }



