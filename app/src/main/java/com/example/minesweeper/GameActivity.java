package com.example.minesweeper;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public abstract class GameActivity extends AppCompatActivity implements View.OnClickListener {
    public String Player;
    private boolean [][] array;
    private Button[][] buttons = new Button[3][3];

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);
        this.Player = getIntent().getExtras().getString("P");
        for(int i = 0; i <6 ; i++){
            for(int j = 0; i <6 ; i++) {
                String button_id = "b_"+i+j;
                int temp_id = getResources().getIdentifier(button_id, "id", getPackageName());
                buttons[i][j] = findViewById(temp_id);
                buttons[i][j].setOnClickListener(this);
                Random rand = new Random();
                array[i][j] = rand.nextBoolean();
            }
        }
    }

    @Override
    public void onClick(View button){
        int temp = button.getId();
        int x,y;
        for(int i = 0; i <6 ; i++){
            for(int j = 0; i <6 ; i++) {
                if(buttons[i][j] == button){
                    x = i;
                    y = j;
                }
            }
        }

    }

}
