package dao;

import entity.SystemAdmin;

import java.sql.SQLException;

public interface SystemAdminDao {

    public SystemAdmin findByUsername(String username) throws SQLException;

<<<<<<< HEAD
    public SystemAdmin insertNewUser(String username,String password) throws SQLException;
=======
>>>>>>> 901ddfb81d43092efd0fa0b2ffc0553c787587c6
}
