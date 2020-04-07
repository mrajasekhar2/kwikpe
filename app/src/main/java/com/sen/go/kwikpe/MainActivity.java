package com.sen.go.kwikpe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sen.go.workflow99.SharedPreferenceUtils;


public class MainActivity extends AppCompatActivity {
    Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String msg= "hai";
        click = findViewById(R.id.click);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = new Intent(MainActivity.this, SharedPreferenceUtils.class);
                startActivity(in);

            }
        });
    }
}
