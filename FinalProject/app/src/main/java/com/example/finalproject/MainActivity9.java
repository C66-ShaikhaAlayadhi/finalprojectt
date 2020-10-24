package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        ArrayList<Parks> parksArrayList = new ArrayList<>();

        Parks P1 = new Parks("حديقة العمرية","العمرية قطعة ٥",R.drawable.omariya_park,"٢٤ ساعة","","يوجد");
        Parks P2 = new Parks("حديقة خيطان","خيطان قطعة ٣",R.drawable.khaitan_park,"٢٤ ساعة" ,"","يوجد");
        Parks P3 = new Parks("حديقة اشبيلية","اشبيلية قطعة ٢ شارع ٣٢٦",R.drawable.ishbilya_park,"٢٤ ساعة","١٨٨٥٠٢٠","يوجد");
        Parks P4 = new Parks("حديقة اشبيلية قطعة ٢","اشبيلية قطعة ١ شارع ١٠",R.drawable.ishbiliya_park_2,"٢٤ ساعة","","لا يوجد");
        Parks P5 = new Parks("حديقة الجليب","جليب الشيوخ قطعة ١ شارع ٥٠",R.drawable.al_jleeb_park,"٢٤ ساعة","","يوجد");
        Parks P6 = new Parks("حديقة الاندلس و الرقعي","الاندلس شارع ١٠١",R.drawable.andalous_park,"٢٤ ساعة","٦٠٤١٧١٥١","يوجد");
        Parks P7 = new Parks("حديقة الفردوس","الفردوس قطعة ٩",R.drawable.uv5,"١٠ص-١٠م","١٨٨٥٠٢٠","لا يوجد");

        parksArrayList.add(P1);
        parksArrayList.add(P2);
        parksArrayList.add(P3);
        parksArrayList.add(P4);
        parksArrayList.add(P5);
        parksArrayList.add(P6);
        parksArrayList.add(P7);

        RecyclerView recyclerView = findViewById(R.id.rv6);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(lm);

        ParksAdapter pa = new ParksAdapter(parksArrayList,this);
        recyclerView.setAdapter(pa);
    }
}