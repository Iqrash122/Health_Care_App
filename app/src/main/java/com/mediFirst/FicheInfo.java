package com.mediFirst;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.mediFirst.R;

public class FicheInfo extends AppCompatActivity {
    TextView t1 ,t2, t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiche_info);
        t1=findViewById(R.id.textView2);
        t2=findViewById(R.id.textView4);
        t3=findViewById(R.id.textView5);

        t1.setText("Date of creation = "+getIntent().getStringExtra("dateCreated"));
        t2.setText("Doctor = "+getIntent().getStringExtra("doctor"));
        t3.setText("Description of Disease = "+getIntent().getStringExtra("description"));
    }
}
