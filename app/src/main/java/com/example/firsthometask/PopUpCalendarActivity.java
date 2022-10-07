package com.example.firsthometask;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.CalendarView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PopUpCalendarActivity extends AppCompatActivity {
    private static final String TAG = "CalendarAvtivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pop_up_calendar);

        CalendarView calendarView = findViewById(R.id.calendar_view);

        calendarView.setOnDateChangeListener((calendarView1, i, i1, i2) -> {
            String date = i2 + "." + (i1 + 1) + "." + i;

            Intent intent = new Intent(PopUpCalendarActivity.this, MainActivity.class);
            intent.putExtra("date", date);
            startActivity(intent);
        });

    }



}
