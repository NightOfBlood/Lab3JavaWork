package lab3.client;

import lab3.client.Cart;
import lab3.client.Clothes;
import lab3.client.ClothesInCart;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final String CART_PATH = "http://localhost:8080/cartservice?wsdl";
    public static final String CLOTHES_PATH = "http://localhost:8080/clothesservice?wsdl";

    public static final Scanner sc = new Scanner(System.in);
    public static Cart _cart;

    static ClothesService clothesService;
    static CartService cartService;

    static {
        URL cartUrl = null;
        URL clothesUrl = null;
        try {
            cartUrl = new URL(CART_PATH);
            clothesUrl = new URL(CLOTHES_PATH);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        ClothesServiceImplService clothesServiceImplService = new ClothesServiceImplService(clothesUrl);
        clothesService = clothesServiceImplService.getClothesServiceImplPort();
        lab3.client.CartServiceImplService cartServiceImplService
                = new lab3.client.CartServiceImplService(cartUrl) {
        };
        cartService = cartServiceImplService.getCartServiceImplPort();
    }

    public static void main(String[] args) throws MalformedURLException {
        while (true) {
            System.out.println("Welcome to the shop!");
            System.out.println("Choose action:");
            System.out.println("0) Exit:");
            System.out.println("1) Show all clothes in the shop");
            System.out.println("2) Show all clothes in your cart");
            System.out.println("3) Add clothes to your cart");
            System.out.println("4) Remove clothes from your cart");
            System.out.println("5) Clear your cart");
            //System.out.println("5) Choose action:");
            int res = readInt();
            switch (res) {
                case 0:
                    return;
                case 1:
                    System.out.println("Clothes at the shop:");
                    printClothesFromServer();
                    break;
                case 2:
                    System.out.println("Clothes in your cart:");
                    printClothesFromCart();
                    break;
                case 3:
                    Cart cart = getCart(false);
                    System.out.println("Choose id of clothes");
                    printClothesFromServer();
                    int clothesId = readInt();
                    System.out.println("Choose size of clothes");
                    int clothesSize = readInt();
                    System.out.println("Choose count of clothes");
                    int clothesCount = readInt();
                    System.out.println("Choose color of clothes");
                    String clothesColor = sc.nextLine();

                    cartService.addClothes(cart.getId(), clothesId, clothesSize, clothesCount, clothesColor );

                    break;
                case 4:
                    System.out.println("Enter number of clothes");
                    printClothesFromCart();
                    int positionId = readInt();
                    cartService.deleteClothes(getCart(false).getId(),positionId);

                    break;
                case 5:
                    cartService.deleteCart(getCart(false).getId());
                    break;

            }
        }
    }

    private static void printClothesFromServer(){
        List<Clothes> clothes = clothesService.getClothes();
        for (Clothes clothe : clothes) {
            System.out.println(clothe.getDescription());
        }
    }
    private static void printClothesFromCart(){
        List<ClothesInCart> clothes = getCart(true).getClothesList();
        for (Clothes clothe : clothes) {
            System.out.println(clothe.getDescription());
        }
    }
    private static int readInt() {
        while (true) {
            try {
                String str = sc.nextLine();
                return Integer.parseInt(str);
            } catch (NumberFormatException ex) {
                System.out.println("Please, enter a correct integer");
            }
        }
    }

    public static Cart getCart(boolean needRefresh) {
        if(_cart == null)
            _cart = cartService.createCart();
        else if (needRefresh)
            _cart = cartService.getCart(_cart.getId());
        return _cart;
    }

}
