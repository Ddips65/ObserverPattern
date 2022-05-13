/**
 * Assignment-2
 * Description: DeliveryRequest is observable which contains the information about shop,driver
 * and customer details.
 */

package edu.bu.met.cs665.observable;

import edu.bu.met.cs665.interfacesubjectobserver.DriverInterface;
import edu.bu.met.cs665.other.CustomerDetails;

public class DeliveryRequest {
  private DriverInterface driver;
  private ConcereteShop cshop;
  private CustomerDetails myCustomer;

  /**
   * Delivery Request constructor contains the information about driver who registered under
   * respected shop as well as customer details to delivered order.
   *
   * @param driver DriverInterface
   * @param cshop ConcereteShop
   * @param myCustomer CustomerDetails
   */
  public DeliveryRequest(DriverInterface driver, ConcereteShop cshop, CustomerDetails myCustomer) {
    this.driver = driver;
    this.cshop = cshop;
    this.myCustomer = myCustomer;
  }

  /** It display the data with driver name,shop name order confirmation and address. */
  public void showData() {
    System.out.println(
        driver.getDriverName()
            + " has received delivery request. "
            + "Order Confirmation Number: "
            + myCustomer.getOrderConfirmationNumber()
            + ", ADDRESS: "
            + myCustomer.getCustomerAddress());
  }
}
