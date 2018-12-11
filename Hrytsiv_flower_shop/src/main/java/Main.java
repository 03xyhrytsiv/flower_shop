import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FlowerShop fshop = new FlowerShop();
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);
        int option;
        int status = 1;
        while (status != 0) {
            status = 0;
            System.out.println("Make an order?(1-Yes, 2-No)");
            option = scanner.nextInt();
            if (option == 1) {
                cart.add(fshop.take_order());
                ++status;
            }
            System.out.println("Open the contents?(1-Yes, 2-No)");
            option = scanner.nextInt();
            if (option == 1) {
                cart.show_contents();
                ++status;
            }
            System.out.println("Show the total price?(1-Yes, 2-No)");
            option = scanner.nextInt();
            if (option == 1) {
                System.out.println("The total price: " + cart.get_total_price());
            }

        }
    }
}
