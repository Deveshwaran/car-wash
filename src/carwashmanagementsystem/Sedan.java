/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carwashmanagementsystem;

/**
 *
 * @author User
 */
public class Sedan implements Vehicle{
    
    private double tax = 0.06;
    private double discount = 0.2;
    public double calculatePrice(double baseprice, double totalprice){
        totalprice += baseprice;
        return totalprice + (totalprice*tax);
    }
    
     public double getDiscount() {
        return discount;
    }
}
