package com.innovativehackers.myapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Chatpage extends AppCompatActivity {
    private EditText chatBox;
    private String chatBoxStr="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatpage);
        chatBox = findViewById(R.id.chatbox);
    }
}