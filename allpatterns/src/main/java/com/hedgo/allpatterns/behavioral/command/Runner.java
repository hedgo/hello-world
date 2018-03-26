package com.hedgo.allpatterns.behavioral.command;

public class Runner {

    public static void main(String[] args) {

        //1. klasa ktorej metody zmieniamy na commendy, przez nowe klasy ponizej
        Stock stock = new Stock();

        //2. tworzymy komendy (w toolbar takie obiekty dostawalismy)
        BuyStockCommand buyStockCommand1 = new BuyStockCommand(stock);
        BuyStockCommand buyStockCommand2 = new BuyStockCommand(stock);
        BuyStockCommand buyStockCommand3 = new BuyStockCommand(stock);
        SellStockCommand sellStockCommand1 = new SellStockCommand(stock);
        SellStockCommand sellStockCommand2 = new SellStockCommand(stock);
        SellStockCommand sellStockCommand3 = new SellStockCommand(stock);

        //3. dodajemy comendy do executora
        CommandsExecutor commandsExecutor = new CommandsExecutor();
        commandsExecutor.addCommand(buyStockCommand1);
        commandsExecutor.addCommand(buyStockCommand2);
        commandsExecutor.addCommand(buyStockCommand3);
        commandsExecutor.addCommand(sellStockCommand1);
        commandsExecutor.addCommand(sellStockCommand2);
        commandsExecutor.addCommand(sellStockCommand3);

        //4. kiedy chcemy (np. pozniej w nocy) to wykonujemy komendy, executor powinien byc bezstanowy
        commandsExecutor.runAllCommands();
    }
}
