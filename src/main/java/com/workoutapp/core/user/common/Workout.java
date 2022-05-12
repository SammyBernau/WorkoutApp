package com.workoutapp.core.user.common;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Workout {
    private String workoutName;
    private ArrayList<WorkoutData> workout;

//ask about how ArrayList<WorkoutDat> work in a constructor (since its an ArrayList of objects)
    public Workout(String workoutName, ArrayList<WorkoutData> workout) {
        this.workoutName = workoutName;
        this.workout= workout;
    }
}
