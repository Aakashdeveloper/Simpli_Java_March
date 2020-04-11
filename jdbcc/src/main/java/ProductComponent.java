
import java.sql.Connection;
import java.sql.DriverManager;

public class ProductComponent {

    public boolean tryConnection() throws Exception {
        Connection connection =
                DriverManager.getConnection("jdbc:mysql://database-1.c83fdlzp5lmg.us-east-2.rds.amazonaws.com:3306/classicmodels?"
                +"user=admin&password=admin987");

        boolean isValid = connection.isValid(2);

        connection.close();

        return  isValid;
    }
}
