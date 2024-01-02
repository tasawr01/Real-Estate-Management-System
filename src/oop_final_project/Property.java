/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_final_project;

/**
 *
 * @author Wajahat Traders
 */
public class Property {
    private String propertyID;
    private String address;
    private double price;
    private double area;
    private int numberOfRooms;
    private String propertyType;

    public Property(String propertyID, String address, double price, double area, int numberOfRooms, String propertyType) {
        this.propertyID = propertyID;
        this.address = address;
        this.price = price;
        this.area = area;
        this.numberOfRooms = numberOfRooms;
        this.propertyType = propertyType;
    }

    public String getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(String propertyID) {
        this.propertyID = propertyID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    @Override
    public String toString() {
        return "Property ID: " + propertyID + "\nAddress: " + address + "\nPrice: " + price + "\nArea: " + area + "\nNumber of Rooms: " + numberOfRooms + "\nProperty Type: " + propertyType;
    }
}
