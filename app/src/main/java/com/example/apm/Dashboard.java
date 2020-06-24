package com.example.apm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.net.URL;
import java.util.Arrays;

public class Dashboard extends AppCompatActivity {
    ListView l1;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        l1 = (ListView) findViewById(R.id.l1);
        //textView=(TextView)findViewById(R.id.textView);
        final String values[] = {"Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa",
                "Gujarat", "Haryana", "Himachal Pradesh", "Jammu & Kashmir", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra",
                "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu",
                "Telangana", "Tripura", "Uttarakhand", "Uttar Pradesh", "West Bengal"};
        //list  view cannot add directly
        ArrayAdapter arrayAdapter=new ArrayAdapter (this,android.R.layout.simple_list_item_1,Arrays.asList(values));
        l1.setAdapter(arrayAdapter);
        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview = values[position].toString();
                Intent intent = new Intent(Intent.ACTION_VIEW);
                if (position==0) {
                    intent.setData(Uri.parse("https://www.spandana.ap.gov.in/"));
                    startActivity(intent);
                //intent.putExtra("Listviewclickvalue", Templistview);
                //Toast.makeText(getApplicationContext(),"You selected:"+values[position],Toast.LENGTH_LONG).show();
                }
                else if (position==1){
                    intent.setData(Uri.parse("http://covid19.itanagarsmartcity.in/scr/register/index.php"));
                    startActivity(intent);
                }
                else if (position==2){
                    intent.setData(Uri.parse("https://nhm.assam.gov.in/portlet-innerpage/covid-19-asha"));
                    startActivity(intent);
                }
                else if (position==3){
                    intent.setData(Uri.parse("http://shramsadhan.bih.nic.in/"));
                    startActivity(intent);
                }
                else if (position==4){
                    intent.setData(Uri.parse("http://cglabour.nic.in/covid19MigrantRegistrationService.aspx"));
                    startActivity(intent);
                }
                else if (position==5){
                    intent.setData(Uri.parse("https://goaonline.gov.in/"));
                    startActivity(intent);
                }
                else if (position==6){
                    intent.setData(Uri.parse("https://www.digitalgujarat.gov.in/"));
                    startActivity(intent);
                }
                else if (position==7){
                    intent.setData(Uri.parse("https://edisha.gov.in/eForms/MigrantService"));
                    startActivity(intent);
                }
                else if (position==8){
                    intent.setData(Uri.parse("http://covid19epass.hp.gov.in/"));
                    startActivity(intent);
                }
                else if (position==9){
                    intent.setData(Uri.parse("https://serviceonline.gov.in"));
                    startActivity(intent);
                }
                else if (position==10){
                    intent.setData(Uri.parse("https://jharkhandpravasi.in"));
                    startActivity(intent);
                }
                else if (position==11){
                    intent.setData(Uri.parse("https://sevasindhu.karnataka.gov.in/Sevasindhu/English"));
                    startActivity(intent);
                }
                else if (position==12){
                    intent.setData(Uri.parse("https://registernorkaroots.org/nrkindia/"));
                    startActivity(intent);
                }
                else if (position==13){
                    intent.setData(Uri.parse("https://mapit.gov.in/covid-19/"));
                    startActivity(intent);
                }
                else if (position==14){
                    intent.setData(Uri.parse("https://covid-19.maharashtra.gov.in"));
                    startActivity(intent);
                }
                else if (position==15){
                    intent.setData(Uri.parse("https://tengbang.in/"));
                    startActivity(intent);
                }
                else if (position==16){
                    intent.setData(Uri.parse("http://meghalayaonline.gov.in/covid/login.htm"));
                    startActivity(intent);
                }
                else if (position==17){
                    intent.setData(Uri.parse("https://mcovid19.mizoram.gov.in/"));
                    startActivity(intent);
                }
                else if (position==18){
                    intent.setData(Uri.parse("https://iamstranded.nagaland.gov.in/"));
                    startActivity(intent);
                }
                else if (position==19){
                    intent.setData(Uri.parse("https://covid19regd.odisha.gov.in/migrant-registration.aspx"));
                    startActivity(intent);
                }
                else if (position==20){
                    intent.setData(Uri.parse("http://covidhelp.punjab.gov.in/PunjabOutRegistration.aspx"));
                    startActivity(intent);
                }
                else if (position==21){
                    intent.setData(Uri.parse("https://emitraapp.rajasthan.gov.in/emitraApps/covid19MigrantRegistrationService"));
                    startActivity(intent);
                }
                else if (position==22){
                    intent.setData(Uri.parse("http://registration.covid19sikkim.org/"));
                    startActivity(intent);
                }
                else if (position==23){
                    intent.setData(Uri.parse("https://rtos.nonresidenttamil.org/"));
                    startActivity(intent);
                }
                else if (position==24){
                    intent.setData(Uri.parse("https://tsp.koopid.ai/epass"));
                    startActivity(intent);
                }
                else if (position==25){
                    intent.setData(Uri.parse("https://covid19.tripura.gov.in/"));
                    startActivity(intent);
                }
                else if (position==26){
                    intent.setData(Uri.parse("http://dsclservices.org.in/movement-outside-uttarakhand.php"));
                    startActivity(intent);
                }
                else if (position==27){
                    intent.setData(Uri.parse("http://jansunwai.up.nic.in/"));
                    startActivity(intent);
                }
                else if (position==28){
                    intent.setData(Uri.parse("https://wb.gov.in"));
                    startActivity(intent);
                }
            };
        });

    }}