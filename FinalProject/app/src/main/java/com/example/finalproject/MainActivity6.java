package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        ArrayList<Fields> fieldsArrayList = new ArrayList<>();

        Fields F1 = new Fields("ملاعب كرة قدم كورنر","شرق شارع الخليج العربي",R.drawable.corner_football_field,"٥٠٥٠٠١١١","٩ص-١٠م");
        Fields F2 = new Fields("ملاعب كرة قدم ارينا","بنيد القار شارع ٩٠",R.drawable.arena,"٩٧٧٣٢٩٩٨","١٢م-١٢ص");
        Fields F3 = new Fields("ملعب حسن ابل","الدسمة شارع العنبري",R.drawable.hassan_abul_football_field,"٥١٥٥٠١٦٠","٩ص-١٢ص");
        Fields F4 = new Fields("ملعب سباور","الخالدية شارع علي صالح الفضالة",R.drawable.spower,"٩٧٥٧٠٠٠٤","١٢م-١٢ص");
        Fields F5 = new Fields("ملعب حديقة وهران","الشامية شارع ٢٠",R.drawable.wahran_park,"","٢٤ ساعة");
        Fields F6 = new Fields("ملعب حديقة الصداقة و السلام","شويح السكنية شارع جمال عبد الناصر",R.drawable.uv2,"","٢٤ ساعة");

        fieldsArrayList.add(F1);
        fieldsArrayList.add(F2);
        fieldsArrayList.add(F3);
        fieldsArrayList.add(F4);
        fieldsArrayList.add(F5);
        fieldsArrayList.add(F6);

        RecyclerView recyclerView = findViewById(R.id.rv3);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(lm);

        FieldsAdapter fa = new FieldsAdapter(fieldsArrayList,this);
        recyclerView.setAdapter(fa);
    }
}