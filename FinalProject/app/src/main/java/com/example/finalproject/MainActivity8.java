package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        ArrayList<Parks> parksArrayList = new ArrayList<>();

        Parks P1 = new Parks("حديقة العقيلة","العقيلة شارع ٢١٠",R.drawable.egaila_park,"٢٤ ساعة","٢٣٨١٢٢٢٢","يوجد");
        Parks P2 = new Parks("حديقة الفنطاس","الفنطاس شارع ١٤",R.drawable.fintas_park,"٢٤ ساعة" ,"١٨٨٥٠٢٠","يوجد");
        Parks P3 = new Parks("حديقة العدان","العدان شارع ٨٥",R.drawable.al_adan_park,"٢٤ ساعة","١٨٨٥٠٢٠","يوجد");
        Parks P4 = new Parks("حديقة حديقة العدان قطعة ٨","العدان قطعة ٨ شارع ٢٣",R.drawable.block_8,"٢٤ ساعة","","يوجد");
        Parks P5 = new Parks("حديقة صباح السالم","صباح السالم قطعة ١",R.drawable.subah_alsalem,"٢٤ ساعة","","يوجد");
        Parks P6 = new Parks("حديقة صباح السالم قطعة ٨","صباح السالم قطعة ٨ الشارع الاول",R.drawable.subah_al_salem_8,"٢٤ ساعة","","يوجد");
        Parks P7 = new Parks("حديقة القرين ","القرين قطعة ٣ شارع ٧",R.drawable.al_qurain,"٢٤ ساعة","","يوجد");
        Parks P8 = new Parks("حديقة القرين قطعة ٣","القرين قطعة ٣",R.drawable.uv3,"٢٤ ساعة","","يوجد");

        parksArrayList.add(P1);
        parksArrayList.add(P2);
        parksArrayList.add(P3);
        parksArrayList.add(P4);
        parksArrayList.add(P5);
        parksArrayList.add(P6);
        parksArrayList.add(P7);
        parksArrayList.add(P8);

        RecyclerView recyclerView = findViewById(R.id.rv5);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(lm);

        ParksAdapter pa = new ParksAdapter(parksArrayList,this);
        recyclerView.setAdapter(pa);
    }
}