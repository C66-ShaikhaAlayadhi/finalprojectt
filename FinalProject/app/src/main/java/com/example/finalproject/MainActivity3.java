package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Bundle B = getIntent().getExtras();
        Fields F = (Fields) B.getSerializable("fields");

        ImageView i = findViewById(R.id.imageView2);
        TextView n = findViewById(R.id.textViewN);
        TextView a = findViewById(R.id.textViewA);
        TextView h = findViewById(R.id.textViewH);

        final TextView no = findViewById(R.id.textViewNo);
        final ImageButton Call = findViewById(R.id.call);


        i.setImageResource(F.getImage());
        n.setText(F.getName());
        a.setText("العنوان: "+F.getAddress());
        no.setText("رقم التلفون: "+F.getNumber());
        h.setText("الساعات: "+F.getHours());


        Call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String No = no.getText().toString();
                Uri number = Uri.parse("tel:"+No);
                Intent Z = new Intent(Intent.ACTION_DIAL, number);
                startActivity(Z);
            }
        });

    }
}
