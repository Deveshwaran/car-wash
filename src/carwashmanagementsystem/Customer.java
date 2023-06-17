/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carwashmanagementsystem;

/**
 *
 * @author User
 */
public class Customer {
    
    private String name;
    private String registrationnum;
    private String phnum;
    private String membership;
    private double baseprice;
    private double totalprice;
    private double grandprice;
    private String[] comment ; 
    private int age;
    private String polishstatus;
    private String dashboardstatus;
    private String floorcleanstatus;
    private String polishtype;
    
    public Vehicle obj;
    public VehicleFactory factoryObj;
    public WashType polish;
    public WashType dashClean;
    public WashType floorClean;
    
    public Customer(String vehiType, WashType polish, WashType dashClean,WashType floorClean){
        factoryObj = new VehicleFactory();
        obj = factoryObj.getVehiType(vehiType);
        this.polish = polish;
        this.dashClean = dashClean;
        this.floorClean = floorClean;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the registrationnum
     */
    public String getRegistrationnum() {
        return registrationnum;
    }

    /**
     * @param registrationnum the registrationnum to set
     */
    public void setRegistrationnum(String registrationnum) {
        this.registrationnum = registrationnum;
    }

    /**
     * @return the phnum
     */
    public String getPhnum() {
        return phnum;
    }

    /**
     * @param phnum the phnum to set
     */
    public void setPhnum(String phnum) {
        this.phnum = phnum;
    }

    /**
     * @return the membership
     */
    public String getMembership() {
        return membership;
    }

    /**
     * @param membership the membership to set
     */
    public void setMembership(String membership) {
        this.membership = membership;
    }

    /**
     * @return the baseprice
     */
    public double getBaseprice() {
        return baseprice;
    }

    /**
     * @param baseprice the baseprice to set
     */
    public void setBaseprice(double baseprice) {
        this.baseprice = baseprice;
    }

    /**
     * @return the totalprice
     */
    public double getTotalprice() {
        return totalprice;
    }

    /**
     * @param totalprice the totalprice to set
     */
    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }

    /**
     * @return the grandprice
     */
    public double getGrandprice() {
        return grandprice;
    }

    /**
     * @param grandprice the grandprice to set
     */
    public void setGrandprice(double grandprice) {
        this.grandprice = grandprice;
    }

    /**
     * @return the comment
     */
    public String[] getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(String[] comment) {
        this.comment = comment;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the polishstatus
     */
    public String getPolishstatus() {
        return polishstatus;
    }

    /**
     * @param polishstatus the polishstatus to set
     */
    public void setPolishstatus(String polishstatus) {
        this.polishstatus = polishstatus;
    }

    /**
     * @return the dashboardstatus
     */
    public String getDashboardstatus() {
        return dashboardstatus;
    }

    /**
     * @param dashboardstatus the dashboardstatus to set
     */
    public void setDashboardstatus(String dashboardstatus) {
        this.dashboardstatus = dashboardstatus;
    }

    /**
     * @return the floorcleanstatus
     */
    public String getFloorcleanstatus() {
        return floorcleanstatus;
    }

    /**
     * @param floorcleanstatus the floorcleanstatus to set
     */
    public void setFloorcleanstatus(String floorcleanstatus) {
        this.floorcleanstatus = floorcleanstatus;
    }

    /**
     * @return the polishtype
     */
    public String getPolishtype() {
        return polishtype;
    }

    /**
     * @param polishtype the polishtype to set
     */
    public void setPolishtype(String polishtype) {
        this.polishtype = polishtype;
    }

    
    
    
}
