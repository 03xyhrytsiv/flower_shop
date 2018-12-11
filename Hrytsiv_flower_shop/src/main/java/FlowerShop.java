import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class FlowerShop {
    private Storage storage = new Storage();
    private PaymentInterface cash_payment = new CashPayment();
    private PaymentInterface card_payment = new CardPayment();



    FlowerShop() {
        storage.addRandomData();
    }

    private void choose_paying_method() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to choose pay with cash[enter 0] or credit card[enter 1]: ");
        int option = scanner.nextInt();
        if (option == 0) {
            this.cash_payment.pay();
        } else {
            this.card_payment.pay();
        }
    }

    Bouquet take_order() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to choose already formed, default" +
                " bouquet[enter 0] or create your own[enter 1]: ");
        int option = scanner.nextInt();
        if (option == 0) {
            System.out.println(storage.toString());
            System.out.println("Please, enter the number of bouquet you want to buy: ");
            option = scanner.nextInt();
            System.out.println("You chose: " + storage.bouquets.get(option));
            System.out.println("Please, pay " + storage.bouquets.get(option).getOveralPrice() + "$.");
            choose_paying_method();
            System.out.println("Payment completed successfully.");
            System.out.println("Thank you for your order. Have a nice day.");
            return storage.bouquets.get(option);
        } else {
            List<Flower> flowers = new LinkedList<Flower>();
            System.out.println("Please, enter the number of flowers in bouquet.");
            int number_of_flowers_in_bouquet = scanner.nextInt();
            for (int i = 0; i < number_of_flowers_in_bouquet; ++i) {
                System.out.println("Rose - [0]: Chamomile - 1: Tulip - 2: ");
                int flowerType = scanner.nextInt();
                System.out.println("Red - default: Green - 1: Blue - 2: ");
                int color_type = scanner.nextInt();
                Color color = Color.RED; // default color
                switch (color_type) {
                    case 1:
                        color = Color.GREEN;
                    case 2:
                        color = Color.BLUE;
                }
                System.out.println("Enter the length of flower: ");
                int length = scanner.nextInt();
                System.out.print("Enter any specific attribute you would like this flower to have:");
                String attribute = new Scanner(System.in).nextLine();
                float price = Flower.getRandomPrice();
                Bouquet.BouquetFlowerType(flowers, flowerType, color, price, length, attribute);
            }
            Bouquet bouquet = new Bouquet(flowers);
            System.out.println("\nYou chose: " + bouquet);
            System.out.println("Please, pay " + bouquet.getOveralPrice() + "$.");
            choose_paying_method();
            System.out.println("Payment completed successfully.");
            System.out.println("Thank you for your order. Have a nice day.");
            return bouquet;
        }
    }
}
