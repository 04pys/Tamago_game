package com.example.tamago_game;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView txt_life;
    private ImageView img_egg, img_egg1, img_egg2, img_egg3;
    private Button btn_new_game;
    private int count = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_life = (TextView) findViewById(R.id.main_text_life);
        img_egg = (ImageView) findViewById(R.id.main_img_egg);
        btn_new_game = (Button) findViewById(R.id.main_btn_newgame);

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
                if(count == 80){
                    img_egg.setImageResource(R.drawable.ic_realistic_egg_1);
                }
                if(count == 50){
                    img_egg.setImageResource(R.drawable.ic_realistic_egg_2);
                }
                if(count == 10){
                    img_egg.setImageResource(R.drawable.ic_realistic_egg_3);
                }
                if(count == 0){
                    img_egg.setImageResource(R.drawable.ic_result);
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

    }

}