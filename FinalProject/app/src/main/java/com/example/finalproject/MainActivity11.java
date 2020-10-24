package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class MainActivity11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

            Bundle BU = getIntent().getExtras();
            Parks P = (Parks) BU.getSerializable("parks");

            ImageView i = findViewById(R.id.imageViewP);
            TextView n = findViewById(R.id.textViewNA);
            TextView a = findViewById(R.id.textViewAD);
            TextView h = findViewById(R.id.textViewHO);
            TextView p = findViewById(R.id.textViewP);

            final TextView nu = findViewById(R.id.textView_no);
            final ImageButton Call = findViewById(R.id.call_2);

            i.setImageResource(P.getImage2());
            n.setText(P.getName2());
            a.setText("العنوان: "+P.getAddress2());
            nu.setText("رقم التلفون: "+P.getPhone());
            h.setText("الساعات: "+P.getHours2());
            p.setText("العاب للاطفال: "+P.getPlayground());


            Call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String No = nu.getText().toString();
                    Uri number = Uri.parse("tel:"+No);
                    Intent Z = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(Z);
                }
            });

        }
    }


