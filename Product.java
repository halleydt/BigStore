public class Product {

    String name;
    int price;

    public Product() {
        name = "unknown";
        price = 0;
    }

    public Product(String name, int price){
        this.price = price;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}
