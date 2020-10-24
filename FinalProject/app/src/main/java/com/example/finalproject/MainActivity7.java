package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        ArrayList<Parks> parksArrayList = new ArrayList<>();

        Parks P1 = new Parks("حديقة مشرف","مشرف قطعة ٤ شارع ٥٠",R.drawable.mishref_park,"٨ص-١٠م","٢٢٢٥٣٠٠٠","يوجد");
        Parks P2 = new Parks("حديقة سلوى","سلوى قطعة ١١ شارع ٨",R.drawable.salwa_park,"٥ص-١١م" ,"١٨٨٥٠٢٠","يوجد");
        Parks P3 = new Parks("حديقة غرب مشرف","غرب مشرف قطعة ٢ شارع ٢٠٢",R.drawable.west_mishref,"٢٤ ساعة","","يوجد");
        Parks P4 = new Parks("حديقة السلام","السلام قطة ٢ شارع ٢١٢",R.drawable.al_salam_park,"٢٤ ساعة","","لا يوجد");
        Parks P5 = new Parks("حديقة بيان","بيان قطعة ٧ شارع ١١",R.drawable.bayan_park,"٢٤ ساعة","","يوجد");
        Parks P6 = new Parks("حديقة الجابرية","الجابرية شارع ١٠٥",R.drawable.jabriya_park,"٢٤ ساعة","٥٥٨١٩٣٨٤","يوجد");
        Parks P7 = new Parks("حديقة حولي","حولي شارع تونس",R.drawable.hawally_park,"٨:٣٠ص-٦م","","يوجد");
        Parks P8 = new Parks("حديقة السالمية","السالمية قطعة ١٠",R.drawable.salmiya_park,"٢٤ ساعة","","يوجد");
        Parks P9 = new Parks("حديقة الرميثية","الرميثية شارع ناصر المبارك",R.drawable.rumaithiya_park,"٢٤ ساعة","","يوجد");
        Parks P10 = new Parks("حديقة بوليفارد","السالمية قطعة ٨",R.drawable.boulevard,"٨ص-١٢ص","٢٥٧٦٢٥٠٠","يوجد");

        parksArrayList.add(P1);
        parksArrayList.add(P2);
        parksArrayList.add(P3);
        parksArrayList.add(P4);
        parksArrayList.add(P5);
        parksArrayList.add(P6);
        parksArrayList.add(P7);
        parksArrayList.add(P8);
        parksArrayList.add(P9);
        parksArrayList.add(P10);

        RecyclerView recyclerView = findViewById(R.id.rv_4);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(lm);

        ParksAdapter pa = new ParksAdapter(parksArrayList,this);
        recyclerView.setAdapter(pa);
    }
}