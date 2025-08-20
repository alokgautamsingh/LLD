package org.example.Decorator;

import org.example.Base.Pizza;

public class MayoPizza extends DecoratorPizza{

    public MayoPizza(Pizza pizza)
    {
        super(pizza);
    }

    @Override
    public int cost() {
        return basePizza.cost() + 30;
    }
}
