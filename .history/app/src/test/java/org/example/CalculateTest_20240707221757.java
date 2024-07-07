package test.java.org.example;

import java.beans.Transient;

public class CalculateTest {
  @test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));

  }
}
