package com.hedgo.allpatterns.behavioral.command;

public class SellStockCommand implements Command {

    private Stock abcStock;

    public SellStockCommand(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
