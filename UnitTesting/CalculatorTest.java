import static org.junit.Assert.assertEquals;
import org.junit.Test;
// To compile with test class
// javac CalculatorTest.java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar

// To run compiled tests
// java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore CalculatorTest

public class CalculatorTest {

    @Test
    public void sumExpressionMethodTest(){
        Calculator c = new Calculator();
        int expectedSum = 4;
        int actualSum = c.sum("2+2");
        assertEquals(expectedSum, actualSum);
    }
}
