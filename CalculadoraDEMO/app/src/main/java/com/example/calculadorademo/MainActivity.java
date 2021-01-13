package com.example.calculadorademo;

import android.media.VolumeShaper;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.tan;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView resultadoText;
    double n1,n2,res;
    String operador;
    Switch RadSwitch;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        

    }

    public void button0 (View view){
        resultadoText=(TextView)findViewById(R.id.resultadoTextView);
        resultadoText.setText(resultadoText.getText()+"0");
    }

    public void button1 (View view){
        resultadoText=(TextView)findViewById(R.id.resultadoTextView);
        resultadoText.setText(resultadoText.getText()+"1");
    }
    public void button2 (View view){
        resultadoText=(TextView)findViewById(R.id.resultadoTextView);
        resultadoText.setText(resultadoText.getText()+"2");
    }
    public void button3 (View view){
        resultadoText=(TextView)findViewById(R.id.resultadoTextView);
        resultadoText.setText(resultadoText.getText()+"3");
    }
    public void button4 (View view){
        resultadoText=(TextView)findViewById(R.id.resultadoTextView);
        resultadoText.setText(resultadoText.getText()+"4");
    }
    public void button5 (View view){
        resultadoText=(TextView)findViewById(R.id.resultadoTextView);
        resultadoText.setText(resultadoText.getText()+"5");
    }
    public void button6 (View view){
        resultadoText=(TextView)findViewById(R.id.resultadoTextView);
        resultadoText.setText(resultadoText.getText()+"6");
    }
    public void button7 (View view){
        resultadoText=(TextView)findViewById(R.id.resultadoTextView);
        resultadoText.setText(resultadoText.getText()+"7");
    }
    public void button8 (View view){
        resultadoText=(TextView)findViewById(R.id.resultadoTextView);
        resultadoText.setText(resultadoText.getText()+"8");
    }
    public void button9 (View view){
        resultadoText=(TextView)findViewById(R.id.resultadoTextView);
        resultadoText.setText(resultadoText.getText()+"9");
    }
    public void buttonPoint (View view){
        resultadoText=(TextView)findViewById(R.id.resultadoTextView);
        resultadoText.setText(resultadoText.getText()+".");
    }

    public void onClickOperatorCapturaNum1 (View view){

        resultadoText=(TextView)findViewById(R.id.resultadoTextView);
        n1=Double.parseDouble(resultadoText.getText().toString());
        resultadoText.setText("");

    }

    public void buttonSum (View view){
        operador="+";
        onClickOperatorCapturaNum1(view);
    }

    public void buttonRes (View view){
        operador="-";
        onClickOperatorCapturaNum1(view);
    }

    public void buttonMul (View view){
        operador="x";
        onClickOperatorCapturaNum1(view);
    }

    public void buttonDiv (View view){
        operador="/";
        onClickOperatorCapturaNum1(view);
    }
    public void swRadClicked(View v){
        Switch DegSwitch = (Switch)findViewById(R.id.grados);
        DegSwitch.setChecked(false);
    }
    public void swDegClicked(View v){
        Switch RadSwitch = (Switch)findViewById(R.id.grados);
        RadSwitch.setChecked(false);
    }

    public void buttonSen (View view){

        resultadoText=(TextView)findViewById(R.id.resultadoTextView);


        if (RadSwitch.isChecked()){

            try {
                n1=Double.parseDouble(resultadoText.getText().toString());
                double rd = n1;
                res=sin(rd);
                resultadoText.setText(String.valueOf(res));
            }
            catch (NumberFormatException nfe){


            }

        }
        else{

            try {
                n1=Double.parseDouble(resultadoText.getText().toString());
                double rd = Math.toRadians(n1);
                res=Math.sin(rd);
                resultadoText.setText(String.valueOf(res));
            }
            catch (NumberFormatException nfe){


            }
        }

    }


    public void buttonCos (View view){

        if (RadSwitch.isChecked()){

            try {
                n1=Double.parseDouble(resultadoText.getText().toString());
                double rd = n1;
                res=cos(rd);
                resultadoText.setText(String.valueOf(res));
            }
            catch (NumberFormatException nfe){


            }

        }
        else{

            try {
                n1=Double.parseDouble(resultadoText.getText().toString());
                double rd = Math.toRadians(n1);
                res=Math.cos(rd);
                resultadoText.setText(String.valueOf(res));
            }
            catch (NumberFormatException nfe){


            }
        }

    }

    public void buttonTg (View view){

        resultadoText=(TextView)findViewById(R.id.resultadoTextView);

        if (RadSwitch.isChecked()){

            try {
                n1=Double.parseDouble(resultadoText.getText().toString());
                double rd = n1;
                res=sin(rd);
                resultadoText.setText(String.valueOf(res));
            }
            catch (NumberFormatException nfe){


            }

        }
        else{

            try {
                n1=Double.parseDouble(resultadoText.getText().toString());
                double rd = Math.toRadians(n1);
                res=Math.sin(rd);
                resultadoText.setText(String.valueOf(res));
            }
            catch (NumberFormatException nfe){


            }
        }

    }

    public void buttonBorrar (View view){

        if(resultadoText.getText().toString().equals("")){
            resultadoText.setText(resultadoText.getText().subSequence(0,resultadoText.getText().length()-1)+"");
        }
    }

    public void buttonClear (View view){
        n1=0.0;
        n2=0.0;
        resultadoText=(TextView)findViewById(R.id.resultadoTextView);
        resultadoText.setText("");
    }

    public void burronIgual (View view){

        resultadoText=(TextView)findViewById(R.id.resultadoTextView);
        n2=Double.parseDouble(resultadoText.getText().toString());

        if (operador.equals("+")){

            res=n1+n2;

        }
        else if (operador.equals("-")){

            res=n1-n2;

        }
        else if (operador.equals("x")){

            res=n1*n2;

        }
        else if (operador.equals("/")){

            res=n1/n2;

        }

        resultadoText.setText(""+res);



    }
}