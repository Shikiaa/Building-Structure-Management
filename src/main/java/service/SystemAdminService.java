package service;

import dto.SystemAdminDto;

import java.sql.SQLException;


public interface SystemAdminService {

    public SystemAdminDto login(String email,String password) throws SQLException;

}
