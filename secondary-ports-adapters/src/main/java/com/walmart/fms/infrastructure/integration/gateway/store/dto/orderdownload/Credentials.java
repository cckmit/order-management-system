//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, vhudson-jaxb-ri-2.1-792
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2020.08.30 at 08:54:50 PM PDT
//

package com.walmart.fms.infrastructure.integration.gateway.store.dto.orderdownload;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for Credentials complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Credentials">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="email" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/PlaceFulfillmentOrder/}email" minOccurs="0"/>
 *         &lt;element name="userID" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/PlaceFulfillmentOrder/}alpha20" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pin" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/PlaceFulfillmentOrder/}Phone" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "Credentials",
    propOrder = {"email", "userID", "password", "pin", "phone"})
public class Credentials {

  protected String email;
  protected String userID;
  protected String password;

  @XmlSchemaType(name = "unsignedInt")
  protected Long pin;

  protected Phone phone;

  /**
   * Gets the value of the email property.
   *
   * @return possible object is {@link String }
   */
  public String getEmail() {
    return email;
  }

  /**
   * Sets the value of the email property.
   *
   * @param value allowed object is {@link String }
   */
  public void setEmail(String value) {
    this.email = value;
  }

  /**
   * Gets the value of the userID property.
   *
   * @return possible object is {@link String }
   */
  public String getUserID() {
    return userID;
  }

  /**
   * Sets the value of the userID property.
   *
   * @param value allowed object is {@link String }
   */
  public void setUserID(String value) {
    this.userID = value;
  }

  /**
   * Gets the value of the password property.
   *
   * @return possible object is {@link String }
   */
  public String getPassword() {
    return password;
  }

  /**
   * Sets the value of the password property.
   *
   * @param value allowed object is {@link String }
   */
  public void setPassword(String value) {
    this.password = value;
  }

  /**
   * Gets the value of the pin property.
   *
   * @return possible object is {@link Long }
   */
  public Long getPin() {
    return pin;
  }

  /**
   * Sets the value of the pin property.
   *
   * @param value allowed object is {@link Long }
   */
  public void setPin(Long value) {
    this.pin = value;
  }

  /**
   * Gets the value of the phone property.
   *
   * @return possible object is {@link Phone }
   */
  public Phone getPhone() {
    return phone;
  }

  /**
   * Sets the value of the phone property.
   *
   * @param value allowed object is {@link Phone }
   */
  public void setPhone(Phone value) {
    this.phone = value;
  }
}
