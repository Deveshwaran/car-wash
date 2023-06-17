/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carwashmanagementsystem;

/**
 * 
 * @author User
 */
public class Service1 extends WashType {
    
    private double serviceprice;
    public Service1(){
        super();
    }
    

    @Override
    public double CalcServicePrice(String polishtype, String vehiType){
        if(vehiType.equals("Sedan")){
            if(polishtype.equals("A")){
                serviceprice = 140.0;
            }
            else if(polishtype.equals("B")){
                serviceprice = 100.0;
            }

        }
        else if(vehiType.equals("SUV")){
            if(polishtype.equals("A")){
                serviceprice = 200.0;
            }
            else if(polishtype.equals("B")){
                serviceprice = 180.0;
            }

        }
        else if(vehiType.equals("Van")){
            if(polishtype.equals("A")){
                serviceprice = 250.0;
            }
            else if(polishtype.equals("B")){
                serviceprice = 200.0;
            }
        }
       
        return serviceprice;
    }
    
    @Override
    public double CalcServicePrice(String vehiType){
        if(vehiType.equals("Sedan")){
            serviceprice = 80.0;
        }
        else if(vehiType.equals("SUV")){
           serviceprice = 120.0;
        }
        else if(vehiType.equals("Van")){
            serviceprice = 160.0;
        }
       
        return serviceprice;
    }
    
    public void servicetype(){
        System.out.println("Polish");
    }
    
}
