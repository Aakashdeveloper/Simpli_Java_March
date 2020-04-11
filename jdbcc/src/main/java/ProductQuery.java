
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class ProductQuery {

    public void printProductList() throws Exception {
        Connection connection =
                DriverManager.getConnection("jdbc:mysql://database-1.c83fdlzp5lmg.us-east-2.rds.amazonaws.com:3306/classicmodels?"
                        +"user=admin&password=admin987");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM products");

        while(resultSet.next()){
            String name = resultSet.getString("productName");
            System.out.println(name);
        }

        resultSet.close();
        statement.close();
        connection.close();
    }
    public void printOrderList() throws Exception {
        Connection connection =
                DriverManager.getConnection("jdbc:mysql://database-1.c83fdlzp5lmg.us-east-2.rds.amazonaws.com:3306/classicmodels?"
                        +"user=admin&password=admin987");

        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM orders");
        ResultSet resultSet = preparedStatement.executeQuery();

        while(resultSet.next()){
            int orderno = resultSet.getInt("orderNumber");
            System.out.println(orderno);
        }

        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}
