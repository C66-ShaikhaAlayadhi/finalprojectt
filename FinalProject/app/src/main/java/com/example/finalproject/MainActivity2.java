package com.example.finalproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ArrayList<Fields> fieldsArrayList = new ArrayList<>();

        Fields F1 = new Fields("مجمع مشرف الرياضي","عبدالعزيز الحمد مجمع مشرف الرياضي",R.drawable.mishref_sports_complex,"٢٥٣٨٩٠٠٠","٩م-٩ص");
        Fields F2 = new Fields("ملعب اليرموك لكرة القدم","مشرف شارع ٥٢",R.drawable.yarmouk,"٢٥٣٨١٠٣٤","٣م-٨م");
        Fields F3 = new Fields("ملعب ممشى مشرف","مشرف شارع عبد العزيز بن الابراهيم السعود",R.drawable.mishref_walkway,"١٨٨٥٠٢٠","٢٤ ساعة");
        Fields F4 = new Fields("ملعب ممشى الواحة","مشرف شارع عبد العزيز بن الابراهيم السعود",R.drawable.alwahah,"","٢٤ ساعة");
        Fields F5 = new Fields("ملعب حديقة مشرف","مشرف قطعة ٤ شارع ٥٠",R.drawable.mishref_park,"٢٢٢٥٣٠٠٠","٨ص-١٠م");
        Fields F6 = new Fields("ملعب بيان","بيان شارع المسجد الاقصى",R.drawable.bayan,"٢٥٣٧٥١٦٧","٤م-٩م");
        Fields F7 = new Fields("ملعب ملتي أرينا","حولي شارع ٣٠٤",R.drawable.multi_arena,"٩٧٦٠٠٣٦٣","٤م-٢ص");
        Fields F8 = new Fields("ملعب الهدف","السالمية شارع حمد زيد الخالد",R.drawable.salmiya,"٩٠٩٢١٥٣٤","٩م-٩ص");
        Fields F9 = new Fields("ملعب الجابرية ق ٥","الجابرية قطعة ٥",R.drawable.jabriya,"٩٩٤٥٥٧٣٥","٤م-١٢ص");

        fieldsArrayList.add(F1);
        fieldsArrayList.add(F2);
        fieldsArrayList.add(F3);
        fieldsArrayList.add(F4);
        fieldsArrayList.add(F5);
        fieldsArrayList.add(F6);
        fieldsArrayList.add(F7);
        fieldsArrayList.add(F8);
        fieldsArrayList.add(F9);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(lm);

        FieldsAdapter fa = new FieldsAdapter(fieldsArrayList,this);
        recyclerView.setAdapter(fa);
    }
}