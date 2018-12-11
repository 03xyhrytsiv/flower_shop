public class ShoppingCart extends BouquetCart {
    private BouquetCart bouquet_cart;

    public ShoppingCart(BouquetCart flowers) {
        this.bouquet_cart = flowers;
    }

    ShoppingCart() {
        super();
    }

    public float get_total_price() {
        float price = 0;
        for (Bouquet v: bouquets) {
            price += v.getOveralPrice();
        }
        return price;
    }
}
