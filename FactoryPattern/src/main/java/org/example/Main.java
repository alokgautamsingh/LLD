package org.example;

import org.example.Factory.Factory;
import org.example.Factory.KingsFactory;
import org.example.Factory.SinghFactory;
import org.example.Product.Burger;
import org.example.Product.GarlicBread;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        Factory  kings1 = new KingsFactory();
        Burger burger1 = kings1.createBurger("Classic");
        GarlicBread garlic1 = kings1.createGarlic("Deluxe");

        burger1.prepare();
        garlic1.prepare();

        Factory  singh1 = new SinghFactory();
        Burger burger2 = singh1.createBurger("Classic");
        GarlicBread garlic2 = singh1.createGarlic("Deluxe");

        burger2.prepare();
        garlic2.prepare();

    }
}