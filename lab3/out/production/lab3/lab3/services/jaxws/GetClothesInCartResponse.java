
package lab3.services.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getClothesInCartResponse", namespace = "http://services.lab3/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getClothesInCartResponse", namespace = "http://services.lab3/")
public class GetClothesInCartResponse {

    @XmlElement(name = "return", namespace = "")
    private List<lab3.models.ClothesInCart> _return;

    /**
     * 
     * @return
     *     returns List<ClothesInCart>
     */
    public List<lab3.models.ClothesInCart> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<lab3.models.ClothesInCart> _return) {
        this._return = _return;
    }

}
