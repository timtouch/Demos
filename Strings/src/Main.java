public class Main {
  public static void main(String[] args) {
    // String literal
    // Stored in the String Pool
    String str1 = "Hello, world!";
    String str2 = "Hello, world!";

    // System.out.println(str1.compareTo(str2));
    // System.out.println(str1.equals(str2));

    //char array
    char[] helloArray = {'h','e', 'l', 'l', 'o'};
    String helloString = new String(helloArray);

    str1 = "hello";
    // str2 = "hello";
    str2 = new String("hello");

    System.out.println(str1.equals(str2));
    System.out.println(str1 == str2);

    // Check out StringBuffer and StringBuilder for manipulating Strings
    // in a memory saving manner
    // StringBuilder - Mutable string, not threadsafe
    // StringBuffer - is threadsafe (much slower)

    // The String pool gets garbage collected last
    StringBuilder sb = new StringBuilder("hello");
    sb.append(", world!");
    str1 = sb.toString();
    System.out.println(str1);

  }
}
