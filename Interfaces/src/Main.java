public class Main {
  public static void main(String[] args) {
    Car c = new Car();
    c.drive();
    System.out.println(c.defaultWheels());

    // Due to polymorphism, you can treat the Car as a Vehicle as such
    Vehicle v = new Truck();
    v.drive();

    Vehicle car = new Car("Toyota", "Camry", 19);
    System.out.println(car.toString());
  }
}
