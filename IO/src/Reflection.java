import java.lang.reflect.Field; // Library to read the contents of a class at runtime

public class Reflection {
  public static void main(String[] args) throws Exception {
    // <?> - A Generic type you have no idea about, a wild card
    Class<?> c = Class.forName("Person");
    System.out.println(c.getName());

    // Print fields of Person
    Field[] fields = c.getDeclaredFields();
    for (Field f : fields) {
      System.out.println(f.getName());
    }

    Person joe = (Person) c.newInstance();
    System.out.println(joe);

    Field newAge = c.getDeclaredField("age");
    newAge.setAccessible(true);
    newAge.set(joe, -5000);
    System.out.println(joe);
  }
}
