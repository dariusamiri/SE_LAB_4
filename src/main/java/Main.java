import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double packageWeight = Double.parseDouble(scanner.nextLine());

        boolean is_delivered = false;
        DeliveryContext context = new DeliveryContext();
        double coef = 2.5;
        while(!is_delivered) {
            String type = scanner.nextLine();
            String state = scanner.nextLine();

            if (type.equals("standard")) {
                context.setCurrentType(new Standard());
                coef = 2.5;
            } else if (type.equals("express")) {
                context.setCurrentType(new Express());
                coef = 3.5;
            }

            if (state.equals("in-transit")) {
                context.setCurrentState(new InTransit());
            } else if (state.equals("delivered")) {
                context.setCurrentState(new Delivered());
                is_delivered = true;
            }

            System.out.println(context.getDeliveryState());
            System.out.println(context.getShippingType());
        }
        System.out.println("Package Delivered.");
        double cost = coef * packageWeight;
        System.out.println("Shipping cost: " + cost);
    }
}
