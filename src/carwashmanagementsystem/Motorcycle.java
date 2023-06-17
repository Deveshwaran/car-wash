/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carwashmanagementsystem;

/**
 *
 * @author User
 */
public class Motorcycle implements Vehicle{

    private double discount = 0.10;
    public double calculatePrice(double baseprice, double totalprice){
        totalprice = baseprice;
        return totalprice;
    }

    /**
     * @return the discount
     */
    public double getDiscount() {
        return discount;
    }
}
