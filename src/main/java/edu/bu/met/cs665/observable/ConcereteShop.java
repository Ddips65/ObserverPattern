/**
 * Assignment-2
 * Description: ConcereteShop is a type of observerable which implement subject (shop interface).
 */

package edu.bu.met.cs665.observable;

import edu.bu.met.cs665.interfacesubjectobserver.DriverInterface;
import edu.bu.met.cs665.interfacesubjectobserver.ShopInterface;
import edu.bu.met.cs665.other.CustomerDetails;
import java.util.ArrayList;

/**
 * ConcereteShop has a basic detials about the shop and implement subscribe unsubscribe and
 * notifysubscribe driver methods.
 */
public class ConcereteShop implements ShopInterface {

  private String shopName;
  private String productName;
  private ArrayList<DriverInterface> driverList = new ArrayList<DriverInterface>();
  private CustomerDetails cd;
  private DeliveryRequest request;
  private String latestDeliveryUpdate;

  /**
   * parameterize constructor set the shop name and product name.
   *
   * @param shopName String
   * @param productName String
   */
  public ConcereteShop(String shopName, String productName) {
    this.shopName = shopName;
    this.productName = productName;
  }

  /**
   * get shop name.
   *
   * @return shop Name.
   */
  public String getShopName() {
    return shopName;
  }

  /**
   * set shop name.
   *
   * @param shopName String
   */
  public void setShopName(String shopName) {
    this.shopName = shopName;
  }

  /**
   * get productName.
   *
   * @return prodcutName.
   */
  public String getProductName() {
    return productName;
  }

  /**
   * set productName.
   *
   * @param productName String
   */
  public void setProductName(String productName) {
    this.productName = productName;
  }

  /**
   * getter of name Driver list.
   *
   * @return driverList
   */
  public ArrayList<DriverInterface> getDriverList() {
    return driverList;
  }

  /**
   * setter name of driver list.
   *
   * @param driverList ArrayList
   */
  public void setDriverList(ArrayList<DriverInterface> driverList) {
    this.driverList = driverList;
  }

  /**
   * send delivery request to driver with additional attribute of customer details and message.
   *
   * @param latestDeliveryUpdate String
   * @param cd CustomerDetails
   */
  public void setDeliveryRequestToDriver(String latestDeliveryUpdate, CustomerDetails cd) {
    this.latestDeliveryUpdate = latestDeliveryUpdate;
    this.cd = cd;
    this.notifySubscribeDrivers();
  }

  /**
   * Add subscriber driver to the Arraylist(driverList) of subscribers.
   *
   * @param di DriverInterface
   */
  @Override
  public void subscribeDriver(DriverInterface di) {
    driverList.add(di);
  }

  /**
   * Remove subscriber driver to the Arraylist(driverList) of subscribers.
   *
   * @param di DriverInterface
   */
  @Override
  public void unsubscribeDriver(DriverInterface di) {
    driverList.remove(di);
  }

  /** Call the updateDriver() on each subscriber when the data changes. */
  @Override
  public void notifySubscribeDrivers() {
    for (DriverInterface di : driverList) {
      request = new DeliveryRequest(di, this, cd);
      di.updateDriver(this.latestDeliveryUpdate, this.shopName, request);
    }
  }
}
