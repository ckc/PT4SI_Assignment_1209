
package Web_Service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Edu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Edu"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="preprimary" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="primary" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lowersecondary" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ippersecondary" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="diploma" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="subdegreel" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="degree" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Edu", propOrder = {
    "type",
    "preprimary",
    "primary",
    "lowersecondary",
    "ippersecondary",
    "diploma",
    "subdegreel",
    "degree",
    "total"
})
public class Edu {

    protected String type;
    protected int preprimary;
    protected int primary;
    protected int lowersecondary;
    protected int ippersecondary;
    protected int diploma;
    protected int subdegreel;
    protected int degree;
    protected int total;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
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
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the preprimary property.
     * 
     */
    public int getPreprimary() {
        return preprimary;
    }

    /**
     * Sets the value of the preprimary property.
     * 
     */
    public void setPreprimary(int value) {
        this.preprimary = value;
    }

    /**
     * Gets the value of the primary property.
     * 
     */
    public int getPrimary() {
        return primary;
    }

    /**
     * Sets the value of the primary property.
     * 
     */
    public void setPrimary(int value) {
        this.primary = value;
    }

    /**
     * Gets the value of the lowersecondary property.
     * 
     */
    public int getLowersecondary() {
        return lowersecondary;
    }

    /**
     * Sets the value of the lowersecondary property.
     * 
     */
    public void setLowersecondary(int value) {
        this.lowersecondary = value;
    }

    /**
     * Gets the value of the ippersecondary property.
     * 
     */
    public int getIppersecondary() {
        return ippersecondary;
    }

    /**
     * Sets the value of the ippersecondary property.
     * 
     */
    public void setIppersecondary(int value) {
        this.ippersecondary = value;
    }

    /**
     * Gets the value of the diploma property.
     * 
     */
    public int getDiploma() {
        return diploma;
    }

    /**
     * Sets the value of the diploma property.
     * 
     */
    public void setDiploma(int value) {
        this.diploma = value;
    }

    /**
     * Gets the value of the subdegreel property.
     * 
     */
    public int getSubdegreel() {
        return subdegreel;
    }

    /**
     * Sets the value of the subdegreel property.
     * 
     */
    public void setSubdegreel(int value) {
        this.subdegreel = value;
    }

    /**
     * Gets the value of the degree property.
     * 
     */
    public int getDegree() {
        return degree;
    }

    /**
     * Sets the value of the degree property.
     * 
     */
    public void setDegree(int value) {
        this.degree = value;
    }

    /**
     * Gets the value of the total property.
     * 
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     */
    public void setTotal(int value) {
        this.total = value;
    }

}
