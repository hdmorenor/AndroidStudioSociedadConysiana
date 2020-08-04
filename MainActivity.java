package com.example.myapp2calculopromedio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;

    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_matematicas); // Vista (componente)
        et2=  (EditText)findViewById(R.id.txt_fisica); // Vista (componente)
        et3=  (EditText)findViewById(R.id.txt_quimica); // Vista (componente)
        tv1=  (TextView) findViewById(R.id.tv_estatus); // Vista (componente)

    }


    // Este método saca el promedio
    public void estatus(View view){
        String matematicas= et1.getText().toString();
        String fisica= et2.getText().toString();
        String quimica= et3.getText().toString();

        int mate_int=Integer.parseInt(matematicas);
        int fisi_int=Integer.parseInt(fisica);
        int quimica_int=Integer.parseInt(quimica);

        int promedio= (mate_int + fisi_int + quimica_int)/3;

        if(promedio >= 6 ){
            tv1.setText("Estatus aprobado con " + promedio);
        } else {
            tv1.setText("Estatus reprobado con " + promedio);
        }


    }



}