public class PressureSensor implements Sensor {
    private double pressure;

    public PressureSensor(double pressure) {
        this.pressure = pressure;
    }
    @Override
    public double readValue() {
        return pressure;
    }

    @Override
    public String getStatus() {
        return ("Pressure sensor active");
    }

    @Override
    public void reset(){
        pressure = 0;
        System.out.println("Sensor reset");
    }
}