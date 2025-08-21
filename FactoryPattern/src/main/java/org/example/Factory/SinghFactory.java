package org.example.Factory;

import org.example.Product.*;

public class SinghFactory implements Factory{

    @Override
    public Burger createBurger(String type) {
        if(type=="Classic")
            return new classicBurger();
        else if(type == "Deluxe")
            return new DeluxeBurger();
        else
        return null;
    }

    @Override
    public GarlicBread createGarlic(String type) {
        if(type=="Classic")
            return new ClassicgarlicBread();
        else if(type == "Deluxe")
            return new DeluxegarlicBread();
        else
            return null;
    }
}
