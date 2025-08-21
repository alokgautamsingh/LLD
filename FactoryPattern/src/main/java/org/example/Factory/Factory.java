package org.example.Factory;

import org.example.Product.Burger;
import org.example.Product.GarlicBread;

public interface Factory {

    public Burger createBurger(String type);

    public GarlicBread createGarlic(String type);


}
