package com.example.vokamart.MainFamily;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.vokamart.LoginFamily.Login;
import com.example.vokamart.Navbar;
import com.example.vokamart.R;
import com.example.vokamart.Tambah_Variasi;

public class tambah_produk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produk_tambah_produk);

        TextView textView = findViewById(R.id.text_tambah_variasi);




        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(tambah_produk.this, Tambah_Variasi.class);
                startActivity(i);
            }
        });
    }
}
