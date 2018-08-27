package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {

        try {
            request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User newUser = new User();

        if(username != null && email != null && password != null){

            newUser.setUsername(username);
            newUser.setEmail(email);
            newUser.setPassword(password);

        }

        try {
            DaoFactory.getUsersDao().insert(newUser);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if(newUser != new User()){

            try {
                response.sendRedirect("/profile");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
