package com.hedgo.allpatterns.creational.builder;

public class BankAccount {

    private String first_name;
    private String last_name;

    private BankAccount() { }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private BankAccount bankAccount = new BankAccount();

        public Builder setFirst_name(String first_name) {
            bankAccount.first_name = first_name;
            return this;
        }

        public Builder setLast_name(String last_name) {
            bankAccount.last_name = last_name;
            return this;
        }

        public BankAccount build() {
            return bankAccount;
        }
    }
}
