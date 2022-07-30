package com.workoutapp.core.user.common;

import static com.workoutapp.core.user.common.MuscleGroup.TRICEPS;

public class Exercise {


    public static void main(String[] args) {
        Exercise exercise1 = new ExerciseBuilder("Tricep Pushdown",TRICEPS)
                .reps(8)
                .sets(4)
                .difficulty(Difficulty.EASY)
                .build();
        System.out.println(exercise1);
    }

    private final String exerciseName;
    private final MuscleGroup muscleGroup;
    private  int reps;
    private  int sets;
    private Difficulty difficulty;

    private Exercise(ExerciseBuilder builder) {
        this.exerciseName = builder.exerciseName;
        this.muscleGroup = builder.muscleGroup;
        this.reps = builder.reps;
        this.sets = builder.sets;
        this.difficulty = builder.difficulty;
    }

    //Getters
    public String getExerciseName(){
        return exerciseName;
    }

    public MuscleGroup getMuscleGroup(){
        return muscleGroup;
    }

    public int getReps() {
        return reps;
    }

    public int getSets() {
        return sets;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }
    @Override
    public String toString() {
        return "-Exercise: " + exerciseName+ ", Muscle group:  " + muscleGroup + ", Reps: " + reps + ", Sets: " + sets + ", Difficulty: " + difficulty;
    }

    public static class ExerciseBuilder{
        private final String exerciseName;
        private final MuscleGroup muscleGroup;
        private int reps;
        private int sets;
        private Difficulty difficulty;

        public ExerciseBuilder(String exerciseName, MuscleGroup muscleGroup ){
            this.exerciseName = exerciseName;
            this.muscleGroup = muscleGroup;
        }

        public ExerciseBuilder reps(int reps){
            this.reps = reps;
            return this;
        }

        public ExerciseBuilder sets(int sets){
            this.sets = sets;
            return this;
        }

        public ExerciseBuilder difficulty(Difficulty difficulty) {
            this.difficulty = difficulty;
            return this;
        }

        public Exercise build() {
            Exercise exercise = new Exercise(this);
            return exercise;
        }
    }//End of ExerciseBuilder


}//End of file
