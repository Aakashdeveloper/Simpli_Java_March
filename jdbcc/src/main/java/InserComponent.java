import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class InserComponent {
        public int addEmployee(String lastName, String firstName,
                               String extension,
                               String email,
                               String officeCode,
                               String jobTitle) throws  Exception {
            Connection connection = DriverManager.getConnection("jdbc:mysql://database-1.c83fdlzp5lmg.us-east-2.rds.amazonaws.com:3306/classicmodels?user=admin&password=admin987");
            try {
                PreparedStatement preparedStatement =
                        connection.prepareStatement(
                                "INSERT INTO employees "
                                +"(lastName,firstName,extension,email,officeCode,jobTitle)"
                                +"VALUES(?,?,?,?,?,?)",

                                Statement.RETURN_GENERATED_KEYS
                        );

                preparedStatement.setString(1, lastName);
                preparedStatement.setString(2, firstName);
                preparedStatement.setString(3, extension);
                preparedStatement.setString(4, email);
                preparedStatement.setString(5, officeCode);
                preparedStatement.setString(6, jobTitle);

                preparedStatement.executeUpdate();

                ResultSet resultSet = preparedStatement.getGeneratedKeys();
                try{
                    int autogenkey = 0;
                    if(resultSet.next()){
                        autogenkey=resultSet.getInt(1);
                    }
                    return autogenkey;
                } finally {
                    connection.close();
                }

        } finally {
                connection.close();
            }
}}


