package com.workoutapp.core.user;

import com.workoutapp.core.user.common.Group;
import com.workoutapp.core.user.common.Workout;
import com.workoutapp.core.user.database.util.Query;
import org.w3c.dom.ls.LSOutput;

import java.net.Inet4Address;
import java.sql.ResultSet;
import java.util.ArrayList;

public class User {
    private String email;
    private String password;
    private int age;
    private double height;
    private double weight;

    public static void main(String[] args) {
        userExists("Sambernau04@gmail.com");
    }


    public static void userExists(String email) {
        boolean query = Query.build()
                .select("users")
                .where("email", email)
                .executeExists();
        if (query) {
            System.out.println("User with " + email + " already exists");
        }
    }

    public User(String email, String password, int age, double height, double weight) {
        this.email = email;
        this.password = password;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }


    public String getEmail(){
        return email;
    }

    public void setNewEmail(String newEmail){
        email = newEmail;
    }

    public String getPassword(){
        return password;
    }
    public void setPassword(String newPassword){
        password = newPassword;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double newHeight){
        height=newHeight;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double newWeight){
        weight=newWeight;
    }





}
