//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.23 at 04:10:32 PM EST 
//


package org.apromore.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for ProcessAssociationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessAssociationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcessId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProcessName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BranchName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProcessVersionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProcessVersionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessAssociationsType", propOrder = {
    "processId",
    "processName",
    "branchName",
    "processVersionId",
    "processVersionNumber"
})
public class ProcessAssociationsType
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "ProcessId", required = true)
    protected String processId;
    @XmlElement(name = "ProcessName", required = true)
    protected String processName;
    @XmlElement(name = "BranchName", required = true)
    protected String branchName;
    @XmlElement(name = "ProcessVersionId", required = true)
    protected String processVersionId;
    @XmlElement(name = "ProcessVersionNumber", required = true)
    protected String processVersionNumber;

    /**
     * Gets the value of the processId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessId() {
        return processId;
    }

    /**
     * Sets the value of the processId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessId(String value) {
        this.processId = value;
    }

    /**
     * Gets the value of the processName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessName() {
        return processName;
    }

    /**
     * Sets the value of the processName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessName(String value) {
        this.processName = value;
    }

    /**
     * Gets the value of the branchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * Sets the value of the branchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchName(String value) {
        this.branchName = value;
    }

    /**
     * Gets the value of the processVersionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessVersionId() {
        return processVersionId;
    }

    /**
     * Sets the value of the processVersionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessVersionId(String value) {
        this.processVersionId = value;
    }

    /**
     * Gets the value of the processVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessVersionNumber() {
        return processVersionNumber;
    }

    /**
     * Sets the value of the processVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessVersionNumber(String value) {
        this.processVersionNumber = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            String theProcessId;
            theProcessId = this.getProcessId();
            strategy.appendField(locator, this, "processId", buffer, theProcessId);
        }
        {
            String theProcessName;
            theProcessName = this.getProcessName();
            strategy.appendField(locator, this, "processName", buffer, theProcessName);
        }
        {
            String theBranchName;
            theBranchName = this.getBranchName();
            strategy.appendField(locator, this, "branchName", buffer, theBranchName);
        }
        {
            String theProcessVersionId;
            theProcessVersionId = this.getProcessVersionId();
            strategy.appendField(locator, this, "processVersionId", buffer, theProcessVersionId);
        }
        {
            String theProcessVersionNumber;
            theProcessVersionNumber = this.getProcessVersionNumber();
            strategy.appendField(locator, this, "processVersionNumber", buffer, theProcessVersionNumber);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ProcessAssociationsType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ProcessAssociationsType that = ((ProcessAssociationsType) object);
        {
            String lhsProcessId;
            lhsProcessId = this.getProcessId();
            String rhsProcessId;
            rhsProcessId = that.getProcessId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processId", lhsProcessId), LocatorUtils.property(thatLocator, "processId", rhsProcessId), lhsProcessId, rhsProcessId)) {
                return false;
            }
        }
        {
            String lhsProcessName;
            lhsProcessName = this.getProcessName();
            String rhsProcessName;
            rhsProcessName = that.getProcessName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processName", lhsProcessName), LocatorUtils.property(thatLocator, "processName", rhsProcessName), lhsProcessName, rhsProcessName)) {
                return false;
            }
        }
        {
            String lhsBranchName;
            lhsBranchName = this.getBranchName();
            String rhsBranchName;
            rhsBranchName = that.getBranchName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "branchName", lhsBranchName), LocatorUtils.property(thatLocator, "branchName", rhsBranchName), lhsBranchName, rhsBranchName)) {
                return false;
            }
        }
        {
            String lhsProcessVersionId;
            lhsProcessVersionId = this.getProcessVersionId();
            String rhsProcessVersionId;
            rhsProcessVersionId = that.getProcessVersionId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processVersionId", lhsProcessVersionId), LocatorUtils.property(thatLocator, "processVersionId", rhsProcessVersionId), lhsProcessVersionId, rhsProcessVersionId)) {
                return false;
            }
        }
        {
            String lhsProcessVersionNumber;
            lhsProcessVersionNumber = this.getProcessVersionNumber();
            String rhsProcessVersionNumber;
            rhsProcessVersionNumber = that.getProcessVersionNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processVersionNumber", lhsProcessVersionNumber), LocatorUtils.property(thatLocator, "processVersionNumber", rhsProcessVersionNumber), lhsProcessVersionNumber, rhsProcessVersionNumber)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            String theProcessId;
            theProcessId = this.getProcessId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processId", theProcessId), currentHashCode, theProcessId);
        }
        {
            String theProcessName;
            theProcessName = this.getProcessName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processName", theProcessName), currentHashCode, theProcessName);
        }
        {
            String theBranchName;
            theBranchName = this.getBranchName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "branchName", theBranchName), currentHashCode, theBranchName);
        }
        {
            String theProcessVersionId;
            theProcessVersionId = this.getProcessVersionId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processVersionId", theProcessVersionId), currentHashCode, theProcessVersionId);
        }
        {
            String theProcessVersionNumber;
            theProcessVersionNumber = this.getProcessVersionNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processVersionNumber", theProcessVersionNumber), currentHashCode, theProcessVersionNumber);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
