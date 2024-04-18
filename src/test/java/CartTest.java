import org.junit.jupiter.api.Test;

public class CartTest {
    // Generate test for creation of cart and if cart is empty
    @Test
    public void testCartCreation() {
        Cart cart = new Cart();

        assert cart.isEmpty();
    }

    @Test
    void shouldBeAbleToAddItemToCartWithQuantity() {
        Cart cart = new Cart();
        Item item = new Item("Item1", 10.0, 1);

        cart.addItem(item);

        assert !cart.isEmpty();
    }


}
