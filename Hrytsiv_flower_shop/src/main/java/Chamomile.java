public class Chamomile extends Flower {

    public Chamomile(Color color, float price, int length, String at) {
        super(color, price, length, at);
    }

    public Chamomile(Color color, float price, int length) {
        super(color, price, length);
    }

    public static Chamomile getRandomChamolite() {
        return new Chamomile(getRandomColor(), getRandomPrice(), getRandomLength());
    }

    @Override
    public String toString() {
        return "Chamomile{" +
                "color=" + color +
                ", price=" + price +
                ", length=" + length +
                ", attribute=" + attribute +
                '}';
    }
}
