/** Assignment-2 Description: Main method to run program. */

package edu.bu.met.cs665;

import edu.bu.met.cs665.observable.ConcereteShop;
import edu.bu.met.cs665.observer.ConcereteDriver;
import edu.bu.met.cs665.other.CustomerDetails;
import java.util.ArrayList;
import java.util.List;

public class Main {

  /**
   * A main method to run examples.
   *
   * @param args String
   */
  public static void main(String[] args) {

    ConcereteShop tacoBellShop = new ConcereteShop("Taco Bell", "Cheese Quesadilla");
    String[] driverNames = { // define string array for driver names
      "Taxi Driver Lucy",
      "Taxi Driver Dennis",
      "Van Driver Bob",
      "Van Driver James",
      "Van Driver Jack",
      "Taxi Driver Keli"
    };

    List<ConcereteDriver> driverNameList = new ArrayList<ConcereteDriver>();

    for (int i = 0; i < driverNames.length; i++) {
      driverNameList.add(new ConcereteDriver(driverNames[i]));
    }

    for (int k = 0; k < driverNameList.size(); k++) {
      tacoBellShop.subscribeDriver(driverNameList.get(k));
    }
    CustomerDetails objcust1 = new CustomerDetails(11, "BU East");
    System.out.println("Taco Bell Delivery:");
    tacoBellShop.setDeliveryRequestToDriver("New Delivery ", objcust1);
  }
}
