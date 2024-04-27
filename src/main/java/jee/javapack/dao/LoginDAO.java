package jee.javapack.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
    public static boolean validateUser(String login, String password) throws SQLException {
        boolean isValidUser = false;
        try (Connection connection = ConnectionDAO.getConnection();
             PreparedStatement pst = connection.prepareStatement("SELECT id, user_role FROM users WHERE  user_mail = ? AND user_password = ?")) {

            pst.setString(1, login);
            pst.setString(2, password);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                isValidUser = true;
            }
        } catch (SQLException e) {
            throw new SQLException("Error validating user", e);
        }
        return isValidUser;
    }
}
