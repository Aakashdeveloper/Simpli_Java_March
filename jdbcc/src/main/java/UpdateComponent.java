import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class UpdateComponent {
    public int updateEmployee(
                           String oldOfficeCode,
                           String newOfficeCode) throws  Exception {
        Connection connection = DriverManager.getConnection("jdbc:mysql://database-1.c83fdlzp5lmg.us-east-2.rds.amazonaws.com:3306/classicmodels?user=admin&password=admin987");
        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement(
                            "UPDATE employees SET officeCode = ? WHERE officeCode= ?"
                    );

            preparedStatement.setString(1, oldOfficeCode);
            preparedStatement.setString(2, newOfficeCode);
            int count = preparedStatement.executeUpdate();
            return count;

        } finally {
            connection.close();
        }
    }
}
