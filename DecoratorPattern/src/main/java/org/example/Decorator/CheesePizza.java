package org.example.Decorator;

import org.example.Base.Pizza;

public class CheesePizza extends DecoratorPizza{
   public CheesePizza(Pizza pizza)
   {
       super(pizza);
   }

    @Override
    public int cost() {
        return basePizza.cost()+50;
    }
}
