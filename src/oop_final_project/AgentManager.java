/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_final_project;
import java.util.*;
import java.sql.*;
/**
 *
 * @author Wajahat Traders
 */
public class AgentManager extends PropertyManager {
    private List<Property> properties;
    private static final String DB_URL = "jdbc:ucanaccess://C:\\Users\\Wajahat Traders\\Documents\\NetBeansProjects\\OOP_Final_Project\\Data Base.accdb";

    public AgentManager() {
        properties = new ArrayList<>();
    }

    @Override
    public void addProperty(Property property) {
        try (Connection connection = DriverManager.getConnection(DB_URL)) {
            String query;
            if (property instanceof House) {
                query = "INSERT INTO properties (propertyID, address, price, area, noofrooms, propertyType, floorOrElevator) VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setString(1, property.getPropertyID());
                statement.setString(2, property.getAddress());
                statement.setDouble(3, property.getPrice());
                statement.setDouble(4, property.getArea());
                statement.setInt(5, property.getNumberOfRooms());
                statement.setString(6, property.getPropertyType());
                statement.setBoolean(7, ((House) property).hasGarden());
                statement.executeUpdate();
            } else if (property instanceof Apartment) {
                query = "INSERT INTO properties (propertyID, address, price, area, noofrooms, propertyType, floorOrElevator) VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setString(1, property.getPropertyID());
                statement.setString(2, property.getAddress());
                statement.setDouble(3, property.getPrice());
                statement.setDouble(4, property.getArea());
                statement.setInt(5, property.getNumberOfRooms());
                statement.setString(6, property.getPropertyType());
                statement.setBoolean(7, ((Apartment) property).hasElevator());
                statement.executeUpdate();
            }
            System.out.println("Property added successfully.");
        } catch (SQLException e) {
            System.out.println("Error adding property: " + e.getMessage());
        }
    }
    
    @Override
    public void removeProperty(String propertyID) {
        try (Connection connection = DriverManager.getConnection(DB_URL)) {
            String query = "DELETE FROM properties WHERE propertyID = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, propertyID);
            statement.executeUpdate();
            System.out.println("Property removed successfully.");
        } catch (SQLException e) {
            System.out.println("Error removing property: " + e.getMessage());
        }
    }

    @Override
public void updateProperty(Property property) {
    try (Connection connection = DriverManager.getConnection(DB_URL)) {
        String query;
        if (property instanceof House) {
            query = "UPDATE properties SET address = ?, price = ?, area = ?, noofrooms = ?, propertyType = ?, floorOrElevator = ? WHERE propertyID = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, property.getAddress());
            statement.setDouble(2, property.getPrice());
            statement.setDouble(3, property.getArea());
            statement.setInt(4, property.getNumberOfRooms());
            statement.setString(5, property.getPropertyType());
            statement.setBoolean(6, ((House) property).hasGarden());
            statement.setString(7, property.getPropertyID());
            statement.executeUpdate();
        } else if (property instanceof Apartment) {
            query = "UPDATE properties SET address = ?, price = ?, area = ?, noofrooms = ?, propertyType = ?, floorOrElevator = ? WHERE propertyID = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, property.getAddress());
            statement.setDouble(2, property.getPrice());
            statement.setDouble(3, property.getArea());
            statement.setInt(4, property.getNumberOfRooms());
            statement.setString(5, property.getPropertyType());
            statement.setBoolean(6, ((Apartment) property).hasElevator());
            statement.setString(7, property.getPropertyID());
            statement.executeUpdate();
        }
        System.out.println("Property updated successfully.");
    } catch (SQLException e) {
        System.out.println("Error updating property: " + e.getMessage());
    }
}

    
}