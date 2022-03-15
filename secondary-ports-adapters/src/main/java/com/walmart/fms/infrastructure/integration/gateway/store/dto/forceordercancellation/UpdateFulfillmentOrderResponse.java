//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, vhudson-jaxb-ri-2.1-792
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2020.08.31 at 01:59:04 PM PDT
//

package com.walmart.fms.infrastructure.integration.gateway.store.dto.forceordercancellation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.xmlns.walmartstores.com/Header/datatypes/MessageHeader/1.4/}MessageHeader"/>
 *         &lt;element name="MessageBody">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="customerOrder">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}CustomerOrder">
 *                           &lt;sequence>
 *                             &lt;element name="fulfillmentOrder" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}FulfillmentOrder">
 *                                     &lt;sequence>
 *                                       &lt;element name="orderLines" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}OrderLine">
 *                                               &lt;sequence>
 *                                                 &lt;element name="package" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}Package" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="packages" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}Package">
 *                                               &lt;sequence>
 *                                                 &lt;element name="deliveryDetails" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}DeliveryDetails" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="originatingNode" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}Node"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="responseMessage" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}ResponseMessage" minOccurs="0"/>
 *                   &lt;element name="MessageExtensions" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}MessageExtension" maxOccurs="10" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {"messageHeader", "messageBody"})
@XmlRootElement(name = "UpdateFulfillmentOrderResponse")
public class UpdateFulfillmentOrderResponse {

  @XmlElement(
      name = "MessageHeader",
      namespace = "http://www.xmlns.walmartstores.com/Header/datatypes/MessageHeader/1.4/",
      required = true)
  protected MessageHeader messageHeader;

  @XmlElement(name = "MessageBody", required = true)
  protected UpdateFulfillmentOrderResponse.MessageBody messageBody;

  /**
   * Gets the value of the messageHeader property.
   *
   * @return possible object is {@link MessageHeader }
   */
  public MessageHeader getMessageHeader() {
    return messageHeader;
  }

  /**
   * Sets the value of the messageHeader property.
   *
   * @param value allowed object is {@link MessageHeader }
   */
  public void setMessageHeader(MessageHeader value) {
    this.messageHeader = value;
  }

  /**
   * Gets the value of the messageBody property.
   *
   * @return possible object is {@link UpdateFulfillmentOrderResponse.MessageBody }
   */
  public UpdateFulfillmentOrderResponse.MessageBody getMessageBody() {
    return messageBody;
  }

  /**
   * Sets the value of the messageBody property.
   *
   * @param value allowed object is {@link UpdateFulfillmentOrderResponse.MessageBody }
   */
  public void setMessageBody(UpdateFulfillmentOrderResponse.MessageBody value) {
    this.messageBody = value;
  }

  /**
   * Java class for anonymous complex type.
   *
   * <p>The following schema fragment specifies the expected content contained within this class.
   *
   * <pre>
   * &lt;complexType>
   *   &lt;complexContent>
   *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *       &lt;sequence>
   *         &lt;element name="customerOrder">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;extension base="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}CustomerOrder">
   *                 &lt;sequence>
   *                   &lt;element name="fulfillmentOrder" maxOccurs="unbounded">
   *                     &lt;complexType>
   *                       &lt;complexContent>
   *                         &lt;extension base="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}FulfillmentOrder">
   *                           &lt;sequence>
   *                             &lt;element name="orderLines" maxOccurs="unbounded" minOccurs="0">
   *                               &lt;complexType>
   *                                 &lt;complexContent>
   *                                   &lt;extension base="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}OrderLine">
   *                                     &lt;sequence>
   *                                       &lt;element name="package" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}Package" minOccurs="0"/>
   *                                     &lt;/sequence>
   *                                   &lt;/extension>
   *                                 &lt;/complexContent>
   *                               &lt;/complexType>
   *                             &lt;/element>
   *                             &lt;element name="packages" maxOccurs="unbounded" minOccurs="0">
   *                               &lt;complexType>
   *                                 &lt;complexContent>
   *                                   &lt;extension base="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}Package">
   *                                     &lt;sequence>
   *                                       &lt;element name="deliveryDetails" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}DeliveryDetails" minOccurs="0"/>
   *                                     &lt;/sequence>
   *                                   &lt;/extension>
   *                                 &lt;/complexContent>
   *                               &lt;/complexType>
   *                             &lt;/element>
   *                           &lt;/sequence>
   *                         &lt;/extension>
   *                       &lt;/complexContent>
   *                     &lt;/complexType>
   *                   &lt;/element>
   *                   &lt;element name="originatingNode" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}Node"/>
   *                 &lt;/sequence>
   *               &lt;/extension>
   *             &lt;/complexContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="responseMessage" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}ResponseMessage" minOccurs="0"/>
   *         &lt;element name="MessageExtensions" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}MessageExtension" maxOccurs="10" minOccurs="0"/>
   *       &lt;/sequence>
   *     &lt;/restriction>
   *   &lt;/complexContent>
   * &lt;/complexType>
   * </pre>
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {"customerOrder", "responseMessage", "messageExtensions"})
  public static class MessageBody {

    @XmlElement(required = true)
    protected UpdateFulfillmentOrderResponse.MessageBody.CustomerOrder customerOrder;

    protected ResponseMessage responseMessage;

    @XmlElement(name = "MessageExtensions")
    protected List<MessageExtension> messageExtensions;

    /**
     * Gets the value of the customerOrder property.
     *
     * @return possible object is {@link UpdateFulfillmentOrderResponse.MessageBody.CustomerOrder }
     */
    public UpdateFulfillmentOrderResponse.MessageBody.CustomerOrder getCustomerOrder() {
      return customerOrder;
    }

