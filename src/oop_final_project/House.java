/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_final_project;

/**
 *
 * @author Wajahat Traders
 */
public class House extends Property {
    private boolean hasGarden;

    public House(String propertyID, String address, double price, double area, int numberOfRooms, String propertyType, boolean hasGarden, Object par7) {
        super(propertyID, address, price, area, numberOfRooms, propertyType);
        this.hasGarden = hasGarden;
    }
    public boolean hasGarden() {
        return hasGarden;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nHas Garden: " + (hasGarden ? "Yes" : "No");
    }
}
