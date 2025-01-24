public class Main {
    public static void main(String[] args) {
        WorkTool hammer = new Hammer("tego typu benc", 1969);
        WorkTool saw = new Saw("pila do kosci", 1968);

        hammer.use();
        saw.use();

        System.out.println(hammer);
        System.out.println(saw);
//
//        Vehicle vehicle = new Vehicle("BMW", "e39");
//        Car car = new Car("Volswawagen", "Golf IV", 5);
//
//        System.out.println(vehicle);
//        System.out.println(car);
    }


}