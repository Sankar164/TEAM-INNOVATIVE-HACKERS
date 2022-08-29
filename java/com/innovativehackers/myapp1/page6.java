package com.innovativehackers.myapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class page6 extends AppCompatActivity {
    private Button backButton;
    private TextView guideText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page6);
        backButton = findViewById(R.id.backButton);
        guideText = findViewById(R.id.guideText);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page6.this,page2.class);
                startActivity(intent);
                finish();
            }
        });
    }
}