package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        ArrayList<Fields> fieldsArrayList = new ArrayList<>();

        Fields F1 = new Fields("ملاعب كرة قدم المسيلة","صباح السالم قطعة ١ شارع ١١٣",R.drawable.subah_alsalem,"٩٩٩٧٧٣٣٥","٩ص-٥م");
        Fields F2 = new Fields("ملاعب الهيئة العامة للرياضة","مبارك الكبير شارع ١٣",R.drawable.uv,"٥١١٠٨١٧٩","٤م-٩م");
        Fields F3 = new Fields("ملعب حديقة القصور","القصور قطعة ٧",R.drawable.alqusour,"","٢٤ ساعة");
        Fields F4 = new Fields("ملعب حديقة العدان","العدان شارع ٨٥",R.drawable.aladan,"١٨٨٥٠٢٠","٢٤ ساعة");
        Fields F5 = new Fields("ملعب حديقة الفنطاس","الفنطاس شارع ١٤",R.drawable.fintas,"١٨٨٥٠٢٠","٢٤ ساعة");


        fieldsArrayList.add(F1);
        fieldsArrayList.add(F2);
        fieldsArrayList.add(F3);
        fieldsArrayList.add(F4);
        fieldsArrayList.add(F5);

        RecyclerView recyclerView = findViewById(R.id.rc);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(lm);

        FieldsAdapter fa = new FieldsAdapter(fieldsArrayList,this);
        recyclerView.setAdapter(fa);
    }
}