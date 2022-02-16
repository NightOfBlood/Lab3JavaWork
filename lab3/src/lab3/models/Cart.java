package lab3.models;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private int id = 0;
    private List<ClothesInCart> clothesList = null;

    public Cart(int id) {
        this.id = id;
        clothesList = new ArrayList<>();
    }
    public Cart(){}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ClothesInCart> getClothesList() {
        return clothesList;
    }

    public void setClothesList(List<ClothesInCart> clothesList) {
        this.clothesList = clothesList;
    }

    public void addClothes(ClothesInCart clothes){
        clothesList.add(clothes);
        clothes.setCartId(id);
        clothes.setPositionId(clothesList.stream().map(ClothesInCart::getPositionId).max(Integer::compareTo).orElse(0)+1);
    }

}
