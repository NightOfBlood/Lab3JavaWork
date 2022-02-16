
package lab3.services.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getCartResponse", namespace = "http://services.lab3/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCartResponse", namespace = "http://services.lab3/")
public class GetCartResponse {

    @XmlElement(name = "return", namespace = "")
    private lab3.models.Cart _return;

    /**
     * 
     * @return
     *     returns Cart
     */
    public lab3.models.Cart getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(lab3.models.Cart _return) {
        this._return = _return;
    }

}
