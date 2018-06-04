package com.example.luka.myapplication1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                otvori_izborhrane();
            }
        });

    }

    public void open_webpage(View v) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tripadvisor.rs/Restaurants-g294472-Belgrade.html"));
        startActivity(browserIntent);
    }

    public void otvori_izborhrane() {
        Intent intent = new Intent(this,Izborhraneipica.class);
        startActivity(intent);
    }
}
