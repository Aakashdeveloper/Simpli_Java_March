public class ProductMain {
    public static  void main(String[] args) throws  Exception{
        try{
            ProductComponent comp = new ProductComponent();

            if(comp.tryConnection()){
                System.out.println("Connection Established");
            }else{
                System.out.println("Fail to connect");
            }

        }catch (Exception exception){
            System.out.println(exception);

        }
    }

}
