//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, vhudson-jaxb-ri-2.1-792
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2020.08.31 at 01:59:04 PM PDT
//

package com.walmart.fms.infrastructure.integration.gateway.store.dto.forceordercancellation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for AlternatePickupContact complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AlternatePickupContact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstName" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}alpha50" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}alpha50" minOccurs="0"/>
 *         &lt;element name="contact" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}Contact" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "AlternatePickupContact",
    propOrder = {"firstName", "lastName", "contact"})
public class AlternatePickupContact {

  protected String firstName;
  protected String lastName;
  protected Contact contact;

  /**
   * Gets the value of the firstName property.
   *
   * @return possible object is {@link String }
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Sets the value of the firstName property.
   *
   * @param value allowed object is {@link String }
   */
  public void setFirstName(String value) {
    this.firstName = value;
  }

  /**
   * Gets the value of the lastName property.
   *
   * @return possible object is {@link String }
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Sets the value of the lastName property.
   *
   * @param value allowed object is {@link String }
   */
  public void setLastName(String value) {
    this.lastName = value;
  }

  /**
   * Gets the value of the contact property.
   *
   * @return possible object is {@link Contact }
   */
  public Contact getContact() {
    return contact;
  }

  /**
   * Sets the value of the contact property.
   *
   * @param value allowed object is {@link Contact }
   */
  public void setContact(Contact value) {
    this.contact = value;
  }
}
