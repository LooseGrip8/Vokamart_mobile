package com.example.vokamart;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainDashboard extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_dashboard);

        bottomNavigationView = findViewById(R.id.nav_view);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int itemId = item.getItemId();
                Fragment fragment = null;

                if (itemId == R.id.home) {
                    fragment = new home();
                } else if (itemId == R.id.product) {
                    fragment = new produk();
                } else if (itemId == R.id.pesanan) {
                    fragment = new pesanan();
                } else if (itemId == R.id.profil) {
                    fragment = new profil();
                        }
                        getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment_activity_main2,fragment).commit();
                        return true;
                    }
                });
    }
}