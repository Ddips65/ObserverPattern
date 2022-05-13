/**
 * Assignment-2
 * Description: Test case for add new driver check size of driver list , add/remove driver
 * check product name.
 */

package edu.bu.met.cs665.testsys;

import edu.bu.met.cs665.interfacesubjectobserver.DriverInterface;
import edu.bu.met.cs665.observable.ConcereteShop;
import edu.bu.met.cs665.observer.ConcereteDriver;
import edu.bu.met.cs665.other.CustomerDetails;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;

public class Testsubscriber {

    String[] driverNames = {
            "Driver Lucy", "Driver Dennis", "Driver Bob", "Driver James", "Driver Jack", "Driver Keli"
    };

    List<ConcereteDriver> driverNameList = new ArrayList<ConcereteDriver>();
    ConcereteShop tacoBellShop = new ConcereteShop("Taco Bell", "Cheese Quesadilla");

  /**
   * Test case for after creating new instance check driver name as well as check the size of driver
   * list
   */
  @Test
  public void testDriverName() {

    ConcereteDriver driver1 = new ConcereteDriver("Taxi Driver Lucy");
    ConcereteDriver driver2 = new ConcereteDriver("Taxi Driver Dennis");
    ConcereteDriver driver3 = new ConcereteDriver("Van Driver Bob");
    ConcereteDriver driver4 = new ConcereteDriver("Van Driver James");
    ConcereteDriver driver5 = new ConcereteDriver("Van Driver Jack");
    ConcereteDriver driver6 = new ConcereteDriver("Taxi Driver Keli");

    tacoBellShop.subscribeDriver(driver1);
    tacoBellShop.subscribeDriver(driver2);
    tacoBellShop.subscribeDriver(driver3);
    tacoBellShop.subscribeDriver(driver4);
    tacoBellShop.subscribeDriver(driver5);
    tacoBellShop.subscribeDriver(driver6);

    assertEquals(driver1.getDriverName(), "Taxi Driver Lucy");
    assertEquals(driver2.getDriverName(), "Taxi Driver Dennis");
    assertEquals(driver3.getDriverName(), "Van Driver Bob");
    assertEquals(driver4.getDriverName(), "Van Driver James");
    assertEquals(driver5.getDriverName(), "Van Driver Jack");
    assertEquals(driver6.getDriverName(), "Taxi Driver Keli");
    assertEquals(6, tacoBellShop.getDriverList().size());
  }

    /**
     * Test case for adding new subscriber using subscribeDriver method
     */
    @Test
    public void testAddNewSubscribeDriver() {
        ArrayList<DriverInterface> arListDriver = null;
        for (int i = 0; i < driverNames.length; i++) {
            driverNameList.add(new ConcereteDriver(driverNames[i]));
            tacoBellShop.subscribeDriver(driverNameList.get(i));
        }
        ConcereteDriver addNewDriver = new ConcereteDriver("Taxi Driver Joel");
        tacoBellShop.subscribeDriver(addNewDriver);
        assertEquals(7, tacoBellShop.getDriverList().size());
    }

    /**
     * test case for unsubscribe or remove the driver from driverList
     */
    @Test
    public void testUnsubscribeDriver() {
        for (int i = 0; i < driverNames.length; i++) {
            driverNameList.add(new ConcereteDriver(driverNames[i]));
            tacoBellShop.subscribeDriver(driverNameList.get(i));
            tacoBellShop.unsubscribeDriver(driverNameList.get(0));
        }
        assertEquals(5, tacoBellShop.getDriverList().size());
    }

    /**
     * Test case for product name
     */
    @Test
    public void testFoodShop() {
        for (int i = 0; i < driverNames.length; i++) {
            driverNameList.add(new ConcereteDriver(driverNames[i]));
        }
        assertEquals("Cheese Quesadilla", tacoBellShop.getProductName());
    }
}

