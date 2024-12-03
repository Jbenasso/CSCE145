// Author: Josefa Benasso
// Vehicle class representing a generic vehicle
package Lab10;

public class Vehicle {
    private String manufacturerName;
    private int numberOfCylinders;
    private String ownerName;

    // Default constructor
    public Vehicle() {
        this.manufacturerName = "Unknown";
        this.numberOfCylinders = 1; // Minimum valid value
        this.ownerName = "Unknown";
    }

    // Parameterized constructor
    public Vehicle(String manufacturerName, int numberOfCylinders, String ownerName) {
        setManufacturerName(manufacturerName);
        setNumberOfCylinders(numberOfCylinders);
        setOwnerName(ownerName);
    }

    // Accessors
    public String getManufacturerName() {
        return manufacturerName;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public String getOwnerName() {
        return ownerName;
    }

    // Mutators
    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName != null ? manufacturerName : "Unknown";
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        if (numberOfCylinders > 0) {
            this.numberOfCylinders = numberOfCylinders;
        } else {
            this.numberOfCylinders = 1; // Default valid value
        }
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName != null ? ownerName : "Unknown";
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle other = (Vehicle) obj;
            return this.manufacturerName.equals(other.manufacturerName) &&
                   this.numberOfCylinders == other.numberOfCylinders &&
                   this.ownerName.equals(other.ownerName);
        }
        return false;
    }

    // toString method
    @Override
    public String toString() {
        return "Manufacturer's Name: " + manufacturerName +
               "\nNumber Of Cylinders: " + numberOfCylinders +
               "\nOwner's Name: " + ownerName;
    }
}
