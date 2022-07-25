package com.workoutapp.core.user.database.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.stream.Collectors;


public class Query {

    private String query;

    public Query(String query) {
        this.query = query;
    }

    public Query() {
        this.query = "";
    }

    //String builder pattern
    public Query with(String x) {
        query += x + " ";
        return this;
    }

    public Query select(String tableName) {
        return with("SELECT * FROM " + tableName);
    }

    public <T>Query where(String columnName, T value) {
        return with("WHERE `" + columnName + "` = '" + value + "'");
    }

    public <T> Query UPDATE(String tableName, String columnName, T value) {
        return with("UPDATE " + tableName + " SET `" + columnName + "` = " + value);
    }

    public Query insert(String tableName, Object... values) {
        String sValues = Arrays.stream(values).map(obj -> "'" + obj.toString() + "'").collect(Collectors.joining(","));
        return with("INSERT INTO " + tableName + " VALUES (" + sValues + ")");
    }

    public static Query build() {
        return new Query();
    }


    /**
     * This executes the query on the current thread - can block main thread
     * @return result set if its a select statement, otherwise returns null
     */
    public ResultSet execute() {
        return Database.getInstance().execute(query);
    }

    public boolean executeExists() {
        ResultSet result = execute();
        try {
            return result !=null && result.next();
        } catch (SQLException e) {
            return false;
        }
    }






}//End of file
