package com.example.finalproject;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ParksAdapter extends RecyclerView.Adapter {

    ArrayList<Parks> list2;
    Context context2;

    public ParksAdapter (ArrayList<Parks> list2, Context context2) {
        this.list2 = list2;
        this.context2 = context2;
    }

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder (@NonNull ViewGroup parent,int viewType){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.parks, parent, false);
            ViewHolder viewHolder = new ViewHolder(view);
            return (viewHolder);
        }

        @Override
        public void onBindViewHolder (@NonNull RecyclerView.ViewHolder holder, final int position){
            ((ParksAdapter.ViewHolder) holder).img.setImageResource(list2.get(position).getImage2());
            ((ParksAdapter.ViewHolder) holder).name.setText(list2.get(position).getName2());
            ((ParksAdapter.ViewHolder) holder).hours.setText(list2.get(position).getHours2());
            ((ParksAdapter.ViewHolder) holder).view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context2, MainActivity11.class);
                    intent.putExtra("parks", list2.get(position));
                    context2.startActivity(intent);
                }
            });
        }

        @Override
        public int getItemCount () {
            return list2.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            public ImageView img;
            public TextView name;
            public TextView hours;
            public View view;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                view = itemView;
                img = itemView.findViewById(R.id.imageView3);
                name = itemView.findViewById(R.id.name3);
                hours = itemView.findViewById(R.id.hours3);
            }
        }
    }
