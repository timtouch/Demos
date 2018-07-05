public class Car extends Vehicle implements OilChange {

  public Car () {}
    
  public Car (String make, String model, int year) {
    super(make,model,year);
  }

  @Override
  public void drive() {
    System.out.println("VROOM");
  }

  @Override
  public boolean canOilChange() {
    return true;
  }

  public boolean canOilChange(String str) {
    return false;
  }

  public int defaultWheels(){
    return 4;
  }

  public void brake() {
    System.out.println("Stop. Hammertime!");
  }

  @Override
  public String toString() {
    return make + model + year;
  }
}
