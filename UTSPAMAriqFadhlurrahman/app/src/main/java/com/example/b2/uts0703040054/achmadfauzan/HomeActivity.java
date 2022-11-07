package com.example.b2.uts0703040054.achmadfauzan;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    EditText ednama, ednim, edpemdas, edstruktur, edaplikom, ednilai, edhuruf;
    Button buttonhitung;
    Double vpemdas, vstruktur, vaplikom, vnilai;
    String vnama, vnim, vhuruf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ednama = (EditText)findViewById(R.id.ednama);
        ednim = (EditText)findViewById(R.id.ednim);
        edpemdas = (EditText)findViewById(R.id.edpemdas);
        edstruktur = (EditText)findViewById(R.id.edstruktur);
        edaplikom = (EditText)findViewById(R.id.edaplikom);
        ednilai = (EditText)findViewById(R.id.ednilai);
        edhuruf = (EditText)findViewById(R.id.edhuruf);
        buttonhitung = (Button) findViewById(R.id.buttonhitung);
    }

    public void hitung(View view) {
        vpemdas = Double.parseDouble(edpemdas.getText().toString());
        vstruktur = Double.parseDouble(edstruktur.getText().toString());
        vaplikom = Double.parseDouble(edaplikom.getText().toString());


        vnilai = ((3*vpemdas) + (3*vstruktur) + (3*vaplikom)) / 9;

        if (vnilai >=86 && vnilai <=100){
            vhuruf="A";
        }
        else if (vnilai >=81 && vnilai <=85){
            vhuruf="A-";
        }
        else if (vnilai >=76 && vnilai <=80){
            vhuruf="B+";
        }
        else if (vnilai >=71 && vnilai <=75){
            vhuruf="B";
        }
        else if (vnilai >=66 && vnilai <=70){
            vhuruf="B-";
        }
        else if (vnilai >=61 && vnilai <=65){
            vhuruf="C+";
        }
        else if (vnilai >=56 && vnilai <=60){
            vhuruf="C";
        }
        else if (vnilai >=41 && vnilai <=55){
            vhuruf="D";
        }
        else if (vnilai >=0 && vnilai <=40) {
            vhuruf="E";
        }
        else if (vnilai >100) {
            vhuruf="Nilai Tidak Valid";
        }
        else if (vnilai <0) {
            vhuruf="Nilai Tidak Valid";
        }
        else {
            vhuruf=" ";
        }
        ednilai.setText(" "+vnilai);
        edhuruf.setText(" "+vhuruf);
    }
}