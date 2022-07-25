package com.workoutapp.core.user.database.util;

import java.sql.*;

public class Database {

    private static Database instance;

    private final Connection connection;

    private final String DATABASE_URL = "jdbc:mysql://localhost:3306/workoutApp";
    private final String DATABASE_USERNAME = "root";
    private final String DATABASE_PASSWORD = "password";

    public static void main(String[] args) {

    }//End of main

    public static Database getInstance() {
        if (instance == null) {
            try {
                instance = new Database();
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return instance;
    }

    Database() throws SQLException, ClassNotFoundException {
        connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
    }

    public ResultSet execute(String sql) {
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            if (sql.contains("SELECT")) return statement.executeQuery();
            else {
                statement.execute();
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}//End file
