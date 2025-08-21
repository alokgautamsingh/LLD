package org.example.Factory;

import org.example.Product.*;

public class KingsFactory implements Factory{

    @Override
    public Burger createBurger(String type) {
        if(type=="Classic")
            return new ClassicWheatBurger();
        else if(type == "Deluxe")
            return new DeluxeWheatBurger();
        else
            return null;

    }

    @Override
    public GarlicBread createGarlic(String type) {
        if(type=="Classic")
            return new ClassicWheatGarlic();
        else if(type == "Deluxe")
            return new DeluxegarlicBread();
        else
            return null;
    }
}
