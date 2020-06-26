package com.example.apm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.SearchRecentSuggestionsProvider;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class helpline extends AppCompatActivity {
    private static final int REQUEST_CALL = 1;
    private TextView t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27, t28;
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25, b26, b27, b28;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpline);



       /* final String state[]={"Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa",
                "Gujarat","Haryana","Himachal Pradesh","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttarakhand","Uttar Pradesh","West Bengal"};
        final String help[] = {"0866-2410978", "9436055743", "6913347770", "104", "104", "104", "104", "8558893911", "104", "104", "104", "0471-2552056", "104", "020-26127394", "3852411668", "108", "102", "7005539653", "9439994859", "104", "0141-2225624", "104",
                "044-29510500", "104", "0381-2315879", "104",
                "18001805145", "1800313444222"}*/


        t1 = findViewById(R.id.t1);
        b1 = findViewById(R.id.b1);
        t2 = findViewById(R.id.t2);
        b2 = findViewById(R.id.b2);
        t3 = findViewById(R.id.t3);
        b3 = findViewById(R.id.b3);
        t4 = findViewById(R.id.t4);
        b4 = findViewById(R.id.b4);
        t5=findViewById(R.id.t5);
        b5=findViewById(R.id.b5);
        t6=findViewById(R.id.t6);
        b6=findViewById(R.id.b6);
        t7=findViewById(R.id.t7);
        b7=findViewById(R.id.b7);
        t8=findViewById(R.id.t8);
        b8=findViewById(R.id.b8);
        t9 = findViewById(R.id.t9);
        b9 = findViewById(R.id.b9);
        t10 = findViewById(R.id.t10);
        b10= findViewById(R.id.b10);
        t11 = findViewById(R.id.t11);
        b11 = findViewById(R.id.b11);
        t12= findViewById(R.id.t12);
        b12 = findViewById(R.id.b12);
        t13=findViewById(R.id.t13);
        b13=findViewById(R.id.b13);
        t14=findViewById(R.id.t14);
        b14=findViewById(R.id.b14);
        t15=findViewById(R.id.t15);
        b15=findViewById(R.id.b15);
        t16=findViewById(R.id.t16);
        b16=findViewById(R.id.b16);
        t17= findViewById(R.id.t17);
        b17 = findViewById(R.id.b17);
        t18=findViewById(R.id.t18);
        b18=findViewById(R.id.b18);
        t19=findViewById(R.id.t19);
        b19=findViewById(R.id.b19);
        t20=findViewById(R.id.t20);
        b20=findViewById(R.id.b20);
        t21=findViewById(R.id.t21);
        b21=findViewById(R.id.b21);
        t22= findViewById(R.id.t22);
        b22 = findViewById(R.id.b22);
        t23=findViewById(R.id.t23);
        b23=findViewById(R.id.b23);
        t24=findViewById(R.id.t24);
        b24=findViewById(R.id.b24);
        t25=findViewById(R.id.t25);
        b25=findViewById(R.id.b25);
        t26=findViewById(R.id.t26);
        b26=findViewById(R.id.b26);
        t27=findViewById(R.id.t27);
        b27=findViewById(R.id.b27);
        t28=findViewById(R.id.t28);
        b28=findViewById(R.id.b28);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callButton1();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callButton2();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callButton3();
            }
        }); b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callButton4();
            }
        }); b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callButton5();
            }
        }); b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callButton6();
            }
        }); b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callButton7();
            }
        }); b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callButton8();
            }
        }); b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callButton9();
            }
        }); b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callButton10();
            }
        }); b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callButton11();
            }
        }); b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callButton12();
            }
        }); b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callButton13();
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callButton14();
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callButton15();
            }
        });b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callButton16();
            }
        });b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callButton17();
            }
        });b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callButton18();
            }
        });b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callButton19();
            }
        });b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callButton20();
            }
        });b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callButton21();
            }
        });b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callButton22();
            }
        });b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callButton23();
            }
        });b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callButton24();
            }
        });b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callButton25();
            }
        });b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callButton26();
            }
        });b27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callButton27();
            }
        });b28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callButton28();
            }
        });
}


    private void callButton1() {
        String number = t1.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(helpline.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(helpline.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }

        }
    }

    private void callButton2() {
        String number = t2.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(helpline.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(helpline.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }

        }
    }
    private void callButton3() {
        String number = t3.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(helpline.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(helpline.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                } else {
                    String dial = "tel:" + number;
                    startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                }
            }
        }
        private void callButton4() {
        String number = t4.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(helpline.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(helpline.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }
    private void callButton5() {
        String number = t5.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(helpline.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(helpline.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }
    private void callButton6() {
        String number = t6.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(helpline.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(helpline.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }
    private void callButton7() {
        String number = t7.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(helpline.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(helpline.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }
    private void callButton8() {
        String number = t8.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(helpline.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(helpline.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }
    private void callButton9() {
        String number = t9.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(helpline.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(helpline.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }
    private void callButton10() {
        String number = t10.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(helpline.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(helpline.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }
    private void callButton11() {
        String number = t11.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(helpline.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(helpline.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }
    private void callButton12() {
        String number = t12.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(helpline.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(helpline.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }
    private void callButton13() {
        String number = t13.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(helpline.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) { ActivityCompat.requestPermissions(helpline.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            }
            else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }
    private void callButton14() {
        String number = t14.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(helpline.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(helpline.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }
    private void callButton15() {
        String number = t15.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(helpline.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(helpline.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial))); }
        }
    }
    private void callButton16() {
        String number = t16.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(helpline.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(helpline.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }
    private void callButton17() {
        String number = t17.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(helpline.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(helpline.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }

        }
    }
    private void callButton18() {
        String number = t18.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(helpline.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(helpline.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }

        }
    }
    private void callButton19() {
        String number = t19.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(helpline.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(helpline.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }

        }
    }
    private void callButton20() {
        String number = t20.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(helpline.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(helpline.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }

        }
    }
    private void callButton21() {
        String number = t21.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(helpline.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(helpline.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }

        }
    }
    private void callButton22() {
        String number = t22.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(helpline.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(helpline.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }

        }
    }
    private void callButton23() {
        String number = t23.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(helpline.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(helpline.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }

        }
    }
    private void callButton24() {
        String number = t24.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(helpline.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(helpline.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }

        }
    }
    private void callButton25() {
        String number = t25.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(helpline.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(helpline.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }

        }
    }
    private void callButton26() {
        String number = t26.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(helpline.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(helpline.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }

        }
    }
    private void callButton27() {
        String number = t27.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(helpline.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(helpline.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }

        }
    }
    private void callButton28() {
        String number = t28.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(helpline.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(helpline.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }

        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == REQUEST_CALL) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                callButton1();
                callButton2();
                callButton3();
                callButton4();
                callButton5();
                callButton6();
                callButton7();
                callButton8();
                callButton9();
                callButton10();
                callButton11();
                callButton12();
                callButton13();
                callButton14();
                callButton15();
                callButton16();
                callButton17();
                callButton18();
                callButton19();
                callButton20();
                callButton21();
                callButton22();
                callButton23();
                callButton24();
                callButton25();
                callButton26();
                callButton27();
                callButton28();
            } else {
                Toast.makeText(this, "permission DENIED ", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
