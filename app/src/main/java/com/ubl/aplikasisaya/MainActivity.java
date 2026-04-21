package com.ubl.aplikasisaya;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button btnRegister = findViewById(R.id.btn_register);
        EditText txtFullName = findViewById(R.id.txt_fullname);
        EditText txtEmail = findViewById(R.id.txt_email);
        EditText txtAddress = findViewById(R.id.txt_address);
        TextView txtResult = findViewById(R.id.txt_result);

        btnRegister.setOnClickListener(v -> {

            String fullName = txtFullName.getText().toString().trim();
            String email = txtEmail.getText().toString().trim();
            String address = txtAddress.getText().toString().trim();

            if (fullName.isEmpty() || email.isEmpty() || address.isEmpty()) {
                Toast.makeText(MainActivity.this,
                        "All fields are required",
                        Toast.LENGTH_SHORT).show();
            } else {
                String result = "Nama: " + fullName +
                        "\nEmail: " + email +
                        "\nAlamat: " + address;

                txtResult.setText(result);
            }
        });
    }
}