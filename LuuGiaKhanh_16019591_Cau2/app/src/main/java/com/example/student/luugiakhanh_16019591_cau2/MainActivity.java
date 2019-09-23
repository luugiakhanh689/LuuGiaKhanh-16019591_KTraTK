package com.example.student.luugiakhanh_16019591_cau2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etA, etB, etC;
    private TextView tvResult;
    private Button giai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etA = (EditText) findViewById(R.id.etA);
        etB = (EditText) findViewById(R.id.etB);
        etB = (EditText) findViewById(R.id.etB);
        tvResult = (TextView) findViewById(R.id.tvResult);

        giai = (Button) findViewById(R.id.ptb2);
        giai.setOnClickListener(this);
    }
}
