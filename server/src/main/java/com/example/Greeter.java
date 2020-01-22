package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
<<<<<<< HEAD
   * @param someone this name of person
   * @return greeting string
   */
  public final String greet( final String someone) {
=======
   * @param someone this is the name of person
   * @return greeting string
   */  
   public final String greet(final String someone) {
>>>>>>> 9e50113627a0601e1d71cb434868891583d2184e
    return String.format("Hello, %s!", someone);
  }
}
