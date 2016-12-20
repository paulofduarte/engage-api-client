//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.25 at 11:03:15 AM EDT 
//


package com.silverpop.api.client.command.elements;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpressionElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpressionElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AND_OR" type="{SilverpopApi:EngageService.ListMgmt.UserActions}AndOr" minOccurs="0"/>
 *         &lt;element name="TYPE" type="{SilverpopApi:EngageService.ListMgmt.UserActions}ExpressionType" minOccurs="0"/>
 *         &lt;element name="COLUMN_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OPERATORS" type="{SilverpopApi:EngageService.ListMgmt.UserActions}Operators" minOccurs="0"/>
 *         &lt;element name="VALUES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TABLE_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RIGHT_PARENS" type="{SilverpopApi:EngageService.ListMgmt.UserActions}RightParens" minOccurs="0"/>
 *         &lt;element name="LEFT_PARENS" type="{SilverpopApi:EngageService.ListMgmt.UserActions}LeftParens" minOccurs="0"/>
 *         &lt;element name="RT_EXPRESSION" type="{SilverpopApi:EngageService.ListMgmt.UserActions}RTExpressionElementType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XStreamAlias("EXPRESSION")
public class ExpressionElementType {

    @XStreamAlias("AND_OR")
    protected String andor;
    @XStreamAlias("TYPE")
    protected String type;
    @XStreamAlias("COLUMN_NAME")
    protected String columnname;
    @XStreamAlias("OPERATORS")
    protected String operators;
    @XStreamAlias("VALUES")
    protected String values;
    @XStreamAlias("TABLE_ID")
    protected Long tableid;
    @XStreamAlias("RIGHT_PARENS")
    protected String rightparens;
    @XStreamAlias("LEFT_PARENS")
    protected String leftparens;
    @XStreamImplicit(itemFieldName = "RT_EXPRESSION")
    protected List<RTExpressionElementType> rtexpressions;

    /**
     * Gets the value of the andor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANDOR() {
        return andor;
    }

    /**
     * Sets the value of the andor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANDOR(String value) {
        this.andor = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPE(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the columnname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOLUMNNAME() {
        return columnname;
    }

    /**
     * Sets the value of the columnname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOLUMNNAME(String value) {
        this.columnname = value;
    }

    /**
     * Gets the value of the operators property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPERATORS() {
        return operators;
    }

    /**
     * Sets the value of the operators property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPERATORS(String value) {
        this.operators = value;
    }

    /**
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALUES() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALUES(String value) {
        this.values = value;
    }

    /**
     * Gets the value of the tableid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTABLEID() {
        return tableid;
    }

    /**
     * Sets the value of the tableid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTABLEID(Long value) {
        this.tableid = value;
    }

    /**
     * Gets the value of the rightparens property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIGHTPARENS() {
        return rightparens;
    }

    /**
     * Sets the value of the rightparens property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIGHTPARENS(String value) {
        this.rightparens = value;
    }

    /**
     * Gets the value of the leftparens property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEFTPARENS() {
        return leftparens;
    }

    /**
     * Sets the value of the leftparens property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEFTPARENS(String value) {
        this.leftparens = value;
    }

    /**
     * Gets the value of the rtexpressions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rtexpressions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRTEXPRESSIONS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RTExpressionElementType }
     * 
     * 
     */
    public List<RTExpressionElementType> getRTEXPRESSIONS() {
        if (rtexpressions == null) {
            rtexpressions = new ArrayList<RTExpressionElementType>();
        }
        return this.rtexpressions;
    }

}