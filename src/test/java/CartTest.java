import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class CartTest {
    // Generate test for creation of cart and if cart is empty
    @Test
    public void testCartCreation() {
        Cart cart = new Cart();

        assert cart.isEmpty();
    }

    @Test
    void shouldBeAbleToAddItemToCart() {
        Cart cart = new Cart();
        Item item = new Item("Item1", 10.0);
        CartItem cartItem = new CartItem(item, 1);

        cart.addItem(cartItem);

        assert !cart.isEmpty();
    }

    @Test
    void shouldBeAbleToViewTheCartItemsWithDisplayMethodInJsonFormat() throws JSONException {
        Cart cart = new Cart();
        //add more items to cart
        Item item1 = new Item("Item1", 10.0);
        Item item2 = new Item("Item2", 20.0);
        CartItem cartItem1 = new CartItem(item1, 1);
        CartItem cartItem2 = new CartItem(item2, 1);
        cart.addItem(cartItem1);
        cart.addItem(cartItem2);

        String actualJson = cart.display();

        // generate expectedJson String
        String expectedJson = "{\"items\":[" +
                "{\"name\":\"Item1\",\"price\":10.0,\"quantity\":1}," +
                "{\"name\":\"Item2\",\"price\":20.0,\"quantity\":1}" +
                "]}";


        JSONAssert.assertEquals(expectedJson, actualJson, true);
    }

    // add test to check if added item exists in the cart
    @Test
    void shouldBeAbleToCheckIfAddedItemExistsInTheCart() {
        Cart cart = new Cart();
        Item item = new Item("Item1", 10.0);
        CartItem cartItem = new CartItem(item, 1);

        cart.addItem(cartItem);

        assert cart.contains(item);
    }



}
