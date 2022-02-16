
package lab3.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clothesInCart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clothesInCart">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.lab3/}clothes">
 *       &lt;sequence>
 *         &lt;element name="cartId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="positionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clothesInCart", propOrder = {
    "cartId",
    "count",
    "positionId"
})
public class ClothesInCart
    extends Clothes
{

    protected int cartId;
    protected int count;
    protected int positionId;

    /**
     * Gets the value of the cartId property.
     * 
     */
    public int getCartId() {
        return cartId;
    }

    /**
     * Sets the value of the cartId property.
     * 
     */
    public void setCartId(int value) {
        this.cartId = value;
    }

    /**
     * Gets the value of the count property.
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

    /**
     * Gets the value of the positionId property.
     * 
     */
    public int getPositionId() {
        return positionId;
    }

    /**
     * Sets the value of the positionId property.
     * 
     */
    public void setPositionId(int value) {
        this.positionId = value;
    }

}
