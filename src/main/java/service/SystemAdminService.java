package service;

import dto.SystemAdminDto;
<<<<<<< HEAD
import entity.SystemAdmin;
=======
>>>>>>> 901ddfb81d43092efd0fa0b2ffc0553c787587c6

import java.sql.SQLException;


public interface SystemAdminService {

    public SystemAdminDto login(String email,String password) throws SQLException;

<<<<<<< HEAD
    public SystemAdminDto register(String email,String password) throws SQLException;

=======
>>>>>>> 901ddfb81d43092efd0fa0b2ffc0553c787587c6
}
