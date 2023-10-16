package com.example.vokamart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class Login extends AppCompatActivity {

    private EditText EditEmail, EditPassword;
    private CardView CardLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditEmail = findViewById(R.id.edit_email);
        EditPassword = findViewById(R.id.Edit_Password);
        CardLogin = findViewById(R.id.Card_Login);

        CardLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Email_akun = EditEmail.getText().toString();
                String Password = EditPassword.getText().toString();

            }

        });
    }

    private boolean authenticateUser(String Email_akun, String Password){
        if (Email_akun.equals(""))
    }
}