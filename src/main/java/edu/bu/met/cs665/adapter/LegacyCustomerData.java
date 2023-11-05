/**
 * Name: ALISA BELOUSOVA
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/07/2023
 * File Name: LegacyCustomerData.java
 * Description: Implementation of the legacy system (USB).
 */

package edu.bu.met.cs665.adapter;

public class LegacyCustomerData implements CustomerData_USB {
  @Override
  public void printCustomer(int customerId) {
    // Simulate printing customer data retrieved from USB
    System.out.println("Customer " + customerId + " data printed from USB.");
  }

  @Override
  public void getCustomer_USB(int customerId) {
    // Simulate getting customer data from USB
    System.out.println("Customer " + customerId + " data retrieved from USB.");
  }
}
