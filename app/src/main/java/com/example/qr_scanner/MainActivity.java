package com.example.qr_scanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static TextView scantext;
    Button scanbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scantext = findViewById(R.id.scantext);
        scanbtn = findViewById(R.id.scanbtn);

        scanbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),sacnnerView.class));
            }
        });

        scantext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = scantext.getText().toString();
                Toast.makeText(MainActivity.this,url, Toast.LENGTH_SHORT).show();
            }
        });

    }
}