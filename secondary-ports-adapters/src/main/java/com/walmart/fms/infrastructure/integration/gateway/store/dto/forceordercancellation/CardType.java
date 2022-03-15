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
 * Java class for CardType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CardType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="AMEX"/>
 *               &lt;enumeration value="ASDA_CREDIT"/>
 *               &lt;enumeration value="ASDA_STORE"/>
 *               &lt;enumeration value="CUP_CREDIT"/>
 *               &lt;enumeration value="DELTA"/>
 *               &lt;enumeration value="DINERS"/>
 *               &lt;enumeration value="DISCOVER"/>
 *               &lt;enumeration value="GE_BUSINESS"/>
 *               &lt;enumeration value="GE_DIRECT"/>
 *               &lt;enumeration value="GE_PERSONAL"/>
 *               &lt;enumeration value="JAPAN_CREDIT"/>
 *               &lt;enumeration value="MASTERCARD"/>
 *               &lt;enumeration value="SAMS_DUAL_BUSINESS"/>
 *               &lt;enumeration value="SAMS_DUAL_CONSUMER"/>
 *               &lt;enumeration value="SEIYU"/>
 *               &lt;enumeration value="SOLO"/>
 *               &lt;enumeration value="VISA"/>
 *               &lt;enumeration value="VISA_ELECTRON"/>
 *               &lt;enumeration value="WM_BUSINESS"/>
 *               &lt;enumeration value="WM_COMMUNITY"/>
 *               &lt;enumeration value="WM_CREDIT"/>
 *               &lt;enumeration value="WM_DISCOVER"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="description" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}alpha255" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "CardType",
    propOrder = {"code", "description"})
public class CardType {

  protected String code;
  protected String description;

  /**
   * Gets the value of the code property.
   *
   * @return possible object is {@link String }
   */
  public String getCode() {
    return code;
  }

  /**
   * Sets the value of the code property.
   *
   * @param value allowed object is {@link String }
   */
  public void setCode(String value) {
    this.code = value;
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
}
