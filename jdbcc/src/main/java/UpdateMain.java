public class UpdateMain {
    public static void main(String[] args) throws Exception{
        try{
            UpdateComponent comp = new UpdateComponent();
            String oldOfficeCode = "3";
            String newOfficeCode = "7";

            int count = comp.updateEmployee(oldOfficeCode,newOfficeCode);
            System.out.println(count);
        }catch (Exception exception){
            System.out.println(exception);
        }
    }
}
