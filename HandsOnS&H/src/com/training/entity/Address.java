/**
 * 
 */

package com.training.entity;

import org.apache.log4j.Logger;

/** Address Class.
 * @author akaul5
 *
 */


public class Address {

  /** Root Logger.
   * 
   */

  final Logger root = Logger.getRootLogger();
  
  /** Address Line 1.
   * 
   */

  private String addressLine1;
  
  /** Address Line 2.
   * 
   */
  
  private String addressLine2;
  
  /** City Name.
   * 
   */
  
  private String cityName;
  
  /** Pin Code.
   * 
   */
  
  private long pinCode;
  
 
  /** No-arg Constructor.
   * 
   */
  public Address() {
    super();
  }

  /** Parameterized Constructor.
   * @param addressLine1 addressLine1
   * @param addressLine2 addressLine2
   * @param cityName cityName
   * @param pinCode pinCode
   */
  public Address(String addressLine1, String addressLine2, String cityName, long pinCode) {
    super();
    this.addressLine1 = addressLine1;
    this.addressLine2 = addressLine2;
    this.cityName = cityName;
    this.pinCode = pinCode;
  }

  /** Gets Address Line 1.
   * @return the addressLine1
   */
  
  public String getAddressLine1() {
    return addressLine1;
  }

  /** Sets Address Line 1.
   * @param addressLine1 the addressLine1 to set
   */

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  /** Sets Address Line 2.
   * @return the addressLine2
   */

  public String getAddressLine2() {
    return addressLine2;
  }

  /** Sets Address Line 2.
   * @param addressLine2 the addressLine2 to set
   */

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  /** Gets City Name.
   * @return the cityName
   */
  public String getCityName() {
    return cityName;
  }

  /** Sets City Name.
   * @param cityName the cityName to set
   */

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  /** Gets Pin Code.
   * @return the pinCode
   */

  public long getPinCode() {
    return pinCode;
  }

  /** Sets Pin Code.
   * @param pinCode the pinCode to set
   */

  public void setPinCode(long pinCode) {
    this.pinCode = pinCode;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */

  /** Returns string representation of the object.
   * @return String representation of the object
   */

  @Override
  public String toString() {
    return "Address [addressLine1=" + addressLine1 + ", addressLine2=" 
        + addressLine2 + ", cityName=" + cityName + ", pinCode=" + pinCode + "]";
  }
}
