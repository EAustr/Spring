package rvt;
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "euros";
    }
    // Savieno divus maciņus kopā
    public Money plus(Money addition){
        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;
        if (newCents >= 100){
            newEuros += 1;
            newCents -= 100;
        }
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }
    // Salīdzina kurš maciņš ir lielāks
    public boolean less(Money less){
        int newEuros = this.euros - less.euros;
        int newCents = this.cents - less.cents;
        if (newCents < 0){
            newEuros -= 1;
            newCents += 100;
        }
        Money newMoney = new Money(newEuros, newCents);
        if (newMoney.euros < 0){
            return false;
        }
        return false;
    }
    // Atņem no viena maciņa otru
    public Money minus(Money minus){
        int newEuros = this.euros - minus.euros;
        int newCents = this.cents - minus.cents;
        if (newCents < 0){
            newEuros -= 1;
            newCents += 100;
        }
        if (newEuros < 0){
            newEuros = 0;
            newCents = 0;
        }
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }
}