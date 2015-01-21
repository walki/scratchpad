package com.blooot.android.levelup;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.blooot.android.myapplication.R;

/**
 * Created by rjw on 1/15/2015.
 */
public class RunWorkoutFragment extends Fragment {

    private RunWorkout mRunWorkout;
    private Button mSubmitButton;
    private EditText mDistanceEditText;
    private EditText mDurationEditText;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mRunWorkout = new RunWorkout();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_runworkout, container, false);

        mDistanceEditText = (EditText)v.findViewById(R.id.run_distance);
        mDurationEditText = (EditText)v.findViewById(R.id.run_duration);

        mSubmitButton = (Button)v.findViewById(R.id.submit);
        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mRunWorkout.setDistance(Conversion.milesToMeters(mDistanceEditText.getText().toString()));
                // TODO: Masked input with a textwatcher?
                // Or maybe a control?
                mRunWorkout.setDuration(Conversion.TimeToMilliSeconds(mDurationEditText.getText().toString()));
            }
        });

        return v;
    }
}
