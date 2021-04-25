package com.company;
/*
Created by Akbala SE-2005
i made 4 tasks in one program
 */
public class Main {

    public static void main(String[] args) {
        MyLinkedList Students = new MyLinkedList();
        Students.add("Akbala", 0);
        Students.add("Amina", 1);
        Students.add("Alisher", 2);
        Students.add("Dias", 3);
        Students.remove(3);
        Students.reverse();
        for (int i = 0; i < Students.getSize(); i++) {
System.out.println(Students.get(i));


        }
        System.out.println(Students.find("Alisher"));
    }
}

