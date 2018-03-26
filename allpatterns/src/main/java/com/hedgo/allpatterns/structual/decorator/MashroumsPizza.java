package com.hedgo.allpatterns.structual.decorator;

public class MashroumsPizza extends PizzaDecorator {

    public MashroumsPizza(Item item) {
        super(item);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Mashroums");
    }
}
