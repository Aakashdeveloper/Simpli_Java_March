

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class automain {

    public int createOrder(int customerNumber,LineItem lineItem) throws  Exception {
        Connection connection =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?"
                        + "user=root&password=admin987");

        try{

            PreparedStatement orderStmnt =
                    connection.prepareStatement(
                            "INSERT INTO orders " +
                                    "(orderDate, requiredDate, status, customerNumber ) " +
                                    "VALUES (now(),now(),'In Process',?)",

                            Statement.RETURN_GENERATED_KEYS );{

            orderStmnt.setInt(1,customerNumber);

            orderStmnt.executeUpdate();
                ResultSet result = orderStmnt.getGeneratedKeys();
                try {
                if(!result.next()){ return 0;}

                int orderNumber = result.getInt(1);

                String sqlStr =
                        "INSERT INTO orderdetails "
                                + "(orderNumber, productCode_x, quantityOrdered, "
                                +  "priceEach, orderLineNumber) "
                                + "VALUES (?,?,?,?,?)";

                PreparedStatement detailsPS =
                        connection.prepareStatement(sqlStr);
                try{

                    detailsPS.setInt(1,orderNumber);
                    detailsPS.setString(2,lineItem.productCode);
                    detailsPS.setInt(3,lineItem.quantityOrdered);
                    detailsPS.setDouble(4,lineItem.priceEach);
                    detailsPS.setDouble(5,1);

                    int count = detailsPS.executeUpdate();

                    if(count == 1){
                        return orderNumber;
                    }else{
                        return 0;
                    }
                }
                finally {

                }
            }finally {
                }

        }
    }finally {

        }
    }
}


