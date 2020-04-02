public class Main {

    public static void main(String[] args) {
        CalculateBase[] calculators = {
                new Divider(100.0d,50.0d),
                new Adder(100.0d,50.0d),
                new Subtract(100.0d,50.0d),
                new mulitplier(100.0d,50.0d)
        };

        for(CalculateBase calculator: calculators){
            calculator.calculate();
            System.out.println(calculator.getResult());
        }
    }

}
