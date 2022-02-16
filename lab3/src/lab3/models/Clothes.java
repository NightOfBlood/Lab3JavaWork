package lab3.models;

public class Clothes {

    protected int id;
    protected int size;
    protected String color;
    protected float price;
    protected String description;

    public Clothes(int id,int size, String color, float price) {
        this.id = id;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public Clothes(Clothes clothes) {
        this.id = clothes.getId();
        this.size = clothes.getSize();
        this.color = clothes.getColor();
        this.price = clothes.getPrice();
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public float getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return  getClass().getSimpleName() + ": " + "id = " + id +" ; size = "+size+" ; color = " +color+" ; price ="+price+" ;";
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
