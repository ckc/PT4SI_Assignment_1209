
package Web_Service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="getAllByDistResult" type="{http://tempuri.org/}ArrayOfDist" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getAllByDistResult"
})
@XmlRootElement(name = "getAllByDistResponse")
public class GetAllByDistResponse {

    protected ArrayOfDist getAllByDistResult;

    /**
     * Gets the value of the getAllByDistResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDist }
     *     
     */
    public ArrayOfDist getGetAllByDistResult() {
        return getAllByDistResult;
    }

    /**
     * Sets the value of the getAllByDistResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDist }
     *     
     */
    public void setGetAllByDistResult(ArrayOfDist value) {
        this.getAllByDistResult = value;
    }

}
