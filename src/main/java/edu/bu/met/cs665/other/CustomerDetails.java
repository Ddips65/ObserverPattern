/** Assignment-2 Description: CustomerDetails contains the information about customer. */

package edu.bu.met.cs665.other;

/** CustomerDetails contains the information about order number and address. */
public class CustomerDetails {
  private int orderConfirmationNumber;
  private String customerAddress;

  /**
   * Constructor contains order number and customer address attributes.
   *
   * @param orderConfirmationNumber int
   * @param customerAddress String
   */
  public CustomerDetails(int orderConfirmationNumber, String customerAddress) {
    this.orderConfirmationNumber = orderConfirmationNumber;
    this.customerAddress = customerAddress;
  }

  /**
   * get orderConfirmationNumber.
   *
   * @return orderConfirmationNumber
   */
  public int getOrderConfirmationNumber() {
    return orderConfirmationNumber;
  }

  /**
   * set order confirmation number.
   *
   * @param orderConfirmationNumber int
   */
  public void setOrderConfirmationNumber(int orderConfirmationNumber) {
    this.orderConfirmationNumber = orderConfirmationNumber;
  }

  /**
   * get customer address.
   *
   * @return customer address
   */
  public String getCustomerAddress() {
    return customerAddress;
  }

  /**
   * set customer address.
   *
   * @param customerAddress String
   */
  public void setCustomerAddress(String customerAddress) {
    this.customerAddress = customerAddress;
  }
}
