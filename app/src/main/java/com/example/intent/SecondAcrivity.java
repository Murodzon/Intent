package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondAcrivity extends AppCompatActivity {
    TextView sName,names,patronymc,age;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_acrivity);
        sName=findViewById(R.id.Murat);
        names=findViewById(R.id.Mura1t);
        patronymc=findViewById(R.id.Mura2t);
        age=findViewById(R.id.Mura3t);
        btn=findViewById(R.id.Mura4t);

        Intent intent = getIntent();
        String Mura=intent.getStringExtra("s");
        String Mura1=intent.getStringExtra("n");
        String Mura2=intent.getStringExtra("p");
        String Mura3=intent.getStringExtra("a");

        sName.setText(Mura);
        names.setText(Mura1);
        patronymc.setText(Mura2);
        age.setText(Mura3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}