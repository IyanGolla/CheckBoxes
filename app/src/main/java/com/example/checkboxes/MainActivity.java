package com.example.checkboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox Outside,Fortnite,Minecraft;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Outside = (CheckBox) findViewById(R.id.checkBox);
        Minecraft = (CheckBox) findViewById(R.id.checkBox2);
        Fortnite = (CheckBox) findViewById(R.id.checkBox3);
        btn  = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = "The games that I play are";
                if(Outside.isChecked()){
                    str+= " Outside";
                }
                if(Minecraft.isChecked()){
                    str+= " Minecraft";
                }
                if(Fortnite.isChecked()){
                    str+= " Fortnite";
                }
                Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();

            }
        });
    }
}