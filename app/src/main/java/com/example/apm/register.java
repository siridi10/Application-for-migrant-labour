package com.example.apm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class register extends AppCompatActivity {
    EditText na1;
    EditText a1;
    EditText p1;
    EditText gen1;
    EditText add1;
    EditText cit1;
    EditText pin1;
    EditText st1;
    Button bt_1;
    DatabaseReference deff;
    Nath nath;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        //Toast.makeText(register.this, "hello connected to firebase", Toast.LENGTH_SHORT).show();
        na1 = (EditText) findViewById(R.id.na1);
        a1 = (EditText) findViewById(R.id.a1);
        gen1 = (EditText) findViewById(R.id.gen1);
        p1 = (EditText) findViewById(R.id.p1);
        add1 = (EditText) findViewById(R.id.add1);
        st1 = (EditText) findViewById(R.id.st1);
        cit1 = (EditText) findViewById(R.id.cit1);
        pin1 = (EditText) findViewById(R.id.pin1);
        bt_1 = (Button) findViewById(R.id.bt_1);
        nath = new Nath();
        deff = FirebaseDatabase.getInstance().getReference().child("Nath");
        bt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int age = Integer.parseInt(a1.getText().toString().trim());
                long phn = Long.parseLong(p1.getText().toString().trim());
                Integer pinc = Integer.parseInt(pin1.getText().toString().trim());

                nath.setName(na1.getText().toString().trim());

                nath.setAddress(add1.getText().toString().trim());
                nath.setAge(age);
                nath.setPh(phn);
                nath.setPin(pinc);
                nath.setCity(cit1.getText().toString().trim());
                nath.setState(st1.getText().toString().trim());
                nath.setGender(gen1.getText().toString().trim());

                deff.push().setValue(nath);
                //Toast.makeText(register.this, "hello connected to firebase", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(register.this,food.class);
                startActivity(intent);
            }
        });
    }
}
