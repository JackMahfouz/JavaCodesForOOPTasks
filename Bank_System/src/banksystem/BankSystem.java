/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystem;

import Account.Account;/**
 *
 * @author Jack Mahfouz
 */
public class BankSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account account = new Account(1122,20000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        System.out.println(account.getBalance());
        account.deposit(3000);
        System.out.println(account.getBalance());
        System.out.println(account.getMounthlyInterest());
        

    }
    
}
