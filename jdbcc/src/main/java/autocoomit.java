
public class autocoomit {

    public static void main(String[] args) throws Exception {
        int customerNumber = 103;
        LineItem lineItem = new LineItem("S10_1678", 20, 50.00);

        try {
            OrderComponent_AC comp = new OrderComponent_AC();
            int orderNumber = comp.createOrder(customerNumber, lineItem);
            System.out.println("New Order Number = "+ orderNumber);

        } catch (Exception exception) {
            util.ExceptionHandler.handleException(exception);
        }
    }
}
