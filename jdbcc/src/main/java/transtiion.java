
        import java.sql.Connection;
        import java.sql.SQLException;
        import com.zaxxer.hikari.HikariConfig;
        import com.zaxxer.hikari.HikariDataSource;

public class transtiion {

    private static HikariDataSource dataSource;

    static {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl( "jdbc:mysql://localhost:3306/classicmodels?user=admin&password=admin987&serverTimezone=UTC" );

        dataSource = new HikariDataSource( config );
        dataSource.setMaximumPoolSize(4);
    }

    public transtiion() {}

    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}
