import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

  @Test
  void add() {
    Calculator calculator = new Calculator();
    int expected = 15;
    int result = calculator.add(10, 5);
    assertEquals(expected, result);

    int expected2 = 150;
    int result2 = calculator.add(100, 50);
    assertEquals(expected2, result2);

  }
}