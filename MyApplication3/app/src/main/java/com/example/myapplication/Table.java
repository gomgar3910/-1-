package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Table extends AppCompatActivity {

    Button ButText = null;
    Context context = this;
    Button Change_But = null;
    boolean change = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        ButText = (Button)findViewById(R.id.ButText);
        Change_But = (Button)findViewById(R.id.hi);
        ButText.setOnClickListener(new Button.OnClickListener(){
            @Override
            public  void onClick(View v) {
                if(change){
                    Toast.makeText(getApplicationContext(), "after", Toast.LENGTH_SHORT).show();
                    change = false;
                }
                else{
                    Toast.makeText(getApplicationContext(), "before", Toast.LENGTH_SHORT).show();
                    change = true;
                }
                Intent intent =new Intent(context,Main2Activity.class);
                startActivity(intent);
                Change_But.setText("hi");
            }

        });
    }
}
