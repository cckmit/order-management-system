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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for Node complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Node">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="location" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/PlaceFulfillmentOrder/}Location"/>
 *         &lt;element name="nodeID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *               &lt;minInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="type" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="HO"/>
 *               &lt;enumeration value="PMDC"/>
 *               &lt;enumeration value="RHO"/>
 *               &lt;enumeration value="apparelDC"/>
 *               &lt;enumeration value="dcStore"/>
 *               &lt;enumeration value="destination"/>
 *               &lt;enumeration value="dotcom"/>
 *               &lt;enumeration value="dsv"/>
 *               &lt;enumeration value="eCommerceRetail"/>
 *               &lt;enumeration value="eCommerceRetailSpecialty"/>
 *               &lt;enumeration value="eCommerceRetailWarehouseDC"/>
 *               &lt;enumeration value="eCommerceWholesale"/>
 *               &lt;enumeration value="ecomDC"/>
 *               &lt;enumeration value="gasStations"/>
 *               &lt;enumeration value="groceryDC"/>
 *               &lt;enumeration value="importsDC"/>
 *               &lt;enumeration value="importsWholesale"/>
 *               &lt;enumeration value="inboundTransportation"/>
 *               &lt;enumeration value="logisticsEliminations"/>
 *               &lt;enumeration value="pharmacyDC"/>
 *               &lt;enumeration value="regionalDC"/>
 *               &lt;enumeration value="retail"/>
 *               &lt;enumeration value="retailConnectivity"/>
 *               &lt;enumeration value="retailFinancialServices"/>
 *               &lt;enumeration value="retailOptical"/>
 *               &lt;enumeration value="retailPharmacy"/>
 *               &lt;enumeration value="retailPhotoCenter"/>
 *               &lt;enumeration value="retailShoes"/>
 *               &lt;enumeration value="retailSpecialty"/>
 *               &lt;enumeration value="retailSpecialtyWarehouse/DC"/>
 *               &lt;enumeration value="retailTLE"/>
 *               &lt;enumeration value="retailWarehouse/DC"/>
 *               &lt;enumeration value="returnCenter"/>
 *               &lt;enumeration value="samsclub"/>
 *               &lt;enumeration value="serviceBanking"/>
 *               &lt;enumeration value="serviceCenter"/>
 *               &lt;enumeration value="serviceParkingLot"/>
 *               &lt;enumeration value="serviceRestaurant"/>
 *               &lt;enumeration value="serviceRestaurantWarehouse/DC"/>
 *               &lt;enumeration value="store"/>
 *               &lt;enumeration value="supplier"/>
 *               &lt;enumeration value="transportation"/>
 *               &lt;enumeration value="transportationRetail"/>
 *               &lt;enumeration value="warehouse/DC"/>
 *               &lt;enumeration value="wholesale"/>
 *               &lt;enumeration value="wholesaleConnectivity"/>
 *               &lt;enumeration value="wholesaleOptical"/>
 *               &lt;enumeration value="wholesalePharmacy"/>
 *               &lt;enumeration value="wholesalePhotoCenter"/>
 *               &lt;enumeration value="wholesaleTMA"/>
 *               &lt;enumeration value="wholesaleWarehouse/DC"/>
 *               &lt;enumeration value="wpm"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="baseDivision" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/PlaceFulfillmentOrder/}BaseDivision" minOccurs="0"/>
 *         &lt;element name="financialNodeId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "Node",
    propOrder = {"location", "nodeID", "type", "baseDivision", "financialNodeId"})
public class Node {

  @XmlElement(required = true)
  protected Location location;

  protected long nodeID;
  protected String type;
  protected BaseDivision baseDivision;

  @XmlSchemaType(name = "unsignedInt")
  protected Long financialNodeId;

  /**
   * Gets the value of the location property.
   *
   * @return possible object is {@link Location }
   */
  public Location getLocation() {
    return location;
  }

  /**
   * Sets the value of the location property.
   *
   * @param value allowed object is {@link Location }
   */
  public void setLocation(Location value) {
    this.location = value;
  }

  /** Gets the value of the nodeID property. */
  public long getNodeID() {
    return nodeID;
  }

  /** Sets the value of the nodeID property. */
  public void setNodeID(long value) {
    this.nodeID = value;
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
   * Gets the value of the baseDivision property.
   *
   * @return possible object is {@link BaseDivision }
   */
  public BaseDivision getBaseDivision() {
    return baseDivision;
  }

  /**
   * Sets the value of the baseDivision property.
   *
   * @param value allowed object is {@link BaseDivision }
   */
  public void setBaseDivision(BaseDivision value) {
    this.baseDivision = value;
  }

  /**
   * Gets the value of the financialNodeId property.
   *
   * @return possible object is {@link Long }
   */
  public Long getFinancialNodeId() {
    return financialNodeId;
  }

  /**
   * Sets the value of the financialNodeId property.
   *
   * @param value allowed object is {@link Long }
   */
  public void setFinancialNodeId(Long value) {
    this.financialNodeId = value;
  }
}