package com.hedgo.allpatterns.creational.builder;

public class Runner {

    public static void main(String[] args) {

        //1. Zbudowany obiekt jest immutable, tylko z getterami dostepnymi (to jest b dobre dla obiektow DTO, bo po co cos ma je po drodze modyfikowac)

        BankAccount bankAccount = BankAccount.builder().setFirst_name("Andrew").setLast_name("Okon").build();

        System.out.println(bankAccount);

        BankAccount bankAccount2 = BankAccount.builder().setFirst_name("Andrew").build();

        System.out.println(bankAccount2);
    }
}
