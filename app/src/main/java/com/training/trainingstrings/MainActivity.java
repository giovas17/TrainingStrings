package com.training.trainingstrings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Simple(View view) {
        Intent intent = new Intent(this, SimpleExampleActivity.class);
        startActivity(intent);
    }

    public void BuildTypePressed(View view) {
        Intent intent = new Intent(this, BuildTypesActivity.class);
        startActivity(intent);
    }
}
