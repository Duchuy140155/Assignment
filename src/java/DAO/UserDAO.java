/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DBConnect.DBConnect;
import java.sql.Connection;
import Entity.User;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author DucHuy
 */
public class UserDAO {

    private Connection SQLConnection;

    public UserDAO() {
        this.SQLConnection = DBConnect.getConnection();
    }

    public Boolean add(User s) throws SQLException {
        String sql = "INSERT INTO [User](username, password,role_number,fullname, type )\n"
                + "VALUES ('?','?',?,'?','?')";

        PreparedStatement ps = this.SQLConnection.prepareStatement(sql);
        ps.setString(0, s.getUsername());
        ps.setString(1, s.getPassword());
        ps.setString(2,s.getRoleNumber());        
        ps.setString(3, s.getFullname());
        ps.setInt(4,  Integer.valueOf(s.getType()));

        return ps.execute();
    }
    
      public User login(String username, String password) throws SQLException {
        String sql = "INSERT INTO [User](username, password, type )\n"
                + "VALUES ('?','?',?)";

        PreparedStatement ps = this.SQLConnection.prepareStatement(sql);
        ps.setString(0, s.getUsername());
        ps.setString(1, s.getPassword());
        ps.setInt(2, Integer.valueOf(s.getType()));
        return ps.execute();
    }
    

}
