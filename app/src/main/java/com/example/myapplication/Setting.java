package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;

public class Setting extends AppCompatActivity {

    SeekBar customSeekBar;
    int progressChangedValue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);




        // initiate  views
        customSeekBar =(SeekBar)findViewById(R.id.RangeBar);
        // perform seek bar change listener event used for getting the progress value
        customSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValue = progress;
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(Setting.this, "Seek bar progress is :" + progressChangedValue,
                        Toast.LENGTH_SHORT).show(); // !!!!!Need to be changed constantly stay apart
            }

        });


    }

    public int getRadius(){
        return progressChangedValue;
    }
}
