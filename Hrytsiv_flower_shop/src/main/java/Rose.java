public class Rose extends Flower {

    public Rose(Color color, float price, int length, String at) {
        super(color, price, length, at);
    }

    public Rose(Color color, float price, int length) {
        super(color, price, length);
    }

    public static Rose getRandomRose() {
        return new Rose(getRandomColor(), getRandomPrice(), getRandomLength());
    }

    @Override
    public String toString() {
        return "Rose{" +
                "color=" + color +
                ", price=" + price +
                ", length=" + length +
                ", attribute=" + attribute +
                '}';
    }
}

