package lab3.repository;

import lab3.models.Clothes;

import java.util.ArrayList;
import java.util.List;

public class ClothesRepository {
    private final List<Clothes> clothes;
    private static ClothesRepository instance = null;

    public static ClothesRepository getInstance() {
        if (instance == null) {
            instance = new ClothesRepository();
        }
        return instance;
    }

    //TODO:дзаполнить магазин одеждой
    private ClothesRepository() {
        this.clothes = new ArrayList<>();
        clothes.add(new Clothes(1, 1, "red", 500));
        clothes.add(new Clothes(2, 2, "blue", 756));
        clothes.add(new Clothes(3, 3, "white", 900));
        clothes.add(new Clothes(4, 4, "black", 235));
        clothes.add(new Clothes(5, 5, "red", 875));
    }

    public Clothes getClothes(int id) {
        Clothes cloth = this.clothes.stream().filter(x -> x.getId() == id).findAny().orElse(null);
        return cloth == null ? null : new Clothes(cloth);
    }

    public List<Clothes> getClothes() {
        return clothes;
    }
}
