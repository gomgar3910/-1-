package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main5Activity extends AppCompatActivity {
    ImageView im1,im2;
    boolean CM = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        im1 = findViewById(R.id.Im1);
        im2 = findViewById(R.id.Im2);
    }
    public void Im_Change(){
        if(CM){
            im2.setVisibility(View.INVISIBLE);
            CM = false;
        }
        else{
            im1.setVisibility(View.VISIBLE);
            CM = true;
        }
    }
}
