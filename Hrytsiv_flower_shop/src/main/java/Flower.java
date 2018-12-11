import java.util.Random;

public abstract class Flower {
    protected Color color;
    protected float price;
    protected int length;
    protected String attribute = "N/A";

    protected static Random random = new Random();

    public Flower(Color color, float price, int length) {
        this.color = color;
        this.price = price;
        this.length = length;
    }

    public Flower(Color color, float price, int length, String attribute) {
        this.color = color;
        this.price = price;
        this.length = length;
        this.attribute = attribute;
    }

    public Color getColor() {
        return color;
    }

    float getPrice() {
        return price;
    }

    public int getLength() {
        return length;
    }

    static Color getRandomColor() {
        switch (random.nextInt(3)) {
            case 0:
                return Color.RED;
            case 1:
                return Color.GREEN;
            case 2:
                return Color.BLUE;
        }
        return Color.RED;
    }

    static float getRandomPrice() {
        return 3 + random.nextFloat() * 10;
    }

    static int getRandomLength() {
        return (4 + random.nextInt(5)) * 10;
    }
}

