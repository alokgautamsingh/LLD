package org.example;

import org.example.Base.Pizza;
import org.example.Base.Veg;
import org.example.Decorator.CheesePizza;
import org.example.Decorator.PaneerPizza;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        //ekdum simple basic veg pizza
        Pizza basicveg = new Veg();
        System.out.println("price of simple veg is "+ basicveg.cost());

        //veg with cheese
        Pizza cheesePizza = new CheesePizza(basicveg);
        System.out.println("price of veg with cheese is "+ cheesePizza.cost());

        //veg with Paneer
        Pizza paneerPizza = new PaneerPizza(basicveg);
        System.out.println("price of veg with paneer is "+paneerPizza.cost());

        //veg with paneer and cheese
        Pizza paneerandcheese1 = new CheesePizza(paneerPizza);
        System.out.println("price of veg with paneer and cheese1 "+ paneerandcheese1.cost());

        Pizza paneerandcheese2 = new PaneerPizza(cheesePizza);
        System.out.println("price of veg with paneer and cheese2 "+ paneerandcheese2.cost());



    }
}