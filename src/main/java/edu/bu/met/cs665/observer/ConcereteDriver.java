/**
 * Assignment-2
 * Description: ConcereteDriver is a type of observer which implement subject (Driver Interface).
 */

package edu.bu.met.cs665.observer;

import edu.bu.met.cs665.interfacesubjectobserver.DriverInterface;
import edu.bu.met.cs665.observable.DeliveryRequest;

/** ConcereteDriver(observer) contains currentDeliveryInfo in the observer pattern. */
public class ConcereteDriver implements DriverInterface {

  private String shopName;
  private String driverName;
  private DeliveryRequest dr;
  private String latestDeliveryUpdate;

  /**
   * constructor to utilize Driver attribute.
   *
   * @param driverName String
   */
  public ConcereteDriver(String driverName) {
    this.driverName = driverName;
    this.latestDeliveryUpdate = "";
  }

  /**
   * updateDriver: updates the driver with message details, delivery request which contains info
   * about customer details where to delivered.
   *
   * @param message String
   * @param shopName String
   * @param request Delivery Request
   */
  @Override
  public void updateDriver(String message, String shopName, DeliveryRequest request) {
    this.latestDeliveryUpdate = message;
    this.shopName = shopName;
    this.dr = request;
    System.out.println(this.latestDeliveryUpdate + "from " + this.shopName + ".");
    dr.showData();
  }

  /**
   * Gets the name of the Driver/Observer.
   *
   * @return driverName
   */
  @Override
  public String getDriverName() {
    return driverName;
  }
}
