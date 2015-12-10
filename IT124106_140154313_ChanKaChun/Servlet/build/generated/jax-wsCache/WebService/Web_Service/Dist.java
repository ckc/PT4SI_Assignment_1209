
package Web_Service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dist complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dist"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="per" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="pop" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dist", propOrder = {
    "type",
    "per",
    "pop"
})
public class Dist {

    protected String type;
    protected double per;
    protected int pop;

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
     * Gets the value of the per property.
     * 
     */
    public double getPer() {
        return per;
    }

    /**
     * Sets the value of the per property.
     * 
     */
    public void setPer(double value) {
        this.per = value;
    }

    /**
     * Gets the value of the pop property.
     * 
     */
    public int getPop() {
        return pop;
    }

    /**
     * Sets the value of the pop property.
     * 
     */
    public void setPop(int value) {
        this.pop = value;
    }

}
