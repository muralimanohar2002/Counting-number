package com.example.googletut;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button msg, in_count, rev, toZero;
    private TextView showText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupView();
    }

    private void setupView(){
        msg = findViewById(R.id.toast);
        in_count = findViewById(R.id.count_inc);
        showText = findViewById(R.id.t_view);
        rev = findViewById(R.id.back);
        toZero = findViewById(R.id.zero);
    }

    int con = 0;
    public  void increase_count(View view){
        con = con+1;
        String y = String.valueOf(con);
        showText.setText(y);
    }

    public void decrease_count(View view){
        con = con-1;
        String y = String.valueOf(con);
        showText.setText(y);
    }

    public void to_zero(View view){
        con = 0;
        String y = String.valueOf(con);
        showText.setText(y);
    }
    public void show_toast(View view){
        Toast.makeText(this,"TAP BUTTONS TO PLAY",Toast.LENGTH_SHORT).show();
    }
}