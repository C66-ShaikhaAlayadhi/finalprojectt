package com.example.finalproject;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    CarouselView carouselView;
    int[] sampleImages = {R.drawable.al_shaheed, R.drawable.arena, R.drawable.rumaithiya_park, R.drawable.fintas, R.drawable.v};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button X = findViewById(R.id.button);

        X.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(MainActivity.this , v);
                popup.setOnMenuItemClickListener(MainActivity.this);
                popup.inflate(R.menu.governorates_menu);
                popup.show();
            }
        });

        Button Y = findViewById(R.id.button2);

        Y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup2 = new PopupMenu(MainActivity.this , v);
                popup2.setOnMenuItemClickListener(MainActivity.this);
                popup2.inflate(R.menu.governorates2_menu);
                popup2.show();
            }
        });

        carouselView = findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);

    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.A) {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.B) {
            Intent intent_2 = new Intent(MainActivity.this, MainActivity4.class);
            startActivity(intent_2);
        } else if (id == R.id.C) {
            Intent intent_3 = new Intent(MainActivity.this, MainActivity5.class);
            startActivity(intent_3);
        } else if (id == R.id.a) {
            Intent intent_5 = new Intent(MainActivity.this, MainActivity7.class);
            startActivity(intent_5);
        } else if (id == R.id.b) {
            Intent intent_6 = new Intent(MainActivity.this, MainActivity8.class);
            startActivity(intent_6);
        }else if (id == R.id.c) {
            Intent intent_7 = new Intent(MainActivity.this, MainActivity9.class);
            startActivity(intent_7);
        }else if (id == R.id.d) {
            Intent intent_8 = new Intent(MainActivity.this, MainActivity10.class);
            startActivity(intent_8);
        }else {
            Intent intent_4 = new Intent(MainActivity.this, MainActivity6.class);
            startActivity(intent_4);
        } return false;
    }

}
