package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.bu.met.cs665.adapter.CustomerDataAdapter;
import edu.bu.met.cs665.adapter.CustomerData_USB;

public class TestCustomerDataAdapter {

    private CustomerDataAdapter adapter;
    private StringBuilder log;

    class MockLegacyCustomerData implements CustomerData_USB {
        @Override
        public void printCustomer(int customerId) {
            log.append("printCustomer ").append(customerId).append("\n");
        }

        @Override
        public void getCustomer_USB(int customerId) {
            log.append("getCustomer ").append(customerId).append("\n");
        }
    }

    void setUp() {
        log = new StringBuilder();
        CustomerData_USB mockLegacySystem = new MockLegacyCustomerData();
        adapter = new CustomerDataAdapter(mockLegacySystem);
    }

    @Test
    public void whenPrintCustomerCalled_thenLegacySystemPrintCustomerShouldBeCalled() {
        this.setUp();

        int customerId = 101;

        adapter.printCustomer(customerId);

        String expectedLog = "printCustomer 101\n";
        assertEquals(expectedLog, log.toString());
    }

    @Test
    public void whenGetCustomer_HTTPSCalled_thenLegacySystemGetCustomer_USBShouldBeCalled() {
        this.setUp();
        
        int customerId = 102;

        adapter.getCustomer_HTTPS(customerId);

        String expectedLog = "getCustomer 102\n";
        assertEquals(expectedLog, log.toString());
    }

    @Test
    public void whenInvalidCustomerId_thenAppropriateResponseShouldBeLogged() {
        this.setUp();
        
        int invalidCustomerId = -1;

        adapter.printCustomer(invalidCustomerId);

        String expectedLog = "printCustomer -1\n";
        assertEquals(expectedLog, log.toString());
    }
}
