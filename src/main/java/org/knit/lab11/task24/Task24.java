package org.knit.lab11.task24;

//import org.knit.lab10.task22.Dictionary;

import java.sql.*;

public class Task24 {
    public static void main(String[] args) throws SQLException {

        createTable();
        Connection connection = DatabaseConnection.getConnection();

        //UserDAOImpl userDAO = new UserDAOImpl();
       // UserService userService = new UserService(userDAO);

       // Dialog.dialog(userService);

    }

    public static void createTable() throws SQLException {
        String createUsersTableSQL = "CREATE TABLE IF NOT EXISTS users (" +
                "id Integer PRIMARY KEY," +
                "name VARCHAR(100) NOT NULL," +
                "email VARCHAR(100) NOT NULL UNIQUE" +
                ");";



        String insertUsersSQL = "INSERT INTO users (id, name, email) VALUES\n" +

                "('Alice Johnson', 'alice.johnson@example.com'),\n" +
                "('Bob Brown', 'bob.brown@example.com'),\n" +
                "('Charlie White', 'charlie.white@example.com') ON CONFLICT DO NOTHING;";

        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement()) {
             statement.execute(createUsersTableSQL);
             statement.execute(insertUsersSQL);

        } catch (SQLException e) {
            System.err.println("Ошибка инициализации базы данных: " + e.getMessage());
        }

    }
}

