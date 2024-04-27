package jee.javapack.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SignInDAO {
    public static int createUser(String userName, String userEmail, String userPassword) throws SQLException {
        int counter = 0;
        try (Connection connection = ConnectionDAO.getConnection();
             PreparedStatement pst = connection.prepareStatement("insert into users (username, user_mail, user_password) values (?,?,?)")) {

            pst.setString(1, userName);
            pst.setString(2, userEmail);
            pst.setString(3, userPassword);

            counter = pst.executeUpdate();
        } catch (SQLException e) {
            throw new SQLException("Error creating user", e);
        }
        return counter;
    }
}
