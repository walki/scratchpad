package com.blooot.android.levelup;

/**
 * Created by rjw on 1/15/2015.
 */
public class RunWorkout extends Workout{



    public double getDistance() {
        return mDistance;
    }

    public void setDistance(double distance) {
        mDistance = distance;
    }

    public long getDuration() {
        return mDuration;
    }

    public void setDuration(long duration) {
        mDuration = duration;
    }

    private double mDistance;   // Distance in meters?
    private long mDuration;     // time in milliseconds?

    public RunWorkout(){
        super.mWorkoutType = WorkoutType.RUN;
    }

}
