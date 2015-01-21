package com.blooot.android.levelup;

import java.util.Date;
import java.util.UUID;

/**
 * Created by rjw on 1/21/2015.
 */
public class Workout {

    public enum WorkoutType {
        RUN,
        BIKE,
        SWIM,
        LIFTING
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public WorkoutType getWorkoutType() {
        return mWorkoutType;
    }

    public void setWorkoutType(WorkoutType workoutType) {
        mWorkoutType = workoutType;
    }

    private UUID mId;
    private String mTitle;
    private Date mDate;
    protected WorkoutType mWorkoutType;

    public Workout() {
        mId = UUID.randomUUID();
    }

}
