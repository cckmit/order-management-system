//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, vhudson-jaxb-ri-2.1-792
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2020.08.31 at 01:59:04 PM PDT
//

package com.walmart.fms.infrastructure.integration.gateway.store.dto.forceordercancellation;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for CarrierBag complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CarrierBag">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carrierBagCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="isCarrierBagRequested" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isCarrierBagCountRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="carrierBagTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "CarrierBag",
    propOrder = {
      "carrierBagCount",
      "isCarrierBagRequested",
      "isCarrierBagCountRequired",
      "carrierBagTotalAmount"
    })
public class CarrierBag {

  protected BigInteger carrierBagCount;
  protected Boolean isCarrierBagRequested;
  protected Boolean isCarrierBagCountRequired;
  protected BigDecimal carrierBagTotalAmount;

  /**
   * Gets the value of the carrierBagCount property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getCarrierBagCount() {
    return carrierBagCount;
  }

  /**
   * Sets the value of the carrierBagCount property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setCarrierBagCount(BigInteger value) {
    this.carrierBagCount = value;
  }

  /**
   * Gets the value of the isCarrierBagRequested property.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isIsCarrierBagRequested() {
    return isCarrierBagRequested;
  }

  /**
   * Sets the value of the isCarrierBagRequested property.
   *
   * @param value allowed object is {@link Boolean }
   */
  public void setIsCarrierBagRequested(Boolean value) {
    this.isCarrierBagRequested = value;
  }

  /**
   * Gets the value of the isCarrierBagCountRequired property.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isIsCarrierBagCountRequired() {
    return isCarrierBagCountRequired;
  }

  /**
   * Sets the value of the isCarrierBagCountRequired property.
   *
   * @param value allowed object is {@link Boolean }
   */
  public void setIsCarrierBagCountRequired(Boolean value) {
    this.isCarrierBagCountRequired = value;
  }

  /**
   * Gets the value of the carrierBagTotalAmount property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getCarrierBagTotalAmount() {
    return carrierBagTotalAmount;
  }

  /**
   * Sets the value of the carrierBagTotalAmount property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setCarrierBagTotalAmount(BigDecimal value) {
    this.carrierBagTotalAmount = value;
  }
}
