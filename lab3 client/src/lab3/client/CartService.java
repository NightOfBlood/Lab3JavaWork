
package lab3.client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CartService", targetNamespace = "http://services.lab3/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CartService {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "test", targetNamespace = "http://services.lab3/", className = "lab3.client.Test")
    @ResponseWrapper(localName = "testResponse", targetNamespace = "http://services.lab3/", className = "lab3.client.TestResponse")
    @Action(input = "http://services.lab3/CartService/testRequest", output = "http://services.lab3/CartService/testResponse")
    public String test();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<lab3.client.ClothesInCart>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getClothesInCart", targetNamespace = "http://services.lab3/", className = "lab3.client.GetClothesInCart")
    @ResponseWrapper(localName = "getClothesInCartResponse", targetNamespace = "http://services.lab3/", className = "lab3.client.GetClothesInCartResponse")
    @Action(input = "http://services.lab3/CartService/getClothesInCartRequest", output = "http://services.lab3/CartService/getClothesInCartResponse")
    public List<ClothesInCart> getClothesInCart(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns lab3.client.Cart
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCart", targetNamespace = "http://services.lab3/", className = "lab3.client.GetCart")
    @ResponseWrapper(localName = "getCartResponse", targetNamespace = "http://services.lab3/", className = "lab3.client.GetCartResponse")
    @Action(input = "http://services.lab3/CartService/getCartRequest", output = "http://services.lab3/CartService/getCartResponse")
    public Cart getCart(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteCart", targetNamespace = "http://services.lab3/", className = "lab3.client.DeleteCart")
    @ResponseWrapper(localName = "deleteCartResponse", targetNamespace = "http://services.lab3/", className = "lab3.client.DeleteCartResponse")
    @Action(input = "http://services.lab3/CartService/deleteCartRequest", output = "http://services.lab3/CartService/deleteCartResponse")
    public boolean deleteCart(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteClothes", targetNamespace = "http://services.lab3/", className = "lab3.client.DeleteClothes")
    @ResponseWrapper(localName = "deleteClothesResponse", targetNamespace = "http://services.lab3/", className = "lab3.client.DeleteClothesResponse")
    @Action(input = "http://services.lab3/CartService/deleteClothesRequest", output = "http://services.lab3/CartService/deleteClothesResponse")
    public boolean deleteClothes(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @return
     *     returns lab3.client.Cart
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createCart", targetNamespace = "http://services.lab3/", className = "lab3.client.CreateCart")
    @ResponseWrapper(localName = "createCartResponse", targetNamespace = "http://services.lab3/", className = "lab3.client.CreateCartResponse")
    @Action(input = "http://services.lab3/CartService/createCartRequest", output = "http://services.lab3/CartService/createCartResponse")
    public Cart createCart();

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addClothes", targetNamespace = "http://services.lab3/", className = "lab3.client.AddClothes")
    @ResponseWrapper(localName = "addClothesResponse", targetNamespace = "http://services.lab3/", className = "lab3.client.AddClothesResponse")
    @Action(input = "http://services.lab3/CartService/addClothesRequest", output = "http://services.lab3/CartService/addClothesResponse")
    public boolean addClothes(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        int arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "changeClothesCount", targetNamespace = "http://services.lab3/", className = "lab3.client.ChangeClothesCount")
    @ResponseWrapper(localName = "changeClothesCountResponse", targetNamespace = "http://services.lab3/", className = "lab3.client.ChangeClothesCountResponse")
    @Action(input = "http://services.lab3/CartService/changeClothesCountRequest", output = "http://services.lab3/CartService/changeClothesCountResponse")
    public boolean changeClothesCount(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2);

}