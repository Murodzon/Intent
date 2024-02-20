package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText sName,names,patronymc,age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.Mura4);
        sName=findViewById(R.id.Mura);
        names=findViewById(R.id.Mura1);
        patronymc=findViewById(R.id.Mura2);
        age=findViewById(R.id.Mura3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SecondAcrivity.class);
                startActivity(intent);
                String Mura=sName.getText().toString();
                String Mura1= names.getText().toString();
                String Mura2=patronymc.getText().toString();
                String Mura3=age.getText().toString();
                Intent intent1=new Intent(MainActivity.this, SecondAcrivity.class);
                intent1.putExtra("s",Mura);
                intent1.putExtra("n",Mura1);
                intent1.putExtra("p",Mura2);
                intent1.putExtra("a",Mura3);
                startActivity(intent1);
            }
        });


    }
}