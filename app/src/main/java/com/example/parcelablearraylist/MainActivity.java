package com.example.parcelablearraylist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivityTAG_";
    private ArrayList<User> userList;
    private User user;
    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText = (EditText) findViewById(R.id.main_EditText);
        userList = new ArrayList<>();
    }

    public void addUser(View view) {
        user = new User(mEditText.getText().toString());
        userList.add(user);
        Log.d(TAG, "addUser: " + user);
    }

    public void doMagic(View view) {
        Intent mIntent = new Intent(getApplicationContext(), ResultActivity.class);
        mIntent.putParcelableArrayListExtra("users", userList);
        startActivity(mIntent);
    }
}
