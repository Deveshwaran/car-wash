/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carwashmanagementsystem;

/**
 *
 * @author User
 */
public class VehicleFactory {
    public Vehicle getVehiType(String type){
        Vehicle obj = null;
        
        if(type.equals("Sedan")){
            obj = new Sedan();
        }
        else if(type.equals("SUV")){
            obj = new SUV();
        }
        else if(type.equals("Van")){
            obj = new Van();
        }
        else if(type.equals("Motorcycle")){
            obj = new Motorcycle();
        }
        else {
            System.out.println("Invalid");
        }
        
        return obj;
    }
}
