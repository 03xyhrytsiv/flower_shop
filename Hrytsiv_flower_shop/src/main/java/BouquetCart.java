import java.util.LinkedList;
import java.util.List;

public class BouquetCart implements Cart {
    protected List<Bouquet> bouquets;

    BouquetCart() {
        this.bouquets = new LinkedList<Bouquet>();
    }

    void add(Bouquet v) {
        bouquets.add(v);
    }

    public void show_contents() {
        for (Bouquet v : this.bouquets) {
            System.out.println(v.toString());
        }
    }
}
