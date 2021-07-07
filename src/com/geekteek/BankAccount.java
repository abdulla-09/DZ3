package com.geekteek;

public class BankAccount {

    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
        System.out.println("Ваш счет: " + amount);
    }

    public void withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("У вас не достаточно срецтв на щёте", amount);
        } else {
            amount -= sum;
            System.out.println("У вас сщёта снято " + sum + " осталось на щёте " + amount);
        }
    }
}
