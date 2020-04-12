
import java.sql.Connection;
import java.sql.PreparedStatement;

public class OrderComponent {

    public void tryConnection() throws Exception {
        Connection con = transtiion.getConnection();
        try{

            PreparedStatement preparedStatement
                    = con.prepareStatement("select * from orderDetails");

            preparedStatement.execute();

            String msg = Thread.currentThread().getName() + " --> " + this.getConnectionId(con);
            System.out.println(msg);

        }finally {
            con.close();
        }
    }

    public String getConnectionId(Connection con) {
        String conId = con.toString();
        int lastPos = conId.length() - 2;
        conId = conId.substring(lastPos);
        return conId;

    }

}