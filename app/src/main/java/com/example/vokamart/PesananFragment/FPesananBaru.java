package com.example.vokamart.PesananFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vokamart.Adapter.PesananBaru;
import com.example.vokamart.Models.Mpesanan_baru;
import com.example.vokamart.R;

import java.util.ArrayList;


public class FPesananBaru extends Fragment {

    private PesananBaru adapter;
    private ArrayList<Mpesanan_baru> pesananArrayList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        if (pesananArrayList == null) {
            addData();
        }
        View rootView = inflater.inflate(R.layout.fragment_pesanan_baru, container, false);

        RecyclerView recyclerView = rootView.findViewById(R.id.recycler_pesanan);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);

        if (adapter == null) {
            adapter = new PesananBaru(pesananArrayList);
        }


        // Set the adapter and layoutManager for the RecyclerView
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        return rootView;
    }

    private void addData() {
        pesananArrayList = new ArrayList<>();
        pesananArrayList.add(new Mpesanan_baru("Donat Kentang", "Banyuwangi", "JNT INDO",1333));
        pesananArrayList.add(new Mpesanan_baru("Motherboard", "Bali", "Jnt Bali", 10000));
        pesananArrayList.add(new Mpesanan_baru("Sepatu la Tetanus", "aBanas", "asdfdfd", 89999));
        pesananArrayList.add(new Mpesanan_baru("Sepatu la Tetanus", "aBanas", "asdfdfd", 89999));
        pesananArrayList.add(new Mpesanan_baru("Sepatu la Tetanus", "aBanas", "asdfdfd", 89999));
        pesananArrayList.add(new Mpesanan_baru("Sepatu la Tetanus", "aBanas", "asdfdfd", 89999));
        pesananArrayList.add(new Mpesanan_baru("Sepatu la Tetanus", "aBanas", "asdfdfd", 89999));
    }
}