package com.example.dear_dream.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dear_dream.object.Item;
import com.example.dear_dream.R;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{
    private  ArrayList<Item> judulItem;

    public Adapter(ArrayList<Item> judulItem) {
        this.judulItem = judulItem;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView judulTv;

        public ViewHolder(View itemView){
            super(itemView);

            judulTv = itemView.findViewById(R.id.judul);
        }

        public void bind(Item item)
        {
            judulTv.setText(item.getjudul());
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Item item = judulItem.get(position);

        holder.bind(item);
    }

    @Override
    public int getItemCount() {
        return judulItem.size();
    }
}
