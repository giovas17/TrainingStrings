package com.training.trainingstrings;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import java.util.Calendar;

/**
 * @author Giovani González
 * Created by darkgeat on 10/19/17.
 */

public class SimpleExampleActivity extends AppCompatActivity{
    private static final String TAG = SimpleExampleActivity.class.getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_example);

        TextView textView = (TextView)findViewById(R.id.textView1);
        Calendar calendar = Calendar.getInstance();
        StringBuilder builder = new StringBuilder();
        builder.append(getString(R.string.simple_string,5,"Hola")).append("\n");
        builder.append(getString(R.string.simple_date,calendar));
        textView.setText(builder.toString());

    }
}
