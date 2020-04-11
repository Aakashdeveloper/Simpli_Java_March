public class DynamicMain {
    public  static void main(String[] args) throws Exception{
        try{
            DynamicComponent comp = new DynamicComponent();
            //comp.printDynamicProduct(50.0,51.0);
            comp.printMultipleFields(50.0,51.0);
        }catch (Exception exception){
            System.out.println(exception);
        }
    }
}
