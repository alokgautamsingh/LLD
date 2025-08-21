package org.example.Product;

public class DeluxeBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Deluxe Burger getting prepared");
    }
}
