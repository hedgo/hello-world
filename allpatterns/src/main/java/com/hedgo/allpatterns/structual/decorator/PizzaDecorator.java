package com.hedgo.allpatterns.structual.decorator;

abstract public class PizzaDecorator implements Item {

    private Item item;

    public PizzaDecorator(Item item) {
        this.item = item;
    }

    public void prepare() {
        item.prepare();
    }
}
