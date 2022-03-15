//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, vhudson-jaxb-ri-2.1-792
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2020.08.30 at 08:54:50 PM PDT
//

package com.walmart.fms.infrastructure.integration.gateway.store.dto.orderdownload;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for CustomerOrder complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CustomerOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderHeader" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/PlaceFulfillmentOrder/}OrderHeader"/>
 *         &lt;element name="status" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/PlaceFulfillmentOrder/}Status" minOccurs="0"/>
 *         &lt;element name="fee" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/PlaceFulfillmentOrder/}Fee" minOccurs="0"/>
 *         &lt;element name="orderTotal" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="coupon" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/PlaceFulfillmentOrder/}Coupon" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customerInstructions" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/PlaceFulfillmentOrder/}alpha512" minOccurs="0"/>
 *         &lt;element name="IsConfirmationRequested" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "CustomerOrder",
    propOrder = {
      "orderHeader",
      "status",
      "fee",
      "orderTotal",
      "coupon",
      "customerInstructions",
      "isConfirmationRequested"
    })
@XmlSeeAlso({
  com.walmart.fms.infrastructure.integration.gateway.store.dto.orderdownload
      .PlaceFulfillmentOrderRequest.MessageBody.CustomerOrderInfo.CustomerOrder.class
})
public class CustomerOrder {

  @XmlElement(required = true)
  protected OrderHeader orderHeader;

  protected Status status;
  protected Fee fee;
  protected Float orderTotal;
  protected List<Coupon> coupon;
  protected String customerInstructions;

  @XmlElement(name = "IsConfirmationRequested")
  protected Boolean isConfirmationRequested;

  /**
   * Gets the value of the orderHeader property.
   *
   * @return possible object is {@link OrderHeader }
   */
  public OrderHeader getOrderHeader() {
    return orderHeader;
  }

  /**
   * Sets the value of the orderHeader property.
   *
   * @param value allowed object is {@link OrderHeader }
   */
  public void setOrderHeader(OrderHeader value) {
    this.orderHeader = value;
  }

  /**
   * Gets the value of the status property.
   *
   * @return possible object is {@link Status }
   */
  public Status getStatus() {
    return status;
  }

  /**
   * Sets the value of the status property.
   *
   * @param value allowed object is {@link Status }
   */
  public void setStatus(Status value) {
    this.status = value;
  }

  /**
   * Gets the value of the fee property.
   *
   * @return possible object is {@link Fee }
   */
  public Fee getFee() {
    return fee;
  }

  /**
   * Sets the value of the fee property.
   *
   * @param value allowed object is {@link Fee }
   */
  public void setFee(Fee value) {
    this.fee = value;
  }

  /**
   * Gets the value of the orderTotal property.
   *
   * @return possible object is {@link Float }
   */
  public Float getOrderTotal() {
    return orderTotal;
  }

  /**
   * Sets the value of the orderTotal property.
   *
   * @param value allowed object is {@link Float }
   */
  public void setOrderTotal(Float value) {
    this.orderTotal = value;
  }

  /**
   * Gets the value of the coupon property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the coupon property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getCoupon().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link Coupon }
   */
  public List<Coupon> getCoupon() {
    if (coupon == null) {
      coupon = new ArrayList<>();
    }
    return this.coupon;
  }

  /**
   * Gets the value of the customerInstructions property.
   *
   * @return possible object is {@link String }
   */
  public String getCustomerInstructions() {
    return customerInstructions;
  }

  /**
   * Sets the value of the customerInstructions property.
   *
   * @param value allowed object is {@link String }
   */
  public void setCustomerInstructions(String value) {
    this.customerInstructions = value;
  }

  /**
   * Gets the value of the isConfirmationRequested property.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isIsConfirmationRequested() {
    return isConfirmationRequested;
  }

  /**
   * Sets the value of the isConfirmationRequested property.
   *
   * @param value allowed object is {@link Boolean }
   */
  public void setIsConfirmationRequested(Boolean value) {
    this.isConfirmationRequested = value;
  }

  public void setCoupon(List<Coupon> value) {
    this.coupon = null;
    List<Coupon> draftl = this.getCoupon();
    draftl.addAll(value);
  }
}
