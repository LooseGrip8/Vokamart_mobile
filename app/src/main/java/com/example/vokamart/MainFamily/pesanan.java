package com.example.vokamart.MainFamily;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vokamart.R;
import com.example.vokamart.Adapter.ViewPageAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import androidx.viewpager2.widget.ViewPager2;

public class pesanan extends Fragment {

    private TabLayout tabLayout;
    private ViewPager2 viewPager;
    private ViewPageAdapter adapter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_pesanan, container, false);

        tabLayout = view.findViewById(R.id.TabLayoutPesanan);
        viewPager = view.findViewById(R.id.viewPager);

        adapter = new ViewPageAdapter(requireActivity());

        viewPager.setAdapter(adapter);

        new TabLayoutMediator(tabLayout, viewPager, (tab, position) ->  {
            switch (position){
                case 0:
                    tab.setText("Pesanan Baru");
                    break;
                case 1:
                    tab.setText("Perlu Dikirim");
                    break;
                case 2:
                    tab.setText("Dikirim");
                    break;
                case 3:
                    tab.setText("Selesai");
                    break;
                case 4:
                    tab.setText("Dikomplain");
                    break;
            }
        }).attach();

        return view;
    }
}