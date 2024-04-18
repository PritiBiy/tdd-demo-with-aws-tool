public class Item {
    private final String name;
    private final double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return String.format("\"name\": %s, \"price\": %.2f", this.name, this.price);
    }
}
