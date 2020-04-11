public class QueryMain {
    public static void main(String[] args) throws  Exception{
        try{
            ProductQuery comp = new ProductQuery();
            comp.printProductList();
            comp.printOrderList();
        }
        catch (Exception exception){
            System.out.println(exception);
        }
    }
}
