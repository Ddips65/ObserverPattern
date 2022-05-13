/**
 * Assignment-2
 * Description: DriverInterface contains methods about updateDrivers with message details
 * and delivery request.
 */

package edu.bu.met.cs665.interfacesubjectobserver;

import edu.bu.met.cs665.observable.DeliveryRequest;

/** DriverInterface is observer in the observer pattern. */
public interface DriverInterface {

  /**
   * Update driver with updated message and delivery request details which include information about
   * order confirmation number and customer's address.
   *
   * @param message String
   * @param request Delivery Request
   */
  void updateDriver(String message, String shopName, DeliveryRequest request);

  String getDriverName();
}
