/**
 * Name: ALISA BELOUSOVA
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/07/2023
 * File Name: Client.java
 * Description: Client class that works with the new system interface 
 * but can actually use the legacy system
 */

package edu.bu.met.cs665.adapter;

public class Client {
  /**
   * The main method where the program execution begins.
   * It creates instances of the legacy system and the adapter to demonstrate
   * how the adapter allows us to use the legacy system through the new system's interface.
   * 
   * @param args Command line arguments (not used).
   */
  public static void main(String[] args) {
    // Create an instance of a class that implements the legacy system interface
    CustomerData_USB legacySystem = new LegacyCustomerData();

    // Create an adapter that allows us to use the legacy system where the new system is expected
    CustomerData_HTTPS newSystemAdapter = new CustomerDataAdapter(legacySystem);

    // Now we can use the new system's interface to interact with the legacy system
    int customerId = 123; // Example customer ID
    newSystemAdapter.printCustomer(customerId);
    newSystemAdapter.getCustomer_HTTPS(customerId);
  }
}

