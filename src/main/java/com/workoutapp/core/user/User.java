package com.workoutapp.core.user;

import com.workoutapp.core.user.database.util.Query;

public class User {

    //TODO: use sql builder to create new users

    public static void main(String[] args) {

    }

    public static boolean userExists(String tableName, String email) {
        return Query.build()
                .select(tableName)
                .where("email", email)
                .executeExists();
    }

    public static User attemptCreateUser(String tableName,String email) {
        if (userExists(tableName,email)) {
            return null;
        } else {

        }
            return null;
    }









}//End of file
