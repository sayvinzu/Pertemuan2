package com.example.sayvinzu.pertemuan2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class kalkulator extends AppCompatActivity {

    private EditText angka1, angka2;
    private TextView hasil;
    private Button Hitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        angka1 = (EditText)findViewById(R.id.ET1);
        angka2 = (EditText)findViewById(R.id.ET2);
        hasil = (TextView)findViewById(R.id.Txt_Hasil);
        Hitung = (Button)findViewById(R.id.Bt_Hasil);

        Hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a, b;
                a = Integer.parseInt(angka1.getText().toString());
                b = Integer.parseInt(angka2.getText().toString());
                hasil.setText(tambah(a,b)+"");
            }
        });
    }

    public int tambah (int a, int b){
        int hasil = a+b;
        return hasil;
    }
}
