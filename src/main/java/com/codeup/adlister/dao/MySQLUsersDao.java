package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class MySQLUsersDao implements Users{

    private Connection connection;


    public MySQLUsersDao(Config config) throws SQLException {


        DriverManager.registerDriver(new Driver());

        connection = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword());
    }


    @Override
    public User findByUsername(String username){

        User user = new User();

        try {
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM users WHERE username = ?" ,Statement.RETURN_GENERATED_KEYS);

            stmt.setString(1, username);

            ResultSet rs = stmt.executeQuery();


            user.setId(rs.getLong(1));
            user.setUsername(rs.getString(2));
            user.setEmail(rs.getString(3));
            user.setPassword(rs.getString(4));

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return user;
    }

    @Override
    public Long insert(User user) {



        String query = "INSERT INTO users(username, email, password) VALUES (?, ?, ?)";

        try{

            PreparedStatement stmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());

            stmt.executeUpdate();

        }catch (SQLException e){
            throw new RuntimeException("Users Dao Error.");
        }





        return null;
    }
}
