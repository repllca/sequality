package test.java.org.example;

import org.junit.Test;
import static org.junit.Assert.*;

import org.example.Calculate;

public class CalculateTest {
  @Test
  public void testSum() {
    Cal calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }
}
