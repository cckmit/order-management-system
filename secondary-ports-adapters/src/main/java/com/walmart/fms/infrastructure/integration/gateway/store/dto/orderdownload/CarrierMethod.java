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
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for CarrierMethod complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CarrierMethod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carrierMethodCode" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/PlaceFulfillmentOrder/}alpha10" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/PlaceFulfillmentOrder/}alpha100" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "CarrierMethod",
    propOrder = {"carrierMethodCode", "name"})
public class CarrierMethod {

  protected String carrierMethodCode;
  protected String name;

  /**
   * Gets the value of the carrierMethodCode property.
   *
   * @return possible object is {@link String }
   */
  public String getCarrierMethodCode() {
    return carrierMethodCode;
  }

  /**
   * Sets the value of the carrierMethodCode property.
   *
   * @param value allowed object is {@link String }
   */
  public void setCarrierMethodCode(String value) {
    this.carrierMethodCode = value;
  }

  /**
   * Gets the value of the name property.
   *
   * @return possible object is {@link String }
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the value of the name property.
   *
   * @param value allowed object is {@link String }
   */
  public void setName(String value) {
    this.name = value;
  }
}
