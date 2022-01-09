/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockPackage;

/**
 *
 * @author Jack Mahfouz
 */
public class Stock {
    private String Sympole;
    private String Name;
    private double PreviousClosingPrice;
    private double CurrentPrice;
    
    public Stock(String Sympole,String Name,double PreviousClosingPrice,double CurrentPrice) {
        this.Sympole = Sympole;
        this.Name = Name;
        this.PreviousClosingPrice = PreviousClosingPrice;
        this.CurrentPrice = CurrentPrice;
    }
    private double getChange() {

        return(Math.round(((CurrentPrice-PreviousClosingPrice)/PreviousClosingPrice)*100));
    }
    public String getChangePercent() {
        return(getChange()+" %");
    }
    // public String getChangePercent() {
    //     return(toString());
    // }
    
}
