public class Pizza {
    private String flavor;
    private String size;
    private double price;
//    private String ingredients;

    public Pizza(String sabor, String size, double price) {
        this.flavor = sabor;
        this.size = size;
        this.price = price;
    }

    public String getFlavor() {
        return flavor;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "sabor='" + flavor + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
