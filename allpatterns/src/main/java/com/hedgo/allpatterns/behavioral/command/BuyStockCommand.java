package com.hedgo.allpatterns.behavioral.command;

public class BuyStockCommand implements Command {
    private Stock abcStock;

    public BuyStockCommand(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
