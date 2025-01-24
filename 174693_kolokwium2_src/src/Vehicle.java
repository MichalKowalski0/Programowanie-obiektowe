public class Vehicle {
    private String brand;
    private String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public String toString() {
        return "Vehicle{" +
                "brand=" + brand + ", model=" + model + '}';
    }
}
