// Author: Josefa Benasso
// Truck class representing a truck, subclass of Vehicle
package Lab10;

public class Truck extends Vehicle {
    private double loadCapacity;
    private double towingCapacity;

    // Default constructor
    public Truck() {
        super();
        this.loadCapacity = 0.0;
        this.towingCapacity = 0.0;
    }

    // Parameterized constructor
    public Truck(String manufacturerName, int numberOfCylinders, String ownerName, double loadCapacity, double towingCapacity) {
        super(manufacturerName, numberOfCylinders, ownerName);
        setLoadCapacity(loadCapacity);
        setTowingCapacity(towingCapacity);
    }

    // Accessors
    public double getLoadCapacity() {
        return loadCapacity;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    // Mutators
    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = Math.max(loadCapacity, 0.0);
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = Math.max(towingCapacity, 0.0);
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Truck) {
            Truck other = (Truck) obj;
            return super.equals(other) &&
                   this.loadCapacity == other.loadCapacity &&
                   this.towingCapacity == other.towingCapacity;
        }
        return false;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() +
               "\nLoad Capacity: " + loadCapacity +
               "\nTowing Capacity: " + towingCapacity;
    }
}
