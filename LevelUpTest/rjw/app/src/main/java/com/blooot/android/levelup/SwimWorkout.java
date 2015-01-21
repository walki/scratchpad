package com.blooot.android.levelup;

/**
 * Created by rjw on 1/21/2015.
 */
public class SwimWorkout extends Workout {


    public long getDuration() {
        return mDuration;
    }

    public void setDuration(long duration) {
        mDuration = duration;
    }

    public long getLapCount() {
        return mLapCount;
    }

    public void setLapCount(long lapCount) {
        mLapCount = lapCount;
    }

    public double getLapDistance() {
        return mLapDistance;
    }

    public void setLapDistance(double lapDistance) {
        mLapDistance = lapDistance;
    }

    private long mLapCount;
    private double mLapDistance;    // distance in meters
    private long mDuration;         // time in milliseconds

    //TODO: Consider multiple sets of laps/distances

    public SwimWorkout(){
        super.mWorkoutType = WorkoutType.SWIM;
    }

    public double getDistance()
    {
        return mLapCount * mLapDistance;
    }


}
