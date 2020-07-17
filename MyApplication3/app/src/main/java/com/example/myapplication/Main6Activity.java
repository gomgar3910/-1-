package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main6Activity extends AppCompatActivity {

    boolean ImC = true;
    ImageView Image1,Image2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        Button but1 = (Button)findViewById(R.id.Bup);
        Button but2 = (Button)findViewById(R.id.Bdown);
        Image1 = (ImageView)findViewById(R.id.Image1);
        Image2 = (ImageView)findViewById(R.id.Image2);

        but1.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(ImC){
                    Image1.setImageResource(R.drawable.img2);
                    Image2.setImageResource(R.drawable.img1);
                    ImC = false;
                }
                else{
                    Image1.setImageResource(R.drawable.img1);
                    Image2.setImageResource(R.drawable.img2);
                    ImC = true;
                }
            }
        });
        but2.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(ImC){
                    Image1.setImageResource(R.drawable.img2);
                    Image2.setImageResource(R.drawable.img1);
                    ImC = false;
                }
                else{
                    Image1.setImageResource(R.drawable.img1);
                    Image2.setImageResource(R.drawable.img2);
                    ImC = true;
                }
            }
        });


    }
}
