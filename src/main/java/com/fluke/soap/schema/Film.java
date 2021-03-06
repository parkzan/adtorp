//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.04 at 04:22:55 PM ICT 
//


package com.fluke.soap.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for film complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="film">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filmId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="releaseYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="languageId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="originalLanguageId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rentalDuration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rentalRate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="replacementCost" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rating" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="specialFeatures" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastUpdate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "film", propOrder = {
    "filmId",
    "title",
    "description",
    "releaseYear",
    "languageId",
    "originalLanguageId",
    "rentalDuration",
    "rentalRate",
    "length",
    "replacementCost",
    "rating",
    "specialFeatures",
    "lastUpdate"
})
public class Film {

    protected int filmId;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String description;
    protected int releaseYear;
    protected int languageId;
    protected int originalLanguageId;
    protected int rentalDuration;
    protected int rentalRate;
    protected int length;
    protected int replacementCost;
    @XmlElement(required = true)
    protected String rating;
    @XmlElement(required = true)
    protected String specialFeatures;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdate;

    /**
     * Gets the value of the filmId property.
     * 
     */
    public int getFilmId() {
        return filmId;
    }

    /**
     * Sets the value of the filmId property.
     * 
     */
    public void setFilmId(int value) {
        this.filmId = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the releaseYear property.
     * 
     */
    public int getReleaseYear() {
        return releaseYear;
    }

    /**
     * Sets the value of the releaseYear property.
     * 
     */
    public void setReleaseYear(int value) {
        this.releaseYear = value;
    }

    /**
     * Gets the value of the languageId property.
     * 
     */
    public int getLanguageId() {
        return languageId;
    }

    /**
     * Sets the value of the languageId property.
     * 
     */
    public void setLanguageId(int value) {
        this.languageId = value;
    }

    /**
     * Gets the value of the originalLanguageId property.
     * 
     */
    public int getOriginalLanguageId() {
        return originalLanguageId;
    }

    /**
     * Sets the value of the originalLanguageId property.
     * 
     */
    public void setOriginalLanguageId(int value) {
        this.originalLanguageId = value;
    }

    /**
     * Gets the value of the rentalDuration property.
     * 
     */
    public int getRentalDuration() {
        return rentalDuration;
    }

    /**
     * Sets the value of the rentalDuration property.
     * 
     */
    public void setRentalDuration(int value) {
        this.rentalDuration = value;
    }

    /**
     * Gets the value of the rentalRate property.
     * 
     */
    public int getRentalRate() {
        return rentalRate;
    }

    /**
     * Sets the value of the rentalRate property.
     * 
     */
    public void setRentalRate(int value) {
        this.rentalRate = value;
    }

    /**
     * Gets the value of the length property.
     * 
     */
    public int getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     */
    public void setLength(int value) {
        this.length = value;
    }

    /**
     * Gets the value of the replacementCost property.
     * 
     */
    public int getReplacementCost() {
        return replacementCost;
    }

    /**
     * Sets the value of the replacementCost property.
     * 
     */
    public void setReplacementCost(int value) {
        this.replacementCost = value;
    }

    /**
     * Gets the value of the rating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRating(String value) {
        this.rating = value;
    }

    /**
     * Gets the value of the specialFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialFeatures() {
        return specialFeatures;
    }

    /**
     * Sets the value of the specialFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialFeatures(String value) {
        this.specialFeatures = value;
    }

    /**
     * Gets the value of the lastUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Sets the value of the lastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdate(XMLGregorianCalendar value) {
        this.lastUpdate = value;
    }

}
