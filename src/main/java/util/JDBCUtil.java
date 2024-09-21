package util;

import java.sql.*;

public class JDBCUtil {

    private static String url="jdbc:mysql://localhost:3306/bsmm";
<<<<<<< HEAD
    private static String pwd="QHB.12345";
    private static String username="root";

=======
    private static String pwd="";
    private static String username="";
    
>>>>>>> 901ddfb81d43092efd0fa0b2ffc0553c787587c6
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
<<<<<<< HEAD

    public static Connection getConnection() throws SQLException {

        Connection connection= DriverManager.getConnection(url,username,pwd);

        return connection;
    }

=======
    
    public static Connection getConnection() throws SQLException {
    
        Connection connection= DriverManager.getConnection(url,username,pwd);
    
        return connection;
    }
    
>>>>>>> 901ddfb81d43092efd0fa0b2ffc0553c787587c6
    public static void release(Connection connection, Statement statement, ResultSet resultSet) throws SQLException {
        if (connection!=null){
            connection.close();
        }
<<<<<<< HEAD

        if (statement!=null){
            statement.close();
        }

        if (resultSet !=null){
            resultSet.close();
        }

=======
    
        if (statement!=null){
            statement.close();
        }
    
        if (resultSet !=null){
            resultSet.close();
        }
    
>>>>>>> 901ddfb81d43092efd0fa0b2ffc0553c787587c6
    }


}
