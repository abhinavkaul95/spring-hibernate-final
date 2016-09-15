/**
 * 
 */
package com.training.entity;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;


/** Donor Class.
 * @author akaul5
 *
 */


public class Donor {
	  
  /** Root Logger.
   * 
   */

  final Logger root = Logger.getRootLogger();
	  
  /** handPhone.
   * 
   */

  private long handPhone;
 
  /** donorName.
   * 
   */

  private String donorName;

  /** email.
   * 
   */

  private String email;

  /** address.
   * 
   */
  @Autowired
  private Address address;

  /** No-arg Constructor.
   * 
   */
  
  public Donor() {
    super();
  }
  
  /** Parameterized Constructor.
   * @param handPhone handPhone
   * @param donorName donorName
   * @param email email
   * @param address address
   */
  public Donor(long handPhone, String donorName, String email, Address address) {
    super();
    this.handPhone = handPhone;
    this.donorName = donorName;
    this.email = email;
    this.address = address;
  }
  
  /**
   * @return the handPhone
   */
  public long getHandPhone() {
    return handPhone;
  }

  /**
   * @param handPhone the handPhone to set
   */

  public void setHandPhone(long handPhone) {
    this.handPhone = handPhone;
  }

  /**
   * @return the donorName
   */
  
  public String getDonorName() {
    return donorName;
  }

  /**
   * @param donorName the donorName to set
   */
  
  public void setDonorName(String donorName) {
    this.donorName = donorName;
  }

  /**
   * @return the email
   */
  
  public String getEmail() {
    return email;
  }
  
  /**
   * @param email the email to set
   */

  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * @return the address
   */
  
  public Address getAddress() {
    return address;
  }
  
  /**
   * @param address the address to set
   */
  
  public void setAddress(Address address) {
    this.address = address;
  }


  
  
  public String toJson() {
    return "{\"handPhone\" : \"" + handPhone + "\", \"donorName\" : \"" + donorName +
        "\", \"email\" : \"" + email + "\", \"address\" : \"" + address + "\"}";
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */

  /** Returns string representation of the object.
   * @return String representation of the object
   */
  
@Override
public String toString() {
	return "Donor [handPhone=" + handPhone + ", donorName=" + donorName + ", email=" + email + ", address=" + address
			+ "]";
}
  
  
}

