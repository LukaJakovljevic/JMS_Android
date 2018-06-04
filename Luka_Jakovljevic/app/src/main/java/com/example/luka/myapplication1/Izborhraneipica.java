package com.example.luka.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Izborhraneipica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_izborhraneipica);





        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uzmipodatke();
            }
        });


    }
 public void uzmipodatke(){
     Intent intent = new Intent(this, Porudzbina.class);
     RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
     int radioid = radioGroup.getCheckedRadioButtonId();
     RadioButton radioButton;
     radioButton = findViewById(radioid);

     intent.putExtra("Radiobuttonizbor", radioButton.getText().toString());

     CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkBox);
     CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
     CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
     CheckBox checkBox4 = (CheckBox) findViewById(R.id.checkBox4);

     EditText dodkom = (EditText) findViewById(R.id.editText2);

     intent.putExtra("Dodatnikom", dodkom.getText().toString());

     if (checkBox1.isChecked()) {
         intent.putExtra("Checkbox1", checkBox1.getText().toString());
     }
     if (checkBox2.isChecked()) {
         intent.putExtra("Checkbox2", checkBox2.getText().toString());
     }
     if (checkBox3.isChecked()) {
         intent.putExtra("Checkbox3", checkBox3.getText().toString());
     }
     if (checkBox4.isChecked()) {
         intent.putExtra("Checkbox4", checkBox4.getText().toString());
     }
     startActivity(intent);

 }

}
