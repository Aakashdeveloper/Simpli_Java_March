import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class DynamicComponent {
    public void printDynamicProduct(double lowPrice, double highPrice) throws Exception {
        Connection connection = DriverManager.getConnection("jdbc:mysql://database-1.c83fdlzp5lmg.us-east-2.rds.amazonaws.com:3306/classicmodels?user=admin&password=admin987");
        try {
           PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM products "
                   +"WHERE buyPrice BETWEEN ? AND ?");

           preparedStatement.setDouble(1, lowPrice);
           preparedStatement.setDouble(2,highPrice);

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                String name = resultSet.getString("productName");
                System.out.println(name);
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();

        } finally {
            connection.close();
        }
    }
    public void printMultipleFields(double lowPrice, double highPrice) throws Exception {
        Connection connection = DriverManager.getConnection("jdbc:mysql://database-1.c83fdlzp5lmg.us-east-2.rds.amazonaws.com:3306/classicmodels?user=admin&password=admin987");
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT productName, quantityInStock,buyPrice FROM products "
                    +"WHERE buyPrice BETWEEN ? AND ?");

            preparedStatement.setDouble(1, lowPrice);
            preparedStatement.setDouble(2,highPrice);

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                String name = resultSet.getString("productName");
                int quantity = resultSet.getInt("quantityInStock");
                double price = resultSet.getDouble("buyPrice");
                System.out.format("%-45s %5d %10.2f%n ",name,quantity,price );
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();

        } finally {
            connection.close();
        }
    }
}
