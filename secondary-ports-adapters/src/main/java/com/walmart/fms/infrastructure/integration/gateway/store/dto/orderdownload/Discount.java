//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, vhudson-jaxb-ri-2.1-792
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2020.08.30 at 08:54:50 PM PDT
//

package com.walmart.fms.infrastructure.integration.gateway.store.dto.orderdownload;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for Discount complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Discount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/PlaceFulfillmentOrder/}Amount" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/PlaceFulfillmentOrder/}alpha50" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="percent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "Discount",
    propOrder = {"amount", "type", "description", "percent"})
@XmlSeeAlso({
  com.walmart.fms.infrastructure.integration.gateway.store.dto.orderdownload
      .PlaceFulfillmentOrderRequest.MessageBody.CustomerOrderInfo.CustomerOrder.FulfillmentOrders
      .OrderLines.Discount.class
})
public class Discount {

  protected Amount amount;
  protected String type;
  protected String description;
  protected BigDecimal percent;

  /**
   * Gets the value of the amount property.
   *
   * @return possible object is {@link Amount }
   */
  public Amount getAmount() {
    return amount;
  }

  /**
   * Sets the value of the amount property.
   *
   * @param value allowed object is {@link Amount }
   */
  public void setAmount(Amount value) {
    this.amount = value;
  }

  /**
   * Gets the value of the type property.
   *
   * @return possible object is {@link String }
   */
  public String getType() {
    return type;
  }

  /**
   * Sets the value of the type property.
   *
   * @param value allowed object is {@link String }
   */
  public void setType(String value) {
    this.type = value;
  }

  /**
   * Gets the value of the description property.
   *
   * @return possible object is {@link String }
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets the value of the description property.
   *
   * @param value allowed object is {@link String }
   */
  public void setDescription(String value) {
    this.description = value;
  }

  /**
   * Gets the value of the percent property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getPercent() {
    return percent;
  }

  /**
   * Sets the value of the percent property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setPercent(BigDecimal value) {
    this.percent = value;
  }
}
