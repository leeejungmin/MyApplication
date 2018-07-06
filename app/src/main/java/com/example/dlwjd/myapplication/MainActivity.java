package com.example.dlwjd.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nameText = (EditText) findViewById(R.id.nameText);
        Button nameButton = (Button) findViewById(R.id.nameButton);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);

        nameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameText.getText().toString();
                Intent intent = new Intent(getApplicationContext(), SubActivity.class);

                ///help new screen appear//
                intent.putExtra("nameText", name);

                startActivity(intent);




            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = nameText.getText().toString();
                Intent intent = new Intent(getApplicationContext(), SubActivity2.class);
                /// Intent intent = new Intent(MainActivity.this, SubActivity2.class);/////
                ///help new screen appear//
                intent.putExtra("nameText", name);

                startActivity(intent);






            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameText.getText().toString();
                Intent intent = new Intent(getApplicationContext(), SubActivity3.class);

                ///help new screen appear//
                intent.putExtra("nameText", name);

                startActivity(intent);




            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameText.getText().toString();
                Intent intent= new Intent(getApplicationContext(), SubActivity4.class);

                ///help new screen appear//
                intent.putExtra("nameText", name);

                startActivity(intent);




            }
        });
    }
    }