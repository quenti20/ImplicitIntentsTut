package com.example.implicitintentstut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

      Button BTN1,BTN2,BTN3,BTN4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BTN1 = findViewById(R.id.BTN1);
        BTN2 = findViewById(R.id.BTN2);
        BTN3 = findViewById(R.id.BTN3);
        BTN4 = findViewById(R.id.BTN4);

        BTN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                startActivity(intent);
            }
        });

        BTN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9432934677"));
                startActivity(intent);
            }
        });

        BTN3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=15C/1 Kenaram Ganguly Road ,Barisha"));
                  startActivity(intent);
            }
        });

        BTN4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/account/about/"));
                startActivity(intent);
            }
        });


    }
}