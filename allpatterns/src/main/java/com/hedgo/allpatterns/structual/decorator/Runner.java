package com.hedgo.allpatterns.structual.decorator;

public class Runner {

    public static void main(String[] args) {

        Item pizzaFinal = new CheesePizza(new MashroumsPizza(new MashroumsPizza(new Pizza())));

        pizzaFinal.prepare();
    }
}
