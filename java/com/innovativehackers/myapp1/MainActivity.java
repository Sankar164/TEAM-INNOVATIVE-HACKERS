package com.innovativehackers.myapp1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public class Mainactivity extends AppCompatActivity {

        TextView question1;
        // Add button Move to Activity

        Button next_Activity_button;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            next_Activity_button = (Button) findViewById(R.id.button);

            // Add_button add clicklistener
            next_Activity_button.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this,page2.class);
                    startActivity(intent);
                }
            });
        }
    }
}