package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class Main4Activity extends AppCompatActivity {

    Button num0,num1,num2,num3,num4,num5,num6,num7,num8,num9;
    Button Clear,Plus_Minus,Percent,Division,Multiply,Minus,Plus,Point,Cal;
    TextView Result;
    double a = 0 ,b = 0.3456789;
    int P = 0;
    double akt = 0.1;
    String A_Num ="0",B_Num ="0",re;
    double result;
    //ArrayList Input_num = new ArrayList(); 쓸지모름
    TextView Result_Board;
    boolean Num_Change = true, PMPa = true,PMPb = true, Change_Point = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        num0 = (Button)findViewById(R.id.n0);
        num1 = (Button)findViewById(R.id.n1);
        num2 = (Button)findViewById(R.id.n2);
        num3 = (Button)findViewById(R.id.n3);
        num4 = (Button)findViewById(R.id.n4);
        num5 = (Button)findViewById(R.id.n5);
        num6 = (Button)findViewById(R.id.n6);
        num7 = (Button)findViewById(R.id.n7);
        num8 = (Button)findViewById(R.id.n8);
        num9 = (Button)findViewById(R.id.n9);
        Result_Board = (TextView)findViewById(R.id.board_tv);
        Clear = (Button)findViewById(R.id.Clear);
        Plus_Minus = (Button)findViewById(R.id.Plus_Minus);
        Percent = (Button)findViewById(R.id.Percent);
        Division = (Button)findViewById(R.id.Division);
        Multiply = (Button)findViewById(R.id.Multiply);
        Minus = (Button)findViewById(R.id.Minus);
        Plus = (Button)findViewById(R.id.Plus);
        Point = (Button)findViewById(R.id.Point);
        Cal = (Button)findViewById(R.id.Cal);
    }
    public void Click_num0(View v){
        if(Num_Change){
            if(Change_Point){
                if(akt == 0.1){
                    A_Num += "0";

                    Result_Board.setText(A_Num);
                    akt = 0.01;
                }
                else{

                    A_Num += "0";
                    Result_Board.setText(A_Num);
                    akt *= 0.1;
                }
            }
            else{
                if(a == 0){
                    a = 0 ;
                    A_Num = Double.toString(a);
                    Result_Board.setText("0");
                }
                else{
                    a = a*10;
                    A_Num = Double.toString(a);
                    Result_Board.setText(A_Num);
                }
            }
        }
    }
    public void Click_num1(View v){
        if(Num_Change){
            if(Change_Point){
                if(a == 0){
                    a = 0.1 ;
                    A_Num = Double.toString(a);
                    Result_Board.setText("0.1");
                }
                else{
                    a = a + (akt * 1);
                    A_Num = Double.toString(a);
                    Result_Board.setText(A_Num);
                    akt *= 0.1;
                }
            }
            else{
                if(a == 0){
                    a = 1 ;
                    A_Num = Double.toString(a);
                    Result_Board.setText("1");
                }
                else{
                    a = a*10 + 1;
                    A_Num = Double.toString(a);
                    Result_Board.setText(A_Num);
                }
            }
        }
        else{
            if(Change_Point){
                if(b == 0.3456789){
                    b = 0.1;
                    Result_Board.setText(A_Num + "0.1");
                }
                else{
                    b = b + ( akt * 1);
                    B_Num = Double.toString(b);
                    Result_Board.setText(A_Num + B_Num);
                    akt *= 0.1;
                }
            }
            else{
                if(b == 0.3456789){
                    b = 1;
                    Result_Board.setText(A_Num + "9");
                }
                else{
                    b = b*10 + 1;
                    B_Num = Double.toString(b);
                    Result_Board.setText(A_Num + B_Num);
                }
            }

        }
    }
    public void Click_num2(View v){
        if(Num_Change){
            if(Change_Point){
                if(a == 0){
                    a = 0.2 ;
                    A_Num = Double.toString(a);
                    Result_Board.setText("0.2");
                }
                else{
                    a = a + (akt * 2);
                    A_Num = Double.toString(a);
                    Result_Board.setText(A_Num);
                    akt *= 0.1;
                }
            }
            else{
                if(a == 0){
                    a = 2 ;
                    A_Num = Double.toString(a);
                    Result_Board.setText("2");
                }
                else{
                    a = a*10 + 2;
                    A_Num = Double.toString(a);
                    Result_Board.setText(A_Num);
                }
            }
        }
        else{
            if(Change_Point){
                if(b == 0.3456789){
                    b = 0.2;
                    Result_Board.setText(A_Num + "0.2");
                }
                else{
                    b = b + ( akt * 2);
                    B_Num = Double.toString(b);
                    Result_Board.setText(A_Num + B_Num);
                    akt *= 0.1;
                }
            }
            else{
                if(b == 0.3456789){
                    b = 2;
                    Result_Board.setText(A_Num + "9");
                }
                else{
                    b = b*10 + 2;
                    B_Num = Double.toString(b);
                    Result_Board.setText(A_Num + B_Num);
                }
            }

        }
    }
    public void Click_num3(View v){
        if(Num_Change){
            if(Change_Point){
                if(a == 0){
                    a = 0.3 ;
                    A_Num = Double.toString(a);
                    Result_Board.setText("0.3");
                }
                else{
                    a = a + (akt * 3);
                    A_Num = Double.toString(a);
                    Result_Board.setText(A_Num);
                    akt *= 0.1;
                }
            }
            else{
                if(a == 0){
                    a = 3 ;
                    A_Num = Double.toString(a);
                    Result_Board.setText("3");
                }
                else{
                    a = a*10 +3;
                    A_Num = Double.toString(a);
                    Result_Board.setText(A_Num);
                }
            }
        }
        else{
            if(Change_Point){
                if(b == 0.3456789){
                    b = 0.3;
                    Result_Board.setText(A_Num + "0.3");
                }
                else{
                    b = b + ( akt * 3);
                    B_Num = Double.toString(b);
                    Result_Board.setText(A_Num + B_Num);
                    akt *= 0.1;
                }
            }
            else{
                if(b == 0.3456789){
                    b = 3;
                    Result_Board.setText(A_Num + "3");
                }
                else{
                    b = b*10 + 3;
                    B_Num = Double.toString(b);
                    Result_Board.setText(A_Num + B_Num);
                }
            }

        }
    }
    public void Click_num4(View v){
        if(Num_Change){
            if(Change_Point){
                if(a == 0){
                    a = 0.4 ;
                    A_Num = Double.toString(a);
                    Result_Board.setText("0.4");
                }
                else{
                    a = a + (akt *4);
                    A_Num = Double.toString(a);
                    Result_Board.setText(A_Num);
                    akt *= 0.1;
                }
            }
            else{
                if(a == 0){
                    a = 4 ;
                    A_Num = Double.toString(a);
                    Result_Board.setText("4");
                }
                else{
                    a = a*10 + 4;
                    A_Num = Double.toString(a);
                    Result_Board.setText(A_Num);
                }
            }
        }
        else{
            if(Change_Point){
                if(b == 0.3456789){
                    b = 0.4;
                    Result_Board.setText(A_Num + "0.4");
                }
                else{
                    b = b + ( akt * 4);
                    B_Num = Double.toString(b);
                    Result_Board.setText(A_Num + B_Num);
                    akt *= 0.1;
                }
            }
            else{
                if(b == 0.3456789){
                    b = 4;
                    Result_Board.setText(A_Num + "4");
                }
                else{
                    b = b*10 + 4;
                    B_Num = Double.toString(b);
                    Result_Board.setText(A_Num + B_Num);
                }
            }

        }
    }
    public void Click_num5(View v){
        if(Num_Change){
            if(Change_Point){
                if(a == 0){
                    a = 0.5 ;
                    A_Num = Double.toString(a);
                    Result_Board.setText("0.5");
                }
                else{
                    a = a + (akt * 5);
                    A_Num = Double.toString(a);
                    Result_Board.setText(A_Num);
                    akt *= 0.1;
                }
            }
            else{
                if(a == 0){
                    a = 5 ;
                    A_Num = Double.toString(a);
                    Result_Board.setText("5");
                }
                else{
                    a = a*10 + 5;
                    A_Num = Double.toString(a);
                    Result_Board.setText(A_Num);
                }
            }
        }
        else{
            if(Change_Point){
                if(b == 0.3456789){
                    b = 0.5;
                    Result_Board.setText(A_Num + "0.5");
                }
                else{
                    b = b + ( akt * 5);
                    B_Num = Double.toString(b);
                    Result_Board.setText(A_Num + B_Num);
                    akt *= 0.1;
                }
            }
            else{
                if(b == 0.3456789){
                    b = 9;
                    Result_Board.setText(A_Num + "9");
                }
                else{
                    b = b*10 + 9;
                    B_Num = Double.toString(b);
                    Result_Board.setText(A_Num + B_Num);
                }
            }

        }
    }
    public void Click_num6(View v){
        if(Num_Change){
            if(Change_Point){
                if(a == 0){
                    a = 0.6 ;
                    A_Num = Double.toString(a);
                    Result_Board.setText("0.6");
                }
                else{
                    a = a + (akt * 6);
                    A_Num = Double.toString(a);
                    Result_Board.setText(A_Num);
                    akt *= 0.1;
                }
            }
            else{
                if(a == 0){
                    a = 6 ;
                    A_Num = Double.toString(a);
                    Result_Board.setText("6");
                }
                else{
                    a = a*10 + 6;
                    A_Num = Double.toString(a);
                    Result_Board.setText(A_Num);
                }
            }
        }
        else{
            if(Change_Point){
                if(b == 0.3456789){
                    b = 0.6;
                    Result_Board.setText(A_Num + "0.6");
                }
                else{
                    b = b + ( akt * 6);
                    B_Num = Double.toString(b);
                    Result_Board.setText(A_Num + B_Num);
                    akt *= 0.1;
                }
            }
            else{
                if(b == 0.3456789){
                    b = 6;
                    Result_Board.setText(A_Num + "6");
                }
                else{
                    b = b*10 + 6;
                    B_Num = Double.toString(b);
                    Result_Board.setText(A_Num + B_Num);
                }
            }

        }
    }
    public void Click_num7(View v){
        if(Num_Change){
            if(Change_Point){
                if(a == 0){
                    a = 0.7 ;
                    A_Num = Double.toString(a);
                    Result_Board.setText("0.7");
                }
                else{
                    a = a + (akt * 7);
                    A_Num = Double.toString(a);
                    Result_Board.setText(A_Num);
                    akt *= 0.1;
                }
            }
            else{
                if(a == 0){
                    a = 7 ;
                    A_Num = Double.toString(a);
                    Result_Board.setText("7");
                }
                else{
                    a = a*10 + 7;
                    A_Num = Double.toString(a);
                    Result_Board.setText(A_Num);
                }
            }
        }
        else{
            if(Change_Point){
                if(b == 0.3456789){
                    b = 0.7;
                    Result_Board.setText(A_Num + "0.7");
                }
                else{
                    b = b + ( akt * 7);
                    B_Num = Double.toString(b);
                    Result_Board.setText(A_Num + B_Num);
                    akt *= 0.1;
                }
            }
            else{
                if(b == 0.3456789){
                    b = 7;
                    Result_Board.setText(A_Num + "7");
                }
                else{
                    b = b*10 + 7;
                    B_Num = Double.toString(b);
                    Result_Board.setText(A_Num + B_Num);
                }
            }

        }
    }
    public void Click_num8(View v){
        if(Num_Change){
            if(Change_Point){
                if(a == 0){
                    a = 0.8 ;
                    A_Num = Double.toString(a);
                    Result_Board.setText("0.9");
                }
                else{
                    a = a + (akt * 8);
                    A_Num = Double.toString(a);
                    Result_Board.setText(A_Num);
                    akt *= 0.1;
                }
            }
            else{
                if(a == 0){
                    a = 8 ;
                    A_Num = Double.toString(a);
                    Result_Board.setText("8");
                }
                else{
                    a = a*10 + 8;
                    A_Num = Double.toString(a);
                    Result_Board.setText(A_Num);
                }
            }
        }
        else{
            if(Change_Point){
                if(b == 0.3456789){
                    b = 0.8;
                    Result_Board.setText(A_Num + "0.8");
                }
                else{
                    b = b + ( akt * 8);
                    B_Num = Double.toString(b);
                    Result_Board.setText(A_Num + B_Num);
                    akt *= 0.1;
                }
            }
            else{
                if(b == 0.3456789){
                    b = 8;
                    Result_Board.setText(A_Num + "8");
                }
                else{
                    b = b*10 + 8;
                    B_Num = Double.toString(b);
                    Result_Board.setText(A_Num + B_Num);
                }
            }

        }
    }
    public void Click_num9(View v){
        if(Num_Change){
            if(Change_Point){
                if(a == 0){
                    a = 0.9 ;
                    A_Num = Double.toString(a);
                    Result_Board.setText("0.9");
                }
                else{
                    a = a + (akt * 9);
                    A_Num = Double.toString(a);
                    Result_Board.setText(A_Num);
                    akt *= 0.1;
                }
            }
            else{
                if(a == 0){
                    a = 9 ;
                    A_Num = Double.toString(a);
                    Result_Board.setText("9");
                }
                else{
                    a = a*10 + 9;
                    A_Num = Double.toString(a);
                    Result_Board.setText(A_Num);
                }
            }
        }
        else{
            if(Change_Point){
                if(b == 0.3456789){
                    b = 0.9;
                    Result_Board.setText(A_Num + "0.9");
                }
                else{
                    b = b + ( akt * 9);
                    B_Num = Double.toString(b);
                    Result_Board.setText(A_Num + B_Num);
                    akt *= 0.1;
                }
            }
            else{
                if(b == 0.3456789){
                    b = 9;
                    Result_Board.setText(A_Num + "9");
                }
                else{
                    b = b*10 + 9;
                    B_Num = Double.toString(b);
                    Result_Board.setText(A_Num + B_Num);
                }
            }

        }
    }
    public void Click_Clear(View v){

            a = 0;
            b = 0.3456789;
            Num_Change = true;
            Result_Board.setText("0");
            PMPa = true;
            PMPb = true;
        Change_Point = false;
        akt = 0.1;


    }
    public void Click_Plus_Minus(View v){
        if(a != 0 && Num_Change){
            if(PMPa){
                Result_Board.setText("-" + A_Num);

                PMPa = false;
            }
            else{
                Result_Board.setText(A_Num);
                PMPa = true;
            }
        // Cal 에서 초기화
        }
        if(b != 0.3456789 && Num_Change == false){
            if(PMPb){
                Result_Board.setText("-" + B_Num);
                a -= a;
                PMPb = false;
            }
            else{
                Result_Board.setText(B_Num);
                a -= a;
                PMPb = true;
            }

        }
    }
    public void Click_Percent(View v){
        if(!Num_Change){
            b = a*b*0.01;
            B_Num = Double.toString(b);
            Result_Board.setText(A_Num + B_Num);
        }

        Change_Point = false;
    }
    public void Click_Division(View v){
        if(Num_Change){
            b = 0.3456789;
            Result_Board.setText(A_Num + "/");
            P =2;
            Num_Change = false;
            A_Num = A_Num + "/";
            Change_Point = false;
            akt = 0.1;
        }
    }
    public void Click_Multiply(View v){
        if(Num_Change){
            b = 0.3456789;
            Result_Board.setText(A_Num + "X");
            P =3;
            Num_Change = false;
            A_Num = A_Num + "X";
            Change_Point = false;
            akt = 0.1;
        }
    }
    public void Click_Minus(View v){
        if(Num_Change){
            b = 0.3456789;
            Result_Board.setText(A_Num + "-");
            P = 4;
            Num_Change = false;
            A_Num = A_Num + "-";
            Change_Point = false;
            akt = 0.1;
        }
    }
    public void Click_Plus(View v){
        if(Num_Change){
            b = 0.3456789;
            Result_Board.setText(A_Num + "+");
            P = 5;
            Num_Change = false;
            A_Num = A_Num + "+";
            Change_Point = false;
            akt = 0.1;
        }
    }
    public void Click_Point(View v){
        Change_Point = true;

    }
    public void Click_Cal(View v){
        switch (P){
            case 2:
                if(b == 0.3456789){
                    b = a;
                }


                        result = a / b;
                        a = result;


                    re = Double.toString(result);
                    A_Num = re;
                    Result_Board.setText(re);

                break;
            case 3:
                if(b == 0.3456789){
                    b = a;
                }

                    result = a * b;
                    a = result;


                re = Double.toString(result);
                A_Num = re;
                Result_Board.setText(re);
                break;
            case 4:
                if(b == 0.3456789){
                    b = a;
                }
                result = a - b;
                a = result;
                re = Double.toString(result);
                A_Num = re;
                Result_Board.setText(re);
                break;
            case 5:
                if(b == 0.3456789){
                    b = a;
                }
                result = a + b;
                a = result;
                re = Double.toString(result);
                A_Num = re;
                Result_Board.setText(re);
                break;

        }
        PMPa = true;
        PMPb = true;


        Num_Change = true;

        Change_Point = false;
    }
}



