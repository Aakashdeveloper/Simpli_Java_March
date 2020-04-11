public class InserMain {
    public static void main(String[] args) throws Exception{
        try{
            InserComponent comp = new InserComponent();

            int key = comp.addEmployee(
                    "Jackson","Ammy","X123","a@a.com","1","Engg"
            );
            System.out.println(key);
        }catch (Exception exception){
            System.out.println(exception);
        }
    }
}
