public class Car extends Vehicle {
    int NumberOfDoors;

    public Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.NumberOfDoors = numberOfDoors;
    }
}
