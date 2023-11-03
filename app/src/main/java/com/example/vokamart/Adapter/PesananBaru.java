package com.example.vokamart.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vokamart.Models.Mpesanan_baru;
import com.example.vokamart.R;

import java.util.ArrayList;

public class PesananBaru extends RecyclerView.Adapter<PesananBaru.MyViewHolder>{

    private final ArrayList<Mpesanan_baru> Mpesanan_baru;

    public PesananBaru(ArrayList<Mpesanan_baru> Mpesanan_baru) {
//        ArrayList<com.example.vokamart.Models.Mpesanan_baru> mpesananBaru = null;
        this.Mpesanan_baru = Mpesanan_baru;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_item_pesanan, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Mpesanan_baru pesanan = Mpesanan_baru.get(position);

        holder.nama_produk.setText(pesanan.getNama_produk());
        holder.alamat_lengkap.setText(pesanan.getAlamat_lengkap());
        holder.kurir.setText(pesanan.getKurir());
        holder.harga_produk.setText("Harga: " + pesanan.getHarga_produk());
    }

    @Override
    public int getItemCount() {
        return Mpesanan_baru.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView nama_produk;
        TextView alamat_lengkap;
        TextView kurir;
        TextView harga_produk;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            nama_produk = itemView.findViewById(R.id.nama_Pesanan);
            alamat_lengkap = itemView.findViewById(R.id.alamat_pesanan_lengkap);
            kurir = itemView.findViewById(R.id.jenis_kurir);
            harga_produk = itemView.findViewById(R.id.harga_pesanan);
        }
    }
}