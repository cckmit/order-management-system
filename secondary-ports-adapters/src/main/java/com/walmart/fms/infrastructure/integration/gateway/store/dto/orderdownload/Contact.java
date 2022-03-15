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
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for Contact complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Contact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="email" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/PlaceFulfillmentOrder/}email" minOccurs="0"/>
 *         &lt;element name="faxNumber" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/PlaceFulfillmentOrder/}Phone" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/PlaceFulfillmentOrder/}Phone" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "Contact",
    propOrder = {"email", "faxNumber", "phone"})
public class Contact {

  protected String email;
  protected Phone faxNumber;
  protected List<Phone> phone;

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
   * Gets the value of the faxNumber property.
   *
   * @return possible object is {@link Phone }
   */
  public Phone getFaxNumber() {
    return faxNumber;
  }

  /**
   * Sets the value of the faxNumber property.
   *
   * @param value allowed object is {@link Phone }
   */
  public void setFaxNumber(Phone value) {
    this.faxNumber = value;
  }

  /**
   * Gets the value of the phone property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the phone property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getPhone().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link Phone }
   */
  public List<Phone> getPhone() {
    if (phone == null) {
      phone = new ArrayList<>();
    }
    return this.phone;
  }

  public void setPhone(List<Phone> value) {
    this.phone = null;
    List<Phone> draftl = this.getPhone();
    draftl.addAll(value);
  }
}
