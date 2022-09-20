/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jeremy Duncan
 */
public class Stock {
    // attributes
    private String companyName;
    private double numberOfShares;
    private double purchasePrice;
    private double currentPrice;
    
    //constructors
    public Stock() {
        companyName = "N/A";
        numberOfShares = 0.0;
        purchasePrice = 0.0;
        currentPrice = 0.0;
    }
    
        public Stock(String companyName, double numberOfShares, double purchasePrice, double currentPrice) {
        //Work in Progress
        companyName = "N/A";
        numberOfShares = 0.0;
        purchasePrice = 0.0;
        currentPrice = 0.0;
    }
        
    //behaviors
        
        
    // getters and setters

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(double numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
    
}
