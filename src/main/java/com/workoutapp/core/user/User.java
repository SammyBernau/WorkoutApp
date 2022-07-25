package com.workoutapp.core.user;

import com.workoutapp.core.user.database.util.Query;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class User {

    //TODO: Create javafx framework to allow input into createUser method. Due Date: 6/26

    public static void main(String[] args) throws SQLException {
        printUsers();
    }

    public static boolean userExists(String tableName, String email) {
        return Query.build()
                .select(tableName)
                .where("email", email)
                .executeExists();
    }

    public static void attemptCreateUser(String tableName,String email) {
        if (userExists(tableName,email)) {
            System.out.println("User with entered email already exists");
        } else {
            System.out.println("Creating user with entered credentials...");
            createUser(2,"Voss", "Chris", email, 19, 65, 140);
            System.out.println("User entered into database");
        }
    }

    public static void createUser(int userId, String lastName, String firstname, String email,
                                  int age, double height, double weight){
        ResultSet createUserQuery = Query.build()
                .insert("users", userId,lastName, firstname, email, age,height,weight)
                .execute();
    }


    //Prints users table to console
    public static void printUsers() throws SQLException {
        ResultSet printQuery = Query.build()
                .select("users")
                .execute();
        while (printQuery.next()) {
            int userId = printQuery.getInt(1);
            String lastName = printQuery.getString(2);
            String firstName= printQuery.getString(3);
            String email = printQuery.getString(4);
            int age = printQuery.getInt(5);
            double height = printQuery.getDouble(6);
            double weight = printQuery.getDouble(7);
            System.out.println("User  " + userId + "(user id): last name = " + lastName + ", first name = " +
                    firstName + ", email = " + email + ", age = " + age +
                    ", height = " + height + ", weight = " + weight );
        }
    }









}//End of file
