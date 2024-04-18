import java.util.ArrayList;
import java.util.List;

public class Cart {
// create list field to store items

    private final List<CartItem> cartItems;

    public Cart() {
        // create constructor to initialize the list field
        this.cartItems = new ArrayList<>();

    }

    public boolean isEmpty() {
        return cartItems.isEmpty();
    }

    public void addItem(CartItem item) {
        cartItems.add(item);
    }

    public String display() {

        StringBuilder output = new StringBuilder("{ \"items\":[");
        for (CartItem item : cartItems) {
            output.append(item.toString()).append(",");
        }
        // remove the last comma
        output = new StringBuilder(output.substring(0, output.length() - 1));

        output.append("]}");
        return output.toString();
    }


    public boolean contains(Item item) {
        for (CartItem cartItem : cartItems) {
            if (cartItem.contains(item)) {
                return true;
            }
        }
        return false;
    }
}
