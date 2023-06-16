package com.example.deltatask_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String clue,word;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button gamebtn = findViewById(R.id.gamebtn);
        EditText editword = findViewById(R.id.editTextText);
        EditText editclue = findViewById(R.id.editTextText2);

        gamebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                word = editword.getText().toString();
                clue = editclue.getText().toString();
                if (word.length() == 0 || clue.length() == 0)
                    Toast.makeText(MainActivity.this, "Please enter word and clue", Toast.LENGTH_SHORT).show();
                else {
                    Intent i = new Intent(MainActivity.this, MainActivity2.class);
                    i.putExtra("str1", word);
                    i.putExtra("str2", clue);
                    startActivity(i);
                }
                ;
            }

        });
    }




}