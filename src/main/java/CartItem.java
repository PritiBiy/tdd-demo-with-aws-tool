public class CartItem {
    private final Item item;
    private final int quantity;

    public CartItem(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public String toString() {
        return String.format("{%s,\"quantity\":%d}", item.toString(), this.quantity);
    }


    public boolean contains(Item item) {
        return this.item.equals(item);
    }
}
