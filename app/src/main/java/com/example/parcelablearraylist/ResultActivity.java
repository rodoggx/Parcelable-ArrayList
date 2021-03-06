package com.example.parcelablearraylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {

    private static final String TAG = "ResultActivityTAG_";
    private ArrayList<User> userList;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        textView = (TextView) findViewById(R.id.result_TxtVw);

        userList = getIntent().getParcelableArrayListExtra("users");
        for (User user : userList) {
            textView.setText(textView.getText() + user.getName().toString() + "\n");
        }
    }
}


