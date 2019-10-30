package com.example.project1.adapters;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project1.R;
import com.example.project1.models.Barang;

import java.util.ArrayList;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
    List<Barang> listBarang = new ArrayList<>();

    public ItemAdapter(List<Barang> listBarang) {
        this.listBarang = listBarang;
    }

    @NonNull
    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View barangView = layoutInflater.inflate(R.layout.item_view,parent,false);
        ViewHolder viewHolder = new ViewHolder(barangView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ViewHolder holder, int position) {
        Barang barang = listBarang.get(position);
        holder.namaView.setText(barang.getNama());
        holder.hargaView.setText(String.valueOf(barang.getHarga()));
        holder.gambar.setImageResource(barang.getGambar());
    }

    @Override
    public int getItemCount() {
        return (listBarang != null) ? listBarang.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView namaView, hargaView;
        public ImageView gambar;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            namaView = itemView.findViewById(R.id.textNama);
            hargaView = itemView.findViewById(R.id.textHarga);
            gambar = itemView.findViewById(R.id.imageBarang);
        }
    }
}
