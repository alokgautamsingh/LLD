package org.example.Decorator;

import org.example.Base.Pizza;

public class PaneerPizza extends DecoratorPizza{

    public PaneerPizza(Pizza pizza)
    {
        super(pizza);
    }

    @Override
    public int cost() {
        return basePizza.cost()+100;
    }
}
