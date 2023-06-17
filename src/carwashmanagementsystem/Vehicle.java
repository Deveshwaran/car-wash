/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package carwashmanagementsystem;

/**
 *
 * @author User
 */
public interface Vehicle {
    
    public double tax=0.0;
    public double serviceCharge=0.0;
    public double discount=0.0;
    public double calculatePrice(double baseprice,double totalprice);
    public double getDiscount();
    
}
