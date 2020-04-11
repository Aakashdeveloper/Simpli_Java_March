import java.sql.DriverManager;
import java.sql.Connection;

public class ConnectComponent {
    public boolean tryConnection() throws Exception{

        Connection conn = DriverManager.getConnection("jdbc:mysql://database-1.c83fdlzp5lmg.us-east-2.rds.amazonaws.com:3306/classicmodels?user=admin&password=admin987");
        try {
            return conn.isValid(2);

        } finally {
            conn.close();
        }
    }

}