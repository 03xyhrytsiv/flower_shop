import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Storage {
    List<Bouquet> bouquets;

    public Storage() {
        bouquets = new LinkedList<Bouquet>();
    }

    public void addRandomData() {
        Random random = new Random();
        int bouquetsCount = random.nextInt(3) + 2;
        for (int i = 0; i < bouquetsCount; i++) {
            bouquets.add(Bouquet.getRandomBouquet());
        }
    }


    @Override
    public String toString() {
        String s = "Storage:\n" +
                "   bouquets:\n";
        int count = 0;
        for (Bouquet t : bouquets) {
            s += "      ";
            s += Integer.toString(count) + ")";
            s += t;
            s += "\n";
            ++count;
        }
        return s;
    }
}

