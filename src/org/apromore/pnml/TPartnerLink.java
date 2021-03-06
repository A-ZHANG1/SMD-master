//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.23 at 04:10:21 PM EST 
//


package org.apromore.pnml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * <p>Java class for tPartnerLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tPartnerLink">
 *   &lt;complexContent>
 *     &lt;extension base="{pnml.apromore.org}tExtensibleElements">
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="partnerLinkType" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="myRole" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="partnerRole" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="initializePartnerRole" type="{pnml.apromore.org}tBoolean" />
 *       &lt;attribute name="WSDL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tPartnerLink")
public class TPartnerLink
    extends TExtensibleElements
{

    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlAttribute(name = "partnerLinkType", required = true)
    protected QName partnerLinkType;
    @XmlAttribute(name = "myRole")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String myRole;
    @XmlAttribute(name = "partnerRole")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String partnerRole;
    @XmlAttribute(name = "initializePartnerRole")
    protected TBoolean initializePartnerRole;
    @XmlAttribute(name = "WSDL")
    protected String wsdl;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the partnerLinkType property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getPartnerLinkType() {
        return partnerLinkType;
    }

    /**
     * Sets the value of the partnerLinkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setPartnerLinkType(QName value) {
        this.partnerLinkType = value;
    }

    /**
     * Gets the value of the myRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMyRole() {
        return myRole;
    }

    /**
     * Sets the value of the myRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMyRole(String value) {
        this.myRole = value;
    }

    /**
     * Gets the value of the partnerRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerRole() {
        return partnerRole;
    }

    /**
     * Sets the value of the partnerRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerRole(String value) {
        this.partnerRole = value;
    }

    /**
     * Gets the value of the initializePartnerRole property.
     * 
     * @return
     *     possible object is
     *     {@link TBoolean }
     *     
     */
    public TBoolean getInitializePartnerRole() {
        return initializePartnerRole;
    }

    /**
     * Sets the value of the initializePartnerRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link TBoolean }
     *     
     */
    public void setInitializePartnerRole(TBoolean value) {
        this.initializePartnerRole = value;
    }

    /**
     * Gets the value of the wsdl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWSDL() {
        return wsdl;
    }

    /**
     * Sets the value of the wsdl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWSDL(String value) {
        this.wsdl = value;
    }

}
