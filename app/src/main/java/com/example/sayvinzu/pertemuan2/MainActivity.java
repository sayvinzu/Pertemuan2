package com.example.sayvinzu.pertemuan2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button BtSet;
    private TextView TxtJln;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtSet = (Button) findViewById(R.id.Bt_set);
        TxtJln = (TextView) findViewById(R.id.text_jalan);

        BtSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(BtSet.getText().equals("SET")){
                    TxtJln.setText(Alamat1());
                    BtSet.setText("RESET");
                }
                else{
                    TxtJln.setText(Alamat2());
                    BtSet.setText("SET");
                }
                
            }
        });
    }

    public String Alamat1 (){
        String hasil = "Jl. Cakalang No. 209 A, Bilmbing";
        return hasil;
    }

    public String Alamat2(){
        String hasil = "Jl. Setia Baru No. 20, Medan Polonia";
        return hasil;
    }

}
