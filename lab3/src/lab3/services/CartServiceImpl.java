package lab3.services;

import lab3.models.Cart;
import lab3.models.Clothes;
import lab3.models.ClothesInCart;
import lab3.repository.CartRepository;
import lab3.repository.ClothesRepository;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "lab3.services.CartService")
@HandlerChain(file="handler-chain.xml")
public class CartServiceImpl implements CartService {

    CartRepository cartRepository = new CartRepository();
    ClothesRepository clothesRepository = ClothesRepository.getInstance();

    @WebMethod
    public String test() {
        return "hello service";
    }

    @WebMethod
    public boolean addClothes(int cartId, int id, int size, int count, String color) {
        Cart cart = cartRepository.getCart(cartId);
        if (cart == null)
            return false;
        Clothes clothesModel = clothesRepository.getClothes(id);
        if (clothesModel == null) {
            return false;
        }
        ClothesInCart clothes = new ClothesInCart(clothesModel);
        clothes.setColor(color);
        clothes.setSize(size);
        clothes.setCount(count);
        cart.addClothes(clothes);
        return true;
    }

    @Override
    public boolean deleteClothes(int cartId, int positionId) {
        Cart cart = cartRepository.getCart(cartId);
        if (cart == null)
            return false;
        for (ClothesInCart clothesInCart : cart.getClothesList()) {
            if (clothesInCart.getPositionId() == positionId) {
                cart.getClothesList().remove(clothesInCart);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean changeClothesCount(int cartId, int positionId, int count) {
        Cart cart = cartRepository.getCart(cartId);
        if (cart == null) {
            return false;
        }
        for (ClothesInCart clothesInCart : cart.getClothesList()) {
            if (clothesInCart.getPositionId() == positionId) {
                clothesInCart.setCount(count);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<ClothesInCart> getClothesInCart(int cartId) {
        Cart cart = cartRepository.getCart(cartId);
        if (cart == null) {
            return null;
        }
        return cart.getClothesList();
    }

    @WebMethod
    public Cart createCart() {
        return cartRepository.createCart();
    }

    @WebMethod
    public Cart getCart(int id) {
        Cart cart = cartRepository.getCart(id);
        if (cart == null)
            cart = cartRepository.createCart();
        return cart;
    }

    @Override
    public boolean deleteCart(int cartId) {
        Cart cart = cartRepository.getCart(cartId);
        if (cart == null) {
            return false;
        }
        return cartRepository.deleteCart(cart);
    }

}

