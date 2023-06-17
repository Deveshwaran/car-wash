/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carwashmanagementsystem;

/**
 *
 * @author User
 */
public class Service2 extends WashType {
    public double serviceprice;
 
    public double CalcServicePrice(String vehiType){
        if(vehiType.equals("Sedan")){
            serviceprice = 15.0;
        }
        else if(vehiType.equals("SUV")){
            serviceprice = 18.0;
        }
        else if(vehiType.equals("Van")){
            serviceprice = 20.0;
        }
        
        return serviceprice;
    }
    public void servicetype(){
        System.out.println("Dashboard Cleaning");
    }
}
