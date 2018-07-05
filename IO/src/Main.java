import java.util.Scanner;
import java.io.*;


public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your name:");
    String name = sc.nextLine();
    System.out.println("Hello, " + name);

    System.out.println("Your age: ");
    // The number is consumed, but the newline character is still in the buffer, waiting to be consumed by the nextLine() function
    int age = sc.nextInt();
    System.out.println("You are " + age);

    sc.nextLine(); // Used to consume the leftover newline character

    System.out.println("Your DOB");
    String dob = sc.nextLine();
    System.out.println("Your birthday is " + dob);

    String filename =  "bio.txt";

    // Using try with resources to handle possible throw IOException
    try(FileWriter fw = new FileWriter(filename)){
      fw.write(name + ", " + age + ", " + dob);
    } catch(IOException ioex){
      // Check exceptions are checked if they are handled at compile time
      ioex.printStackTrace();
    }

    FileReader fr;
    try {
      fr = new FileReader(filename);
      int i;
      while ((i = fr.read()) != -1) {
        System.out.print((char) i);
      }
      fr.close();
    } catch(FileNotFoundException ex) { // Exceptions should be order from most specific (child class) to least specific (parent class)
      ex.printStackTrace();
    } catch (IOException ex) {
      ex.printStackTrace();
    } 
  }
}
