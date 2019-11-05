package com.example.project3.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project3.R;
import com.example.project3.models.FastFood;

import java.util.ArrayList;
import java.util.List;

public class FastFoodAdapter extends RecyclerView.Adapter<FastFoodAdapter.ViewHolder> {
    private List<FastFood> foodList;
    public FastFoodAdapter(List<FastFood> foodList) {
        this.foodList = foodList;
    }
    @NonNull
    @Override
    public FastFoodAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.food_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }
    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull FastFoodAdapter.ViewHolder holder, int position) {
        FastFood fastFood = foodList.get(position);
        holder.imgFood.setImageResource(fastFood.getFoodImage());
        holder.txtName.setText(fastFood.getName());
        holder.txtPrice.setText("$"+ fastFood.getHarga());
    }

    @Override
    public int getItemCount() {
        return (foodList != null)? foodList.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgFood;
        TextView txtName, txtPrice;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFood = itemView.findViewById(R.id.imageFood);
            txtName = itemView.findViewById(R.id.foodName);
            txtPrice = itemView.findViewById(R.id.priceText);
        }
    }
}