    /**
     * Sets the value of the customerOrder property.
     *
     * @param value allowed object is {@link
     *     UpdateFulfillmentOrderResponse.MessageBody.CustomerOrder }
     */
    public void setCustomerOrder(UpdateFulfillmentOrderResponse.MessageBody.CustomerOrder value) {
      this.customerOrder = value;
    }

    /**
     * Gets the value of the responseMessage property.
     *
     * @return possible object is {@link ResponseMessage }
     */
    public ResponseMessage getResponseMessage() {
      return responseMessage;
    }

    /**
     * Sets the value of the responseMessage property.
     *
     * @param value allowed object is {@link ResponseMessage }
     */
    public void setResponseMessage(ResponseMessage value) {
      this.responseMessage = value;
    }

    /**
     * Gets the value of the messageExtensions property.
     *
     * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the messageExtensions property.
     *
     * <p>For example, to add a new item, do as follows:
     *
     * <pre>
     *    getMessageExtensions().add(newItem);
     * </pre>
     *
     * <p>Objects of the following type(s) are allowed in the list {@link MessageExtension }
     */
    public List<MessageExtension> getMessageExtensions() {
      if (messageExtensions == null) {
        messageExtensions = new ArrayList<>();
      }
      return this.messageExtensions;
    }

    public void setMessageExtensions(List<MessageExtension> value) {
      this.messageExtensions = null;
      List<MessageExtension> draftl = this.getMessageExtensions();
      draftl.addAll(value);
    }

    /**
     * Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}CustomerOrder">
     *       &lt;sequence>
     *         &lt;element name="fulfillmentOrder" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}FulfillmentOrder">
     *                 &lt;sequence>
     *                   &lt;element name="orderLines" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}OrderLine">
     *                           &lt;sequence>
     *                             &lt;element name="package" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}Package" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="packages" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}Package">
     *                           &lt;sequence>
     *                             &lt;element name="deliveryDetails" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}DeliveryDetails" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="originatingNode" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}Node"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {"fulfillmentOrder", "originatingNode"})
    public static class CustomerOrder
        extends com.walmart.fms.infrastructure.integration.gateway.store.dto.forceordercancellation
            .CustomerOrder {

      @XmlElement(required = true)
      protected List<UpdateFulfillmentOrderResponse.MessageBody.CustomerOrder.FulfillmentOrder>
          fulfillmentOrder;

      @XmlElement(required = true)
      protected Node originatingNode;

      /**
       * Gets the value of the fulfillmentOrder property.
       *
       * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
       * modification you make to the returned list will be present inside the JAXB object. This is
       * why there is not a <CODE>set</CODE> method for the fulfillmentOrder property.
       *
       * <p>For example, to add a new item, do as follows:
       *
       * <pre>
       *    getFulfillmentOrder().add(newItem);
       * </pre>
       *
       * <p>Objects of the following type(s) are allowed in the list {@link
       * UpdateFulfillmentOrderResponse.MessageBody.CustomerOrder.FulfillmentOrder }
       */
      public List<UpdateFulfillmentOrderResponse.MessageBody.CustomerOrder.FulfillmentOrder>
          getFulfillmentOrder() {
        if (fulfillmentOrder == null) {
          fulfillmentOrder = new ArrayList<>();
        }
        return this.fulfillmentOrder;
      }

      /**
       * Gets the value of the originatingNode property.
       *
       * @return possible object is {@link Node }
       */
      public Node getOriginatingNode() {
        return originatingNode;
      }

      /**
       * Sets the value of the originatingNode property.
       *
       * @param value allowed object is {@link Node }
       */
      public void setOriginatingNode(Node value) {
        this.originatingNode = value;
      }

      public void setFulfillmentOrder(
          List<UpdateFulfillmentOrderResponse.MessageBody.CustomerOrder.FulfillmentOrder> value) {
        this.fulfillmentOrder = null;
        List<UpdateFulfillmentOrderResponse.MessageBody.CustomerOrder.FulfillmentOrder> draftl =
            this.getFulfillmentOrder();
        draftl.addAll(value);
      }

