package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView tv_hello;
    Button btn_go;
    int luckyNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_hello = findViewById(R.id.tv_hello);
        btn_go = findViewById(R.id.btn_go);
    }

    public void showLucky(View view){
        Random r = new Random();
        luckyNum = r.nextInt((6)+1) ;
        Log.i("random",Integer.toString(luckyNum));
        btn_go.setEnabled(true);
        tv_hello.setText(Integer.toString(luckyNum));
    }

    public void goNextAct(View view){
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        intent.putExtra("n",luckyNum);
        startActivityForResult(intent,111);
    }
}
