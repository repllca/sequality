/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

import java.beans.Transient;

public class AppTest {
  @Test
  public void appHasAGreeting() {
    App classUnderTest = new App();
    assertNotNull("app should have a greeting", classUnderTest.getGreeting());

  }

  @/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
  @Test
  public void testAppReternHelloWorld() {
    App classUnderTest = new App();
    assertEquals("Hello World!", classUnderTest.getGreeting());
  }
}

  public void testAppReternHelloWorld() {
    App classUnderTest = new App();
    assertEquals("Hello World", classUnderTest.getGreeting());
  }
}
