package com.example.ipraktinisdarbas;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvMain;
    private boolean isHelloWorld;
    private boolean colorChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = (TextView)findViewById(R.id.tvMain);
        this.isHelloWorld = true;
        this.colorChange = true;

    }

    public void OnBtnClick(View view) {
        if (this.isHelloWorld) {
            this.tvMain.setText(R.string.changed_label_caption);
        }
        else {
            this.tvMain.setText(R.string.label_name);
        }
        this.isHelloWorld = !isHelloWorld;
    }

    public void OnBtnClickAdd(View view) {
        if (this.colorChange) {
            this.tvMain.setTextColor(Color.RED);
        }
        else {
            this.tvMain.setTextColor(Color.GREEN);
        }
        this.colorChange = !colorChange;
    }


}