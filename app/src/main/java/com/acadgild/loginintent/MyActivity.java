package com.acadgild.loginintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

    public void bacActivity(View view) {
        Intent intent=new Intent(this,MainActivity.class) ;
        startActivity(intent);
    }
}
