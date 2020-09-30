package com.example.dear_dream;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.viewHolder>{
    private  ArrayList<judulItem> mjudulItem;

    public static class viewHolder extends RecyclerView.ViewHolder{

        public TextView Teksview;

        public viewHolder(View itemView){
            super(itemView);
            Teksview = itemView.findViewById(R.id.judul);
        }
    }

    public Adapter(ArrayList<judulItem> judulItems){
        mjudulItem = judulItems;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.diary_item,parent,false);
        viewHolder evh =new viewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        judulItem currentItem = mjudulItem.get(position);

        holder.Teksview.setText(currentItem.getjudul());
    }

    @Override
    public int getItemCount() {
        return mjudulItem.size();
    }
}
