package com.example.counterhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);

        if (savedInstanceState != null) {
                mShowCount.setText(savedInstanceState
                        .getString("Count"));
                mShowCount.setVisibility(View.VISIBLE);
        }

    }

    public void countMore(View view) {
            ++mCount;
            if(mShowCount!= null)
                mShowCount.setText(Integer.toString(mCount));
    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (mShowCount!=null) {
            outState.putString("Count", mShowCount.getText().toString());
        }
    }
}