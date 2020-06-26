package com.example.apm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class job extends AppCompatActivity {
    EditText ja1,ja2,jg1,jp1,jst1,jcit1,jpin1,jdes1,jbew1;
    TextView textView3;
    Button jbt_1;
    DatabaseReference seff;
    OFFER offer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job);
        ja1 = (EditText) findViewById(R.id.ja1);
        ja2 = (EditText) findViewById(R.id.ja2);
        jg1 = (EditText) findViewById(R.id.jg1);
        jp1 = (EditText) findViewById(R.id.jp1);
        jst1 = (EditText) findViewById(R.id.jst1);
        jcit1 = (EditText) findViewById(R.id.jcit1);
        jpin1 = (EditText) findViewById(R.id.jpin1);
        jdes1 = (EditText) findViewById(R.id.jdes1);
        jbew1=(EditText)findViewById(R.id.jbew1);
        jbt_1 = (Button) findViewById(R.id.jbt_1);
        textView3=(TextView)findViewById(R.id.textView3);
        offer = new OFFER();
        seff = FirebaseDatabase.getInstance().getReference().child("OFFER");


        jbt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int age = Integer.parseInt(ja2.getText().toString().trim());
                long phn = Long.parseLong(jp1.getText().toString().trim());
                Integer pinc = Integer.parseInt(jpin1.getText().toString().trim());

                offer.setName(ja1.getText().toString().trim());
                offer.setAge(age);
                offer.setPh(phn);
                offer.setPin(pinc);
                offer.setCity(jcit1.getText().toString().trim());
                offer.setState(jst1.getText().toString().trim());
                offer.setGender(jg1.getText().toString().trim());
                offer.setDesignation(jdes1.getText().toString().trim());
                offer.setBeforework(jbew1.getText().toString().trim());
                if (check_age()==1) {
                    seff.push().setValue(offer);
                    Intent intent = new Intent(job.this, jobinfo.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText( getApplicationContext(),"Age below 18 is considerd as Minor .We are strict against Child labour",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
    public  int check_age( )
    {
        int age = Integer.parseInt(ja2.getText().toString().trim());
        if (age>=18)
            return 1;
        else
            return 0;
    }
}
