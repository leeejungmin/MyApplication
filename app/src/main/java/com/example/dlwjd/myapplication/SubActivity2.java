package com.example.dlwjd.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import static com.example.dlwjd.myapplication.R.layout.subactivity2;

/**
 * Created by dlwjd on 2017-11-28.
 */

public class SubActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(subactivity2);
        TextView nameText = (TextView) findViewById(R.id.nameText);
        Intent intent = getIntent();
        nameText.setText(intent.getStringExtra("nameText").toString());
    }

    ////@Override
    ///protected void onCreate(Bundle savedInstanceState) {
    ///    super.onCreate(savedInstanceState);
    ///    setContentView(subactivity2);

        ///// deux , ce n'est pas possible???/////
    }
}
