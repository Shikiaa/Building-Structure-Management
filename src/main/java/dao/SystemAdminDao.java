package dao;

import entity.SystemAdmin;

import java.sql.SQLException;

public interface SystemAdminDao {

    public SystemAdmin findByUsername(String username) throws SQLException;

}
