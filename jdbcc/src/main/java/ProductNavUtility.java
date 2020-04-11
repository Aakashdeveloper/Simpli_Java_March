
import java.sql.ResultSet;

public class ProductNavUtility {
    ResultSet resultSet = null;

    public ProductNavUtility(ResultSet resultSet){this.resultSet = resultSet;}

    public void printForward() throws Exception {
        while(resultSet.next()){
            String name = resultSet.getString("productName");
            System.out.println("  "+name);
        }
    }
    public void printFirst() throws Exception {
        if(resultSet.first()){
            String name = resultSet.getString("productName");
            System.out.println("  "+name);
        }
    }
    public void printLast() throws Exception {
        if(resultSet.last()){
            String name = resultSet.getString("productName");
            System.out.println("  "+name);
        }
    }
}
