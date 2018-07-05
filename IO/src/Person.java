import java.io.Serializable;

// Serializable is a Marker interface - Just used to mark something, the interface
// itself is empty but notifies the compilier that the object is ready for serialization
public class Person implements Serializable {
  private static final long serialVersionUID = 1l;
  private String name = "Joe";
  private int age = 80;

  public Person() {}

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString(){
    return "Person [" + name + ", " + age + "]";
  }
}
