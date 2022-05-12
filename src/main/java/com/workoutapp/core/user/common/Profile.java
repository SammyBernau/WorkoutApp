package com.workoutapp.core.user.common;

public class Profile {
    private String email;
    private String userName;
    private String password;
    private double height;
    private double weight;
    private int age;

    public Profile(String email, String userName, String password, double height, double weight, int age) {
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String newEmail) {
        email = newEmail;
    }

    public String getUserName(){
        return userName;
    }

    public void setUserName(String newUserName) {
        userName = newUserName;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String newPassword) {
        password = newPassword;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double newHeight) {
        height = newHeight;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double newWeight) {
        weight = newWeight;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }




}
