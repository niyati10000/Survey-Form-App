package com.example.survayform;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,t6;
    Button b1,b2;
    RadioButton r1,r2;
    RadioGroup rg1,rg2,rg3,rg4;

    String s1="";
    String s2="";
    String s3="";
    String s4="";
    String s5="";
    String s6="";
    String s7="";
    String s8="";
    String s9="";
    String s10="";
    String s11="";
    String s12="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.textView);
        t3=findViewById(R.id.textView2);
        t4=findViewById(R.id.textView3);
        t5=findViewById(R.id.textView4);
        t6=findViewById(R.id.textView5);


        r1=findViewById(R.id.radioButton);
        r2=findViewById(R.id.radioButton2);

        rg1=findViewById(R.id.rg1);
        rg2=findViewById(R.id.rg2);
        rg3=findViewById(R.id.rg3);
        rg4=findViewById(R.id.rg4);

        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);

        s1=t1.getText().toString();

        s2=t2.getText().toString();

        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            s3=r1.getText().toString();
            r2.setChecked(false);
            }
        });
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s3=r2.getText().toString();
                r1.setChecked(false);
            }
        });

        s4=t3.getText().toString();

        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(@NonNull RadioGroup group, int checkedId) {
                RadioButton rx =findViewById(checkedId);
                if(checkedId!=-1)
                    s5=rx.getText().toString();

            }
        });
        s6=t4.getText().toString();

        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(@NonNull RadioGroup group, int checkedId) {
                RadioButton rx =findViewById(checkedId);
                if(checkedId!=-1)
                    s7=rx.getText().toString();

            }
        });

        s8=t5.getText().toString();

        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(@NonNull RadioGroup group, int checkedId) {
                RadioButton rx =findViewById(checkedId);
                if(checkedId!=-1)
                    s9=rx.getText().toString();
            }
        });

        s10=t6.getText().toString();

        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(@NonNull RadioGroup group, int checkedId) {
                RadioButton rx = findViewById(checkedId);
                if(checkedId!=-1)
                    s11 = rx.getText().toString();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=t1.getText().toString();
                s2=t2.getText().toString();
                s4=t3.getText().toString();
                s6=t4.getText().toString();
                s8=t5.getText().toString();
                s10=t6.getText().toString();

                s12=s1+" "+s2+" "+s3+" "+s4+" "+s5+" "+s6+" "+s7+" "+s8+" "+s9+" "+ s10+" "+s11;

                Toast.makeText(MainActivity.this, "Thank you for participating this is your result "+s12, Toast.LENGTH_SHORT).show();


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rg1.clearCheck();
                rg2.clearCheck();
                rg3.clearCheck();
                rg4.clearCheck();

                r1.setChecked(false);
                r2.setChecked(false);

                s3 = s5 = s7 = s9 = s11 = "";

                Toast.makeText(MainActivity.this, "form cleared", Toast.LENGTH_SHORT).show();

            }
        });





    }
}