      /**
       * Java class for anonymous complex type.
       *
       * <p>The following schema fragment specifies the expected content contained within this
       * class.
       *
       * <pre>
       * &lt;complexType>
       *   &lt;complexContent>
       *     &lt;extension base="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}FulfillmentOrder">
       *       &lt;sequence>
       *         &lt;element name="orderLines" maxOccurs="unbounded" minOccurs="0">
       *           &lt;complexType>
       *             &lt;complexContent>
       *               &lt;extension base="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}OrderLine">
       *                 &lt;sequence>
       *                   &lt;element name="package" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}Package" minOccurs="0"/>
       *                 &lt;/sequence>
       *               &lt;/extension>
       *             &lt;/complexContent>
       *           &lt;/complexType>
       *         &lt;/element>
       *         &lt;element name="packages" maxOccurs="unbounded" minOccurs="0">
       *           &lt;complexType>
       *             &lt;complexContent>
       *               &lt;extension base="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}Package">
       *                 &lt;sequence>
       *                   &lt;element name="deliveryDetails" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}DeliveryDetails" minOccurs="0"/>
       *                 &lt;/sequence>
       *               &lt;/extension>
       *             &lt;/complexContent>
       *           &lt;/complexType>
       *         &lt;/element>
       *       &lt;/sequence>
       *     &lt;/extension>
       *   &lt;/complexContent>
       * &lt;/complexType>
       * </pre>
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {"orderLines", "packages"})
      public static class FulfillmentOrder
          extends com.walmart.fms.infrastructure.integration.gateway.store.dto
              .forceordercancellation.FulfillmentOrder {

        protected List<
                UpdateFulfillmentOrderResponse.MessageBody.CustomerOrder.FulfillmentOrder
                    .OrderLines>
            orderLines;
        protected List<
                UpdateFulfillmentOrderResponse.MessageBody.CustomerOrder.FulfillmentOrder.Packages>
            packages;

        /**
         * Gets the value of the orderLines property.
         *
         * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore
         * any modification you make to the returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the orderLines property.
         *
         * <p>For example, to add a new item, do as follows:
         *
         * <pre>
         *    getOrderLines().add(newItem);
         * </pre>
         *
         * <p>Objects of the following type(s) are allowed in the list {@link
         * UpdateFulfillmentOrderResponse.MessageBody.CustomerOrder.FulfillmentOrder.OrderLines }
         */
        public List<
                UpdateFulfillmentOrderResponse.MessageBody.CustomerOrder.FulfillmentOrder
                    .OrderLines>
            getOrderLines() {
          if (orderLines == null) {
            orderLines = new ArrayList<>();
          }
          return this.orderLines;
        }

        /**
         * Gets the value of the packages property.
         *
         * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore
         * any modification you make to the returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the packages property.
         *
         * <p>For example, to add a new item, do as follows:
         *
         * <pre>
         *    getPackages().add(newItem);
         * </pre>
         *
         * <p>Objects of the following type(s) are allowed in the list {@link
         * UpdateFulfillmentOrderResponse.MessageBody.CustomerOrder.FulfillmentOrder.Packages }
         */
        public List<
                UpdateFulfillmentOrderResponse.MessageBody.CustomerOrder.FulfillmentOrder.Packages>
            getPackages() {
          if (packages == null) {
            packages = new ArrayList<>();
          }
          return this.packages;
        }

        public void setOrderLines(
            List<
                    UpdateFulfillmentOrderResponse.MessageBody.CustomerOrder.FulfillmentOrder
                        .OrderLines>
                value) {
          this.orderLines = null;
          List<UpdateFulfillmentOrderResponse.MessageBody.CustomerOrder.FulfillmentOrder.OrderLines>
              draftl = this.getOrderLines();
          draftl.addAll(value);
        }

        public void setPackages(
            List<UpdateFulfillmentOrderResponse.MessageBody.CustomerOrder.FulfillmentOrder.Packages>
                value) {
          this.packages = null;
          List<UpdateFulfillmentOrderResponse.MessageBody.CustomerOrder.FulfillmentOrder.Packages>
              draftl = this.getPackages();
          draftl.addAll(value);
        }

        /**
         * Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this
         * class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}OrderLine">
         *       &lt;sequence>
         *         &lt;element name="package" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}Package" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {"_package"})
        public static class OrderLines extends OrderLine {

          @XmlElement(name = "package")
          protected Package _package;

          /**
           * Gets the value of the package property.
           *
           * @return possible object is {@link Package }
           */
          public Package getPackage() {
            return _package;
          }

          /**
           * Sets the value of the package property.
           *
           * @param value allowed object is {@link Package }
           */
          public void setPackage(Package value) {
            this._package = value;
          }
        }

        /**
         * Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this
         * class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}Package">
         *       &lt;sequence>
         *         &lt;element name="deliveryDetails" type="{http://www.xmlns.walmartstores.com/SupplyChain/FulfillmentManagement/datatypes/UpdateFulfillmentOrder/}DeliveryDetails" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {"deliveryDetails"})
        public static class Packages extends Package {

          protected DeliveryDetails deliveryDetails;

          /**
           * Gets the value of the deliveryDetails property.
           *
           * @return possible object is {@link DeliveryDetails }
           */
          public DeliveryDetails getDeliveryDetails() {
            return deliveryDetails;
          }

          /**
           * Sets the value of the deliveryDetails property.
           *
           * @param value allowed object is {@link DeliveryDetails }
           */
          public void setDeliveryDetails(DeliveryDetails value) {
            this.deliveryDetails = value;
          }
        }
      }
    }
  }
}
