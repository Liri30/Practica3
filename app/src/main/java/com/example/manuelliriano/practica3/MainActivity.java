package com.example.manuelliriano.practica3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final int[] BUTTONS_ID={
            R.id.btn_colors,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      for(int id:BUTTONS_ID)
          findViewById(id).setOnClickListener(this);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn_colors:
                goActivity(ConstraintLayoutActivity.class);

        }
    }

    private void goActivity(Class<? extends AppCompatActivity> cls){
        startActivity(new Intent(MainActivity.this, cls));
    }
}
