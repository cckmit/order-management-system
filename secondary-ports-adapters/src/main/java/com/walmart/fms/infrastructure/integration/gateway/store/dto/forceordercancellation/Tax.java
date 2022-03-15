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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for Tax complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Tax">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}Amount" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}alpha50" minOccurs="0"/>
 *         &lt;element name="discount" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}Discount" minOccurs="0"/>
 *         &lt;element name="taxAdjustment" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}TaxAdjustment" minOccurs="0"/>
 *         &lt;element name="taxRate" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}ChargeRate" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "Tax",
    propOrder = {"amount", "type", "discount", "taxAdjustment", "taxRate", "id"})
public class Tax {

  protected Amount amount;
  protected String type;
  protected Discount discount;
  protected TaxAdjustment taxAdjustment;
  protected ChargeRate taxRate;

  @XmlSchemaType(name = "unsignedInt")
  protected Long id;

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
   * Gets the value of the discount property.
   *
   * @return possible object is {@link Discount }
   */
  public Discount getDiscount() {
    return discount;
  }

  /**
   * Sets the value of the discount property.
   *
   * @param value allowed object is {@link Discount }
   */
  public void setDiscount(Discount value) {
    this.discount = value;
  }

  /**
   * Gets the value of the taxAdjustment property.
   *
   * @return possible object is {@link TaxAdjustment }
   */
  public TaxAdjustment getTaxAdjustment() {
    return taxAdjustment;
  }

  /**
   * Sets the value of the taxAdjustment property.
   *
   * @param value allowed object is {@link TaxAdjustment }
   */
  public void setTaxAdjustment(TaxAdjustment value) {
    this.taxAdjustment = value;
  }

  /**
   * Gets the value of the taxRate property.
   *
   * @return possible object is {@link ChargeRate }
   */
  public ChargeRate getTaxRate() {
    return taxRate;
  }

  /**
   * Sets the value of the taxRate property.
   *
   * @param value allowed object is {@link ChargeRate }
   */
  public void setTaxRate(ChargeRate value) {
    this.taxRate = value;
  }

  /**
   * Gets the value of the id property.
   *
   * @return possible object is {@link Long }
   */
  public Long getId() {
    return id;
  }

  /**
   * Sets the value of the id property.
   *
   * @param value allowed object is {@link Long }
   */
  public void setId(Long value) {
    this.id = value;
  }
}
