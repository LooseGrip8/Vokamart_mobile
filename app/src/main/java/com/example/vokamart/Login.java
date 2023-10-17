package com.example.vokamart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
                String Email_akun = EditEmail.getText().toString().trim();
                String Password = EditPassword.getText().toString().trim();

                if (Email_akun.isEmpty() || Password.isEmpty()) {
                    Toast.makeText(Login.this, "Harap isi semua kolom!", Toast.LENGTH_SHORT).show();
                } else {

                }

            }

        });
    }

    private boolean performLogin(String Email_akun, String Password) {
        String dbURL = "jdbc:mysql://your_mysql_server:port/vokamart";
        String dbUser = "";
        String dbPassword = "";

        try {
            Connection connection = DriverManager.getConnection(dbURL, dbUser, dbPassword);
            String query = "SELECT FROM users WHERE Email_akun = ? AND Password";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next()) {
                connection.close();
                return true;
            } else {
                connection.close();
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


}