import java.util.LinkedList;
import java.util.List;

public class Bouquet extends FlowerList {

    public Bouquet() {
        super();
    }

    Bouquet(List<Flower> initialFlowers) {
        super(initialFlowers);
    }

    static void BouquetFlowerType(List<Flower> flowers, int flowerType, Color color, float price, int length, String attribute) {
        switch (flowerType) {
            case 0:
                flowers.add(new Rose(color, price, length, attribute));
                break;
            case 1:
                flowers.add(new Chamomile(color, price, length, attribute));
                break;
            case 2:
                flowers.add(new Tulip(color, price, length, attribute));
                break;
        }
    }

    private static void BouquetFlowerType(List<Flower> flowers, int flowerType, Color color, float price, int length) {
        switch (flowerType) {
            case 0:
                flowers.add(new Rose(color, price, length));
                break;
            case 1:
                flowers.add(new Chamomile(color, price, length));
                break;
            case 2:
                flowers.add(new Tulip(color, price, length));
                break;
        }
    }


    static Bouquet getRandomBouquet() {
        int count = (random.nextInt(2) + 1) * 10 + 1;
        List<Flower> flowers = new LinkedList<Flower>();
        for (int i = 0; i < count; i++) {
            int flowerType = random.nextInt(3);
            Color color = Flower.getRandomColor();
            int length = Flower.getRandomLength();
            float price = Flower.getRandomPrice();
            BouquetFlowerType(flowers, flowerType, color, price, length);
        }
        return new Bouquet(flowers);
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "flowers=" + flowers +
                '}';
    }
}

