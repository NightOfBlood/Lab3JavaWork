package lab3.models;

public class ClothesInCart extends Clothes {
    private int count;
    private int cartId;
    private int positionId;


    public ClothesInCart(int id,int size, String color, float price) {
        super(id, size, color, price);
    }

    public ClothesInCart(Clothes clothes) {
        super(clothes);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public float getCost() {
        return count * price;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Cart id: " + cartId+"; Position id: " + positionId + "; Cost: " + getCost();
    }
}
