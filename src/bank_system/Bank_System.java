/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_system;

import StockPackage.Stock;/**
 *
 * @author Jack Mahfouz
 */
public class Bank_System {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stock stock = new Stock("JAVA", "Sun MicroSystem Inc",4.5,4.35);
        System.out.println(stock.getChangePercent());

    }
    
}
