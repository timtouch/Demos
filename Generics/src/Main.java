public class Main {
  public static void main(String[] args) {
    Person peter = new Person();
    peter.setName("Peter");

    Person oPerson = (Person)oMethod(peter);

    System.out.println(oPerson.getName());

    Person anotherPerson = betterMethod(peter);

    System.out.println(anotherPerson.getName());
  }

  // How do you expand this to return any object that is passed into it.
  public static Person aMethod(Person p) {
    return p;
  }

  // Generics withough generics
  public static Object oMethod(Object o) {
    return o;
  }

  // Generic input
  // <T> is the placeholder for the type
  // This Generic method will take in the type of T and returns an object of type T
  public static <T> T betterMethod(T thing) {
    return thing;
  }


}
