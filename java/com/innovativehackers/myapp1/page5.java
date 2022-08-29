package com.innovativehackers.myapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class page5 extends AppCompatActivity {
    Button button;
    private TextView guideText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5);
        Button Prvsbutton = (Button) findViewById(R.id.btn);
        final Button chtbutton = (Button) findViewById(R.id.cht);
        Prvsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page5.this,page2.class);
                startActivity(intent);

            }

        });
        chtbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page5.this,Chatpage.class);
                startActivity(intent);
            }

        });
    }
}