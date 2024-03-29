/*
============== Java Programming I ==============
Part 4
Section 1 - Introduction to object-oriented programming
Ex 1 - Your First Account


Write a program that creates an account with a balance of 100.0, deposits 20.0 in it, 
and finally prints the balance. NB! Perform all the operations in this exact order.
=================================================
*/
/* 
 * DO NOT TOUCH THIS !
 */

public class Account {

    private double balance;
    private String owner;

    public Account(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public void withdrawal(double amount) {
        this.balance = this.balance - amount;
    }

    public double saldo() {
        return this.balance;
    }

    @Override
    public String toString() {
        return this.owner + " balance: " + this.balance;
    }
}
