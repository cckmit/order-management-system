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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for PickupDetails complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PickupDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alternatePickupContact" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}AlternatePickupContact"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "PickupDetails",
    propOrder = {"alternatePickupContact"})
public class PickupDetails {

  @XmlElement(required = true)
  protected AlternatePickupContact alternatePickupContact;

  /**
   * Gets the value of the alternatePickupContact property.
   *
   * @return possible object is {@link AlternatePickupContact }
   */
  public AlternatePickupContact getAlternatePickupContact() {
    return alternatePickupContact;
  }

  /**
   * Sets the value of the alternatePickupContact property.
   *
   * @param value allowed object is {@link AlternatePickupContact }
   */
  public void setAlternatePickupContact(AlternatePickupContact value) {
    this.alternatePickupContact = value;
  }
}
