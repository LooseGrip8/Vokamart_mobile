package com.example.vokamart.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.vokamart.PesananFragment.Dikirim;
import com.example.vokamart.PesananFragment.Dikomplain;
import com.example.vokamart.PesananFragment.FPesananBaru;
import com.example.vokamart.PesananFragment.PerluDikirim;
import com.example.vokamart.PesananFragment.Selesai;

public class ViewPageAdapter extends FragmentStateAdapter {
    private static final int NUM_TABS = 5;

    public ViewPageAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position) {
            case 0:
                return new FPesananBaru();
            case 1:
                return new PerluDikirim();
            case 2:
                return new Dikirim();
            case 3:
                return new Selesai();
            case 4:
                return new Dikomplain();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return NUM_TABS;
    }
}
