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
 * Java class for CommunicationMethod complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CommunicationMethod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}alpha100" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "CommunicationMethod",
    propOrder = {"code", "description"})
public class CommunicationMethod {

  @XmlSchemaType(name = "unsignedShort")
  protected Integer code;

  protected String description;

  /**
   * Gets the value of the code property.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getCode() {
    return code;
  }

  /**
   * Sets the value of the code property.
   *
   * @param value allowed object is {@link Integer }
   */
  public void setCode(Integer value) {
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
