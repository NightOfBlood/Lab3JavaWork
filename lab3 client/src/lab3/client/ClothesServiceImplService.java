
package lab3.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.jws.HandlerChain;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ClothesServiceImplService", targetNamespace = "http://services.lab3/", wsdlLocation = "http://localhost:8080/clothesservice?wsdl")
@HandlerChain(file = "handler-chain.xml")

public class ClothesServiceImplService
    extends Service
{

    private final static URL CLOTHESSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException CLOTHESSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName CLOTHESSERVICEIMPLSERVICE_QNAME = new QName("http://services.lab3/", "ClothesServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/clothesservice?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CLOTHESSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        CLOTHESSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public ClothesServiceImplService() {
        super(__getWsdlLocation(), CLOTHESSERVICEIMPLSERVICE_QNAME);
    }

    public ClothesServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CLOTHESSERVICEIMPLSERVICE_QNAME, features);
    }

    public ClothesServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, CLOTHESSERVICEIMPLSERVICE_QNAME);
    }

    public ClothesServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CLOTHESSERVICEIMPLSERVICE_QNAME, features);
    }

    public ClothesServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ClothesServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ClothesService
     */
    @WebEndpoint(name = "ClothesServiceImplPort")
    public ClothesService getClothesServiceImplPort() {
        return super.getPort(new QName("http://services.lab3/", "ClothesServiceImplPort"), ClothesService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ClothesService
     */
    @WebEndpoint(name = "ClothesServiceImplPort")
    public ClothesService getClothesServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.lab3/", "ClothesServiceImplPort"), ClothesService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CLOTHESSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw CLOTHESSERVICEIMPLSERVICE_EXCEPTION;
        }
        return CLOTHESSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}