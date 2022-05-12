package com.workoutapp.core.user.common;

public class WorkoutData {
    private String workoutType;
    private String workoutDifficulty; //easy, medium, hard, ranger


    public WorkoutData(String workoutType, String workoutDifficulty) {
        this.workoutType = workoutType;
        this.workoutDifficulty = workoutDifficulty;
    }

    public String getWorkoutType() {
        return workoutType;
    }

    public void setWorkoutType(String newWorkoutType) {
        workoutType = newWorkoutType;
    }

    public String getWorkoutDifficulty(){
        return workoutDifficulty;
    }

    public void setWorkoutDifficulty(String newWorkoutDifficulty) {
        workoutDifficulty = newWorkoutDifficulty;
    }


}
