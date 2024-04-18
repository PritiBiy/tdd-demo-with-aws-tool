import org.junit.jupiter.api.Test;

public class CartTest {
    // Generate test for creation of cart and if cart is empty
    @Test
    public void testCartCreation() {
        Cart cart = new Cart();
        assert cart.isEmpty();
    }

}
