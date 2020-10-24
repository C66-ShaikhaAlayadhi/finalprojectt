package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        ArrayList<Fields> fieldsArrayList = new ArrayList<>();

        Fields F1 = new Fields("ملعب نادي النصر","العارضية شارع محمد ابن القاسم",R.drawable.alardiya,"٩٩٩٧٧٣٣٥","٩ص-٥م");
        Fields F2 = new Fields("ملاعب سبورت زون","العارضية شارع ١٠٣",R.drawable.sport_zone,"","٣م-١ص");
        Fields F3 = new Fields("ملعب حديقة اشبيلية","اشبيلية شارع ١٠٣",R.drawable.ishbilya,"١٨٨٥٠٢٠","٢٤ ساعة");
        Fields F4 = new Fields("ملعب الفروانية","الفروانية قطعة ٤",R.drawable.alfarwaniyah,"٥٠٢٦٢٧١١","٢٤ ساعة");

        fieldsArrayList.add(F1);
        fieldsArrayList.add(F2);
        fieldsArrayList.add(F3);
        fieldsArrayList.add(F4);

        RecyclerView recyclerView = findViewById(R.id.rv);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(lm);

        FieldsAdapter fa = new FieldsAdapter(fieldsArrayList,this);
        recyclerView.setAdapter(fa);
    }
}