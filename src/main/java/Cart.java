import java.util.ArrayList;
import java.util.List;

public class Cart {
// create list field to store items

    private final List<Item> items;

    public Cart() {
        // create constructor to initialize the list field
        this.items = new ArrayList<>();

    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void addItem(Item item) {
        items.add(item);
    }
}
