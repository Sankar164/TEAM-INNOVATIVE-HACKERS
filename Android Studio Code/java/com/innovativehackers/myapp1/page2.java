package com.innovativehackers.myapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class page2 extends AppCompatActivity {
    Button button;
    private TextView guideText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);
        Button guideButton = (Button) findViewById(R.id.guideLines);
        final Button nextbutton = (Button) findViewById(R.id.next);
        guideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page2.this,page6.class);
                startActivity(intent);

            }

        });
        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page2.this,page5.class);
                startActivity(intent);
            }

        });
    }

}