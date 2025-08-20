package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        Vehicle v1 = new Baleno();
        Vehicle v2 = new Porshe();
        Vehicle v3 = new Thar();

        v1.drive();
        v2.drive();
        v3.drive();


    }
}