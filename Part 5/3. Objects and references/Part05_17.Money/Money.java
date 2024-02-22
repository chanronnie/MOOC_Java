/*
============== Java Programming I ==============
Part 5
Section 4 - Objects and references
Ex 17 - Money


Implement the Money class.
=================================================
*/

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public int moneyInCents() {
        return this.euros * 100 + this.cents;
    }
    
    public Money plus(Money addition) {
        int sumEuros = this.euros + addition.euros;
        int sumCents = this.cents + addition.cents;
        return new Money(sumEuros, sumCents);
    }
    
    public boolean lessThan(Money compared) {
        return this.moneyInCents() < compared.moneyInCents();
    }   
    
    public Money minus(Money decreaser) {
        int difference = this.moneyInCents() - decreaser.moneyInCents();
        if (difference < 0) {
            return new Money(0,0);
        }

        return new Money(0, difference);
    }
}
