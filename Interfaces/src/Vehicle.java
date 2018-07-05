/*
The interface can be used as a sort of contract that guarentees that any class that implements a specific
interface will also have to implement the methods in that interface. So another person doesn't have to know
how you implement your class or even wait for you to finish implementing it.

Therefore, they can write code without having to worry about how you implement it.
*/
public abstract class Vehicle {
  protected String make;
  protected String model;
  protected int year;

  public Vehicle () {}

  public Vehicle (String make, String model, int year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  // Notice how an abstract method doesn't have "{}" because we are not implementing the method in the
  protected abstract void drive ();

  protected void brake () {
    System.out.println("STOOOP!!");
  }
}
