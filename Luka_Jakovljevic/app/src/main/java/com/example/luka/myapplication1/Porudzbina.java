package com.example.luka.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Porudzbina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_porudzbina);
        Intent intent = getIntent();

        String ch1 = intent.getStringExtra("Checkbox1");
        String ch2 = intent.getStringExtra("Checkbox2");
        String ch3 = intent.getStringExtra("Checkbox3");
        String ch4 = intent.getStringExtra("Checkbox4");
        String isporuka = intent.getStringExtra("Radiobuttonizbor");
        String dodatnikom = intent.getStringExtra("Dodatnikom");

        TextView textView1 = (TextView) findViewById(R.id.textView6);
        TextView textView2 = (TextView) findViewById(R.id.textView7);
        TextView textView3 = (TextView) findViewById(R.id.textView8);
        TextView textView4 = (TextView) findViewById(R.id.textView9);


        if (dodatnikom != null) {
            textView3.append(" " + dodatnikom);
        } else {
            textView3.append(" / ");
        }


        textView4.append(" "+isporuka);

        int m = 0;
        int n = 0;

        if (ch1 != null) {
            m++;
        }
        if (ch2 != null) {
            m++;
        }
        if (ch3 != null) {
            n++;
        }
        if (ch4 != null) {
            n++;
        }

        if (m==0){
            textView1.append(" Niste odabrali nista za jelo.");
        }
        if (n==0){
            textView2.append(" Niste odabrali nista za pice.");
        }


        if (ch1 != null) {
            m--;
            textView1.append(" " + ch1);
            if (m > 0) {
                textView1.append(", ");
            }

        }
        if (ch2 != null) {
            m--;
            textView1.append(" " + ch2);
            if (m > 0) {
                textView1.append(", ");
            }

        }
        if (ch3 != null) {
            n--;
            textView2.append(" "+ch3);
            if (n > 0) {
                textView2.append(", ");
            }

        }
        if (ch4 != null) {
            m--;
            textView2.append(" "+ch4);
            if (m > 0) {
                textView2.append(", ");
            }

        }


    }
}
