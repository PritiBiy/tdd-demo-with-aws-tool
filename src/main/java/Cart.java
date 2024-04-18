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

    public String display() {

        StringBuilder output = new StringBuilder("{ \"items\":[");
        for (CartItem item : items) {
            output.append(item.toString()).append(",");
        }
        // remove the last comma
        output = new StringBuilder(output.substring(0, output.length() - 1));

        output.append("]}");
        return output.toString();
    }


    public boolean contains(Item item) {
        for (CartItem cartItem : items) {
            if (cartItem.getItem().equals(item)) {
                return true;
            }
        }
        return false;
    }
}
