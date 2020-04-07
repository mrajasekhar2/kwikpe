//package com.sen.go.workflow99;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//public class LoginActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.login);
//
//        Button login = findViewById(R.id.login);
//        login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent in = new Intent(LoginActivity.this,SuccessActivity.class);
//                startActivity(in);
//                finish();
//
//            }
//        });
//    }
//}
