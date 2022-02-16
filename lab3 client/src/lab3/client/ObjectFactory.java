
package lab3.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lab3.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeleteCartResponse_QNAME = new QName("http://services.lab3/", "deleteCartResponse");
    private final static QName _GetClothesInCartResponse_QNAME = new QName("http://services.lab3/", "getClothesInCartResponse");
    private final static QName _AddClothesResponse_QNAME = new QName("http://services.lab3/", "addClothesResponse");
    private final static QName _DeleteClothesResponse_QNAME = new QName("http://services.lab3/", "deleteClothesResponse");
    private final static QName _ChangeClothesCount_QNAME = new QName("http://services.lab3/", "changeClothesCount");
    private final static QName _TestResponse_QNAME = new QName("http://services.lab3/", "testResponse");
    private final static QName _ChangeClothesCountResponse_QNAME = new QName("http://services.lab3/", "changeClothesCountResponse");
    private final static QName _Test_QNAME = new QName("http://services.lab3/", "test");
    private final static QName _GetCartResponse_QNAME = new QName("http://services.lab3/", "getCartResponse");
    private final static QName _AddClothes_QNAME = new QName("http://services.lab3/", "addClothes");
    private final static QName _CreateCartResponse_QNAME = new QName("http://services.lab3/", "createCartResponse");
    private final static QName _DeleteCart_QNAME = new QName("http://services.lab3/", "deleteCart");
    private final static QName _DeleteClothes_QNAME = new QName("http://services.lab3/", "deleteClothes");
    private final static QName _GetCart_QNAME = new QName("http://services.lab3/", "getCart");
    private final static QName _CreateCart_QNAME = new QName("http://services.lab3/", "createCart");
    private final static QName _GetClothesInCart_QNAME = new QName("http://services.lab3/", "getClothesInCart");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lab3.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCartResponse }
     * 
     */
    public GetCartResponse createGetCartResponse() {
        return new GetCartResponse();
    }

    /**
     * Create an instance of {@link AddClothes }
     * 
     */
    public AddClothes createAddClothes() {
        return new AddClothes();
    }

    /**
     * Create an instance of {@link CreateCartResponse }
     * 
     */
    public CreateCartResponse createCreateCartResponse() {
        return new CreateCartResponse();
    }

    /**
     * Create an instance of {@link ChangeClothesCountResponse }
     * 
     */
    public ChangeClothesCountResponse createChangeClothesCountResponse() {
        return new ChangeClothesCountResponse();
    }

    /**
     * Create an instance of {@link Test }
     * 
     */
    public Test createTest() {
        return new Test();
    }

    /**
     * Create an instance of {@link CreateCart }
     * 
     */
    public CreateCart createCreateCart() {
        return new CreateCart();
    }

    /**
     * Create an instance of {@link GetClothesInCart }
     * 
     */
    public GetClothesInCart createGetClothesInCart() {
        return new GetClothesInCart();
    }

    /**
     * Create an instance of {@link GetCart }
     * 
     */
    public GetCart createGetCart() {
        return new GetCart();
    }

    /**
     * Create an instance of {@link DeleteCart }
     * 
     */
    public DeleteCart createDeleteCart() {
        return new DeleteCart();
    }

    /**
     * Create an instance of {@link DeleteClothes }
     * 
     */
    public DeleteClothes createDeleteClothes() {
        return new DeleteClothes();
    }

    /**
     * Create an instance of {@link AddClothesResponse }
     * 
     */
    public AddClothesResponse createAddClothesResponse() {
        return new AddClothesResponse();
    }

    /**
     * Create an instance of {@link DeleteClothesResponse }
     * 
     */
    public DeleteClothesResponse createDeleteClothesResponse() {
        return new DeleteClothesResponse();
    }

    /**
     * Create an instance of {@link GetClothesInCartResponse }
     * 
     */
    public GetClothesInCartResponse createGetClothesInCartResponse() {
        return new GetClothesInCartResponse();
    }

    /**
     * Create an instance of {@link DeleteCartResponse }
     * 
     */
    public DeleteCartResponse createDeleteCartResponse() {
        return new DeleteCartResponse();
    }

    /**
     * Create an instance of {@link TestResponse }
     * 
     */
    public TestResponse createTestResponse() {
        return new TestResponse();
    }

    /**
     * Create an instance of {@link ChangeClothesCount }
     * 
     */
    public ChangeClothesCount createChangeClothesCount() {
        return new ChangeClothesCount();
    }

    /**
     * Create an instance of {@link Cart }
     * 
     */
    public Cart createCart() {
        return new Cart();
    }

    /**
     * Create an instance of {@link Clothes }
     * 
     */
    public Clothes createClothes() {
        return new Clothes();
    }

    /**
     * Create an instance of {@link ClothesInCart }
     * 
     */
    public ClothesInCart createClothesInCart() {
        return new ClothesInCart();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCartResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.lab3/", name = "deleteCartResponse")
    public JAXBElement<DeleteCartResponse> createDeleteCartResponse(DeleteCartResponse value) {
        return new JAXBElement<DeleteCartResponse>(_DeleteCartResponse_QNAME, DeleteCartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClothesInCartResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.lab3/", name = "getClothesInCartResponse")
    public JAXBElement<GetClothesInCartResponse> createGetClothesInCartResponse(GetClothesInCartResponse value) {
        return new JAXBElement<GetClothesInCartResponse>(_GetClothesInCartResponse_QNAME, GetClothesInCartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddClothesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.lab3/", name = "addClothesResponse")
    public JAXBElement<AddClothesResponse> createAddClothesResponse(AddClothesResponse value) {
        return new JAXBElement<AddClothesResponse>(_AddClothesResponse_QNAME, AddClothesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteClothesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.lab3/", name = "deleteClothesResponse")
    public JAXBElement<DeleteClothesResponse> createDeleteClothesResponse(DeleteClothesResponse value) {
        return new JAXBElement<DeleteClothesResponse>(_DeleteClothesResponse_QNAME, DeleteClothesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeClothesCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.lab3/", name = "changeClothesCount")
    public JAXBElement<ChangeClothesCount> createChangeClothesCount(ChangeClothesCount value) {
        return new JAXBElement<ChangeClothesCount>(_ChangeClothesCount_QNAME, ChangeClothesCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.lab3/", name = "testResponse")
    public JAXBElement<TestResponse> createTestResponse(TestResponse value) {
        return new JAXBElement<TestResponse>(_TestResponse_QNAME, TestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeClothesCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.lab3/", name = "changeClothesCountResponse")
    public JAXBElement<ChangeClothesCountResponse> createChangeClothesCountResponse(ChangeClothesCountResponse value) {
        return new JAXBElement<ChangeClothesCountResponse>(_ChangeClothesCountResponse_QNAME, ChangeClothesCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Test }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.lab3/", name = "test")
    public JAXBElement<Test> createTest(Test value) {
        return new JAXBElement<Test>(_Test_QNAME, Test.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCartResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.lab3/", name = "getCartResponse")
    public JAXBElement<GetCartResponse> createGetCartResponse(GetCartResponse value) {
        return new JAXBElement<GetCartResponse>(_GetCartResponse_QNAME, GetCartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddClothes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.lab3/", name = "addClothes")
    public JAXBElement<AddClothes> createAddClothes(AddClothes value) {
        return new JAXBElement<AddClothes>(_AddClothes_QNAME, AddClothes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCartResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.lab3/", name = "createCartResponse")
    public JAXBElement<CreateCartResponse> createCreateCartResponse(CreateCartResponse value) {
        return new JAXBElement<CreateCartResponse>(_CreateCartResponse_QNAME, CreateCartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCart }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.lab3/", name = "deleteCart")
    public JAXBElement<DeleteCart> createDeleteCart(DeleteCart value) {
        return new JAXBElement<DeleteCart>(_DeleteCart_QNAME, DeleteCart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteClothes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.lab3/", name = "deleteClothes")
    public JAXBElement<DeleteClothes> createDeleteClothes(DeleteClothes value) {
        return new JAXBElement<DeleteClothes>(_DeleteClothes_QNAME, DeleteClothes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCart }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.lab3/", name = "getCart")
    public JAXBElement<GetCart> createGetCart(GetCart value) {
        return new JAXBElement<GetCart>(_GetCart_QNAME, GetCart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCart }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.lab3/", name = "createCart")
    public JAXBElement<CreateCart> createCreateCart(CreateCart value) {
        return new JAXBElement<CreateCart>(_CreateCart_QNAME, CreateCart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClothesInCart }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.lab3/", name = "getClothesInCart")
    public JAXBElement<GetClothesInCart> createGetClothesInCart(GetClothesInCart value) {
        return new JAXBElement<GetClothesInCart>(_GetClothesInCart_QNAME, GetClothesInCart.class, null, value);
    }

}
