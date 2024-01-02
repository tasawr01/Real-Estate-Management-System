/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_final_project;

/**
 *
 * @author Wajahat Traders
 */
public class Apartment extends Property {
    private boolean hasElevator;

    public Apartment(String propertyID, String address, double price, double area, int numberOfRooms, String propertyType, boolean hasElevator) {
        super(propertyID, address, price, area, numberOfRooms, propertyType);
        this.hasElevator = hasElevator;
    }
    
    public boolean hasElevator() {
        return hasElevator;
    }

    public void setHasElevator(boolean hasElevator) {
        this.hasElevator = hasElevator;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nHas Elevator: " + (hasElevator ? "Yes" : "No");
    }
}
