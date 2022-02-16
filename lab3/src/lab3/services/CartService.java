package lab3.services;

import lab3.models.Cart;
import lab3.models.ClothesInCart;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface CartService {
// Добавить удаление и редактирование
    @WebMethod
    public String test();

    @WebMethod
    public boolean addClothes(int cartId, int id, int size, int count, String color);

    @WebMethod
    public boolean deleteClothes(int cartId, int positionId);

    @WebMethod
    public boolean changeClothesCount(int cartId, int positionId, int count);

    @WebMethod
    public List<ClothesInCart> getClothesInCart(int cartId);

    @WebMethod
    public Cart createCart();

    @WebMethod
    public Cart getCart(int id);

    @WebMethod
    public boolean deleteCart(int cartId);
}
