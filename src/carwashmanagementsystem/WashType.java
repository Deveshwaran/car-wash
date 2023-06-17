/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carwashmanagementsystem;

/**
 *
 * @author User
 */
abstract public class WashType {
    protected double serviceprice;
    
    protected double CalcServicePrice(String vehiType){
        return 0;
    }
    protected double CalcServicePrice(String polishtype,String vehiType){
        return 0;
    }
    
    abstract protected void servicetype();
}
