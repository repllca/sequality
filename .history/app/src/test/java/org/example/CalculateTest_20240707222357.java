package test.java.org.example;

import org.junit.Test;
import java.beans.Transient;
import static org.junit.Assert.*;

public class CalculateTest {
  @test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));

  }
}
