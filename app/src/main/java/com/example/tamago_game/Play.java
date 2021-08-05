package com.example.tamago_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Play extends AppCompatActivity {
    private TextView txt_life;
    private ImageView img_egg;
    private Button btn_new_game;
    private int count = 100;
    private Button touch;
    private Button goToMain;
    private Button goToExplain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        txt_life = (TextView) findViewById(R.id.main_text_life);
        img_egg = (ImageView) findViewById(R.id.main_img_egg);
        btn_new_game = (Button) findViewById(R.id.main_btn_newgame);
        touch = findViewById(R.id.touch);
        goToExplain = findViewById(R.id.gotoexplain);
        goToMain = findViewById(R.id.gotomain);

        img_egg.setImageResource(R.drawable.ic_realistic_egg);
        txt_life.setText(count + "");

        img_egg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;

                if (count < 0) {
                    Toast.makeText(getApplicationContext(), "알이 까졌습니다 그만 누르세요", Toast.LENGTH_SHORT).show();
                    count = 0;
                }
                if (count == 80) {
                    img_egg.setImageResource(R.drawable.ic_realistic_egg_1);
                }
                if (count == 50) {
                    img_egg.setImageResource(R.drawable.ic_realistic_egg_2);
                }
                if (count == 10) {
                    img_egg.setImageResource(R.drawable.ic_realistic_egg_3);
                }
                if (count == 0) {
                    img_egg.setImageResource(R.drawable.ic_result);
                }


                txt_life.setText(count + "");
            }
        });

        touch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count != 0){
                    count += 5;

                    if(count >= 100 && count <=104){
                        img_egg.setImageResource(R.drawable.ic_realistic_egg);
                    }
                    if (count >= 80 && count <= 84) {
                        img_egg.setImageResource(R.drawable.ic_realistic_egg_1);
                    }
                    if (count >= 50 && count<= 54) {
                        img_egg.setImageResource(R.drawable.ic_realistic_egg_2);
                    }
                    if (count >= 10&&count<=14) {
                        img_egg.setImageResource(R.drawable.ic_realistic_egg_3);
                    }

                }
                else{
                    Toast.makeText(getApplicationContext(), "부화하여서 쓰다듬을 수 없습니다", Toast.LENGTH_SHORT).show();
                    count = 0;
                }

                txt_life.setText(count + "");
            }
        });

        btn_new_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 100;
                img_egg.setImageResource(R.drawable.ic_realistic_egg);
                txt_life.setText(count + "");
                //리셋
            }
        });
        goToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Play.this,MainActivity.class);
                startActivity(intent);
            }
        });
        goToExplain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Play.this,Explanation.class);
                startActivity(intent);
            }
        });

    }

}