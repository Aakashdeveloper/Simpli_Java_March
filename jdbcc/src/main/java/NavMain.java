import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class NavMain {
    public static void main(String[] args) throws Exception{
        Connection connection = DriverManager.getConnection("jdbc:mysql://database-1.c83fdlzp5lmg.us-east-2.rds.amazonaws.com:3306/classicmodels?user=admin&password=admin987");
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("SELECT * FROM products where productLine = 'Classic Cars'");

            ProductNavUtility comp = new ProductNavUtility(resultSet);

            System.out.println("All products");
            comp.printForward();

            System.out.println("First Row");
            comp.printFirst();

            System.out.println("Last Row");
            comp.printLast();


        }catch (Exception exception){
            System.out.println(exception);
        }
    }
}
