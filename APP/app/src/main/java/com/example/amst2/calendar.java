package com.example.amst2;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.github.sundeepk.compactcalendarview.CompactCalendarView;
import com.github.sundeepk.compactcalendarview.domain.Event;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class calendar extends AppCompatActivity {

    CompactCalendarView compactCalendar;
    private SimpleDateFormat dateFormatMonth = new  SimpleDateFormat("MMMM- yyyy", Locale.getDefault());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        final ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(false);
        actionbar.setTitle(null);

        compactCalendar = (CompactCalendarView) findViewById(R.id.compactcalendar_view);
        compactCalendar.setUseThreeLetterAbbreviation(true);

        //Set an event for Teachers' Professional Day 2016 which is 21st of October

        Event eve1 = new Event(Color.RED, 1572897108000L,"Clase de Tenis");
        compactCalendar.addEvent(eve1);

        compactCalendar.setListener(new CompactCalendarView.CompactCalendarViewListener() {
            @Override
            public void onDayClick(Date dateClicked) {
                Context context = getApplicationContext();

                if (dateClicked.toString().compareTo("Mon Nov 4 19:51:48 AST 2019") == 0 ){
                    Toast.makeText(context, "Clase de Tenis", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(context, "No hay evento planificado", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onMonthScroll(Date firstDayOfNewMonth) {
                actionbar.setTitle(dateFormatMonth.format(firstDayOfNewMonth));
            }
        });
    }
    public void playVideo(View view){
        Intent intent = new Intent(this,videoView.class);
        startActivity(intent);
    }
    public void verMap(View view){
        MainActivity main = new MainActivity();
        if(main.isServiceOk()){
            Intent intent = new Intent(this,myMap.class);
            startActivity(intent);
        }
    }
    public void graficoLineal(View view){
        Intent intent = new Intent(this,LinealGraph.class);
        startActivity(intent);
    }
}