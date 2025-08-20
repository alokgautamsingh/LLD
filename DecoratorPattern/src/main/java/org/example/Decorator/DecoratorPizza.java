package org.example.Decorator;

import org.example.Base.Pizza;

public abstract class DecoratorPizza implements Pizza {

    Pizza basePizza;
    public DecoratorPizza(Pizza basePizza)
    {
        this.basePizza = basePizza;
    }


}
