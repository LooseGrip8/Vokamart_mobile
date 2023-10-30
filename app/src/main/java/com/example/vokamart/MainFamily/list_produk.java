package com.example.vokamart.MainFamily;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.vokamart.Adapter.ProductAdapter;
import com.example.vokamart.Models.produk;
import com.example.vokamart.R;

import java.util.ArrayList;


public class list_produk extends Fragment {
    private ProductAdapter adapter;
    private ArrayList<produk> produkArrayList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Initialize the data if it hasn't been already
        if (produkArrayList == null) {
            addData();
        }

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_main_list_produk, container, false);
        RecyclerView recyclerView = rootView.findViewById(R.id.recycler_list_produk);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);

        // Initialize the adapter if it hasn't been already
        if (adapter == null) {
            adapter = new ProductAdapter(produkArrayList);
        }

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        ImageView imageView = rootView.findViewById(R.id.plus);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), tambah_produk.class);
                startActivity(intent);
            }
        });

        return rootView;
    }



    private void addData() {
        produkArrayList = new ArrayList<>();
        produkArrayList.add(new produk("Donat Kentang", 121821, 12));
        produkArrayList.add(new produk("Motherboard", 1300000, 5));
        produkArrayList.add(new produk("Sepatu la Tetanus", 250000, 8));
        produkArrayList.add(new produk("Donat Kentang", 121821, 12));
        produkArrayList.add(new produk("Motherboard", 1300000, 5));
        produkArrayList.add(new produk("Sepatu la Tetanus", 250000, 8));
        produkArrayList.add(new produk("Donat Kentang", 121821, 12));
        produkArrayList.add(new produk("Motherboard", 1300000, 5));
    }
}
