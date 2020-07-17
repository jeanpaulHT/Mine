package com.example.minesweeper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Object Intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected  void GoToGame(String username){
        Intent intent = new Intent(this,GameActivity.class);
        intent.putExtra("P1", username);
        startActivity(intent);
    }

    protected void onTap(View view){
        EditText user_1 = (EditText)findViewById(R.id.username);
        String User1 = user_1.getText().toString();
        GoToGame(User1);
    }
}