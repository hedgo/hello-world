package com.hedgo.allpatterns.structual.decorator;

public class CheesePizza extends PizzaDecorator{

    public CheesePizza(Item item) {
        super(item);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Cheese");
    }
}
