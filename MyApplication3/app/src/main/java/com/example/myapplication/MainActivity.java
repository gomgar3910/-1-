package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    Context context = this;
    @BindView(R.id.b1)
    Button b1;
    @BindView(R.id.b2)
    Button b2;
    @BindView(R.id.b3)
    Button b3;
    @BindView(R.id.b4)
    Button b4;
    @BindView(R.id.b5)
    Button b5;
    @BindView(R.id.b6)
    Button b6;
    @BindView(R.id.b7)
    Button b7;
    @BindView(R.id.b8)
    Button b8;
    @BindView(R.id.b9)
    Button b9;
    @BindView(R.id.b10)
    Button b10;
    @BindView(R.id.b11)
    Button b11;
    @BindView(R.id.b12)
    Button b12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick({R.id.b1, R.id.b2, R.id.b3, R.id.b4})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.b1:
                intent = new Intent(context, Main3Activity.class);
                startActivity(intent);
                break;
            case R.id.b2:
                intent = new Intent(context, Main4Activity.class);
                startActivity(intent);
                break;
            case R.id.b3:
                intent = new Intent(context, Table.class);
                startActivity(intent);
                break;
            case R.id.b4:
                intent = new Intent(context, Main6Activity.class);
                startActivity(intent);
                break;
            case R.id.b5:
                intent = new Intent(context, Main5Activity.class);
                startActivity(intent);
                break;
            case R.id.b6:

                break;
            case R.id.b7:
                intent = new Intent(context, SubActivity.class);
                startActivity(intent);
                break;
            case R.id.b8:
                break;
            case R.id.b9:
                break;
            case R.id.b10:
                break;
            case R.id.b11:
                break;
            case R.id.b12:
                break;
        }
    }
}
