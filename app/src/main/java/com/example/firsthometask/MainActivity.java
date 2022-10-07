package com.example.firsthometask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_card);

        EditText birthDateEditText = findViewById(R.id.birth_date);

        Intent incomingIntent =getIntent();
        String date = incomingIntent.getStringExtra("date");
        birthDateEditText.setText(date);

        birthDateEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PopUpCalendarActivity.class);
                startActivity(intent);

            }
        });

        }
}
