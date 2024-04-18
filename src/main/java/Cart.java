import java.util.ArrayList;
import java.util.List;

public class Cart {
// create list field to store items

    private final List<CartItem> items;

    public Cart() {
        // create constructor to initialize the list field
        this.items = new ArrayList<>();

    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void addItem(CartItem item) {
        items.add(item);
    }
}
