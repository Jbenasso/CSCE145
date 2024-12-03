// Author: Josefa Benasso
// Car class representing a car, subclass of Vehicle
package Lab10;

public class Car extends Vehicle {
    private double gasMileage;
    private int numberOfPassengers;

    // Default constructor
    public Car() {
        super();
        this.gasMileage = 0.0;
        this.numberOfPassengers = 0;
    }

    // Parameterized constructor
    public Car(String manufacturerName, int numberOfCylinders, String ownerName, double gasMileage, int numberOfPassengers) {
        super(manufacturerName, numberOfCylinders, ownerName);
        setGasMileage(gasMileage);
        setNumberOfPassengers(numberOfPassengers);
    }

    // Accessors
    public double getGasMileage() {
        return gasMileage;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    // Mutators
    public void setGasMileage(double gasMileage) {
        this.gasMileage = Math.max(gasMileage, 0.0);
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = Math.max(numberOfPassengers, 0);
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car other = (Car) obj;
            return super.equals(other) &&
                   this.gasMileage == other.gasMileage &&
                   this.numberOfPassengers == other.numberOfPassengers;
        }
        return false;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() +
               "\nGas Mileage: " + gasMileage +
               "\nNumber of Passengers: " + numberOfPassengers;
    }
}
