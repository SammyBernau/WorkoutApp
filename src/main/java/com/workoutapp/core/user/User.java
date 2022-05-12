package com.workoutapp.core.user;

import com.workoutapp.core.user.common.Group;
import com.workoutapp.core.user.common.Profile;
import com.workoutapp.core.user.common.Workout;

import java.util.ArrayList;

public class User {
    private final int userId;
    private final Profile profile;
    private final ArrayList<Group> group;
    private final ArrayList<Workout> workout;




    public User(int userId, Profile profile,ArrayList<Group> group, ArrayList<Workout> workout){
        this.userId = userId;
        this.profile = profile;
        this.group = group;
        this.workout = workout;
    }

    public int getUserId() {
        return userId;
    }

    public Profile getProfile(){
        return profile;
    }

    public ArrayList<Group> getGroup(){
        return group;
    }

    public ArrayList<Workout> getWorkout(){
        return workout;
    }


}
