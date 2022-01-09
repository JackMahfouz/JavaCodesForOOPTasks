/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

/**
 *
 * @author Jack Mahfouz
 */
public class Account {

   
    private int ID;
    private double balance;
    private double annualInterestRate;

    public Account() {
        this.ID = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
    }
    public Account(int id, double initialBalance) {
        this.ID = id;
        this.balance = initialBalance;
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    private double getMounthlyInterestRate() {
        return ((annualInterestRate/100)/12);
    }

    public void withdraw(double ammount) {
        this.balance = this.balance - ammount;
    }

    public void deposit(double ammount) {
        this.balance = this.balance + ammount;
    }
    public double getMounthlyInterest() {
        return (balance*getMounthlyInterestRate());
    }
}
