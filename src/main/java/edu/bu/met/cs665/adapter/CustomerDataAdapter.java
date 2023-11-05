/**
 * Name: ALISA BELOUSOVA
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/07/2023
 * File Name: CustomerDataAdapter.java
 * Description: Adapter class that adapts the interface of the legacy system (USB) 
 * to the new system (HTTPS).
 */

package edu.bu.met.cs665.adapter;

public class CustomerDataAdapter implements CustomerData_HTTPS {
  // The instance of the legacy system that we are adapting
  private CustomerData_USB legacySystem;

  /**
   * Constructor for the adapter that takes an instance of the legacy system.
   * @param legacySystem an instance of the legacy system
   */
  public CustomerDataAdapter(CustomerData_USB legacySystem) {
    this.legacySystem = legacySystem;
  }

  /**
   * This method adapts the `printCustomer` method from the HTTPS interface to the USB interface.
   * @param customerId the ID of the customer to print
   */
  @Override
  public void printCustomer(int customerId) {
    // Delegate the method call to the legacy system's printCustomer method
    legacySystem.printCustomer(customerId);
  }

  /**
   * This method adapts the `getCustomer` method from the HTTPS interface to the USB interface.
   * @param customerId the ID of the customer to retrieve
   */
  @Override
  public void getCustomer_HTTPS(int customerId) {
    // Delegate the method call to the legacy system's getCustomer method
    legacySystem.getCustomer_USB(customerId);
  }
}
