package com.example.spotifyproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Kalkulator extends AppCompatActivity {

    TextView judul;
    EditText angka1;
    EditText angka2;
    Spinner opSpinner;
    Button btnKalkulasi;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);
        // connect ke layout
        judul = findViewById(R.id.judul);
        angka1 = findViewById(R.id.angka1);
        angka2 = findViewById(R.id.angka2);
        opSpinner = findViewById(R.id.opSpinner);
        btnKalkulasi = findViewById(R.id.btnKalkulasi);
        txtResult = findViewById(R.id.txtResult);

        System.out.println("Print");
        btnKalkulasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Print");
                // action calculate angka1 & angka2
                int number1 = Integer.parseInt(angka1.getText().toString());
                int number2 = Integer.parseInt(angka2.getText().toString());
                int hasil = 0;
                String text = opSpinner.getSelectedItem().toString();

                switch (text) {
                    case "Tambah":
                        hasil = number1 + number2;
                        txtResult.setText(hasil + "");
                        break;

                    case "Kurang":
                        hasil = number1 - number2;
                        txtResult.setText(hasil + "");
                        break;

                    case "Kali":
                        hasil = number1 * number2;
                        txtResult.setText(hasil + "");
                        break;

                    case "Bagi":
                        double number1double = Double.parseDouble(angka1.getText().toString());
                        double number2double = Double.parseDouble(angka2.getText().toString());
                        double hasilDouble = number1double / number2double;
                        txtResult.setText(hasilDouble + "");
                        break;
                }

            }
        });
    }
}