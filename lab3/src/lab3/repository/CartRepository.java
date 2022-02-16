package lab3.repository;

import lab3.models.Cart;

import java.util.ArrayList;
import java.util.List;

public class CartRepository {
    private List<Cart> carts;

    public CartRepository() {
        this.carts = new ArrayList<>();
    }

    public Cart getCart(int id){
        for (Cart cart : carts) {
            if (cart.getId() == id)
                return cart;
        }
        return null;

    }
    public Cart createCart(){
        int maxId = carts.stream().map(Cart::getId).max(Integer::compareTo).orElse(0);
        Cart cart = new Cart(++maxId);
        carts.add(cart);
        return cart;
    }
    public boolean deleteCart(Cart cart){
        return carts.remove(cart);
    }
}
