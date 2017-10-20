package com.training.trainingstrings;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Date;

/**
 * @author Giovani Gonzalez
 * Created by darkgeat on 10/19/17.
 */

public class BuildTypesActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_build_types);

        TextView textView = (TextView)findViewById(R.id.textView2);
        Uri endpoint = Uri.parse(BuildConfig.base_url).buildUpon()
                .appendPath("users")
                .appendQueryParameter("id","23")
                .appendQueryParameter("name","Giovas")
                .build();
        StringBuilder builder = new StringBuilder();
        builder.append(endpoint.toString()).append("\n");
        if (!BuildConfig.DEBUG){
            Date date = new Date(BuildConfig.date_string);
            builder.append("Date: ").append(date.toString());
        }
        textView.setText(builder.toString());
    }
}
