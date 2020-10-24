package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        ArrayList<Parks> parksArrayList = new ArrayList<>();

        Parks P1 = new Parks("حديقة الصداقة و السلام","شويخ السكنية شارع جمال عبد الناصر",R.drawable.v,"٢٤ ساعة","","يوجد");
        Parks P2 = new Parks("حديقة الشهيد","مدينة الكويت شارع السور",R.drawable.al_shaheed,"٥ص-١٢ص" ,"٢٢٤٦١٢٦٧","لا يوجد");
        Parks P3 = new Parks("حديقة المنصورية","المنصورية قطعة ٢",R.drawable.mansouriya,"٢٤ ساعة","","يوجد");
        Parks P4 = new Parks("حديقة عبد الله السالم","عبد الله السالم شارع يوسف القاضي",R.drawable.abdullah_al_salem,"٢٤ ساعة","٢٢٥١٩٦٤٢","يوجد");
        Parks P5 = new Parks("حديقة وهران","الشامية شارع ٢٠",R.drawable.wahran,"٢٤ ساعة","","يوجد");
        Parks P6 = new Parks(" حديقة ميسلون","الشامية قطعة ٦ شارع ٥٩",R.drawable.uv4,"٢٤ ساعة","","يوجد");
        Parks P7 = new Parks("حديقة جمال عبد الناصر","الروضة قطعة ٥ شارع دمشق",R.drawable.jamal_abdulnasser,"٢٤ ساعة","","يوجد");
        Parks P8 = new Parks("حديقة الابراج","العديلية قطعة ٤",R.drawable.abraj,"٢٤ ساعة","","يوجد");


        parksArrayList.add(P1);
        parksArrayList.add(P2);
        parksArrayList.add(P3);
        parksArrayList.add(P4);
        parksArrayList.add(P5);
        parksArrayList.add(P6);
        parksArrayList.add(P7);
        parksArrayList.add(P8);

        RecyclerView recyclerView = findViewById(R.id.rv7);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(lm);

        ParksAdapter pa = new ParksAdapter(parksArrayList,this);
        recyclerView.setAdapter(pa);
    }
}