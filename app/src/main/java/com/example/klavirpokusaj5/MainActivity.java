package com.example.klavirpokusaj5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaRecorder;
import android.media.MediaRecorder.AudioEncoder;
import android.media.SoundPool;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {



    Button c3, d3, e3, f3, g3, a3, b3, c4, d4, e4;
    private int c3z, d3z, e3z, f3z, g3z, a3z, b3z, c4z, d4z, e4z;
    private SoundPool soundPool;
    Button c3b, d3b, f3b, g3b, a3b, c4b, d4b;
    private int c3bz, d3bz, f3bz, g3bz, a3bz, c4bz, d4bz;
    private View view;
    Spinner spinner;
    String[] SPINNERVALUES = {"OK4", "OK5", "OK6", "OK7"};
    String SpinnerValue;
    Intent intent;
    Button GOTO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, SPINNERVALUES);
        spinner.setAdapter(adapter);
        GOTO = findViewById(R.id.button1);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

                SpinnerValue = (String) spinner.getSelectedItem();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }
        });
        GOTO.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                switch (SpinnerValue) {


                    case "OK4":
                        intent = new Intent(MainActivity.this, Oktava4.class);
                        startActivity(intent);
                        break;

                    case "OK5":
                        intent = new Intent(MainActivity.this, Oktava5.class);
                        startActivity(intent);
                        break;

                    case "OK6":
                        intent = new Intent(MainActivity.this, Oktava6.class);
                        startActivity(intent);
                        break;
                    case "OK7":
                        intent = new Intent(MainActivity.this, Oktava7.class);
                        startActivity(intent);
                        break;

                }
            }
        });
        c3 = (Button) findViewById(R.id.p1);
        d3 = (Button) findViewById(R.id.p2);
        e3 = (Button) findViewById(R.id.p3);
        f3 = (Button) findViewById(R.id.p4);
        g3 = (Button) findViewById(R.id.p5);
        a3 = (Button) findViewById(R.id.p6);
        b3 = (Button) findViewById(R.id.p7);
        c4 = (Button) findViewById(R.id.p8);
        d4 = (Button) findViewById(R.id.p9);
        e4 = (Button) findViewById(R.id.p10);

        c3b = (Button) findViewById(R.id.b1);
        d3b = (Button) findViewById(R.id.b2);
        f3b = (Button) findViewById(R.id.b3);
        g3b = (Button) findViewById(R.id.b4);
        a3b = (Button) findViewById(R.id.b5);
        c4b = (Button) findViewById(R.id.b6);
        d4b = (Button) findViewById(R.id.b7);



        soundPool = new SoundPool.Builder().setMaxStreams(5).build();
        c3z = soundPool.load(this, R.raw.c3, 1);
        d3z = soundPool.load(this, R.raw.d3, 1);
        e3z = soundPool.load(this, R.raw.e3, 1);
        f3z = soundPool.load(this, R.raw.f3, 1);
        g3z = soundPool.load(this, R.raw.g3, 1);
        a3z = soundPool.load(this, R.raw.a3, 1);
        b3z = soundPool.load(this, R.raw.b3, 1);
        c4z = soundPool.load(this, R.raw.c4, 1);
        d4z = soundPool.load(this, R.raw.d4, 1);
        e4z = soundPool.load(this, R.raw.e4, 1);


        c3bz = soundPool.load(this, R.raw.c3b, 1);
        d3bz = soundPool.load(this, R.raw.d3b, 1);
        f3bz = soundPool.load(this, R.raw.f3b, 1);
        g3bz = soundPool.load(this, R.raw.g3b, 1);
        a3bz = soundPool.load(this, R.raw.a3b, 1);
        c4bz = soundPool.load(this, R.raw.c4b, 1);
        d4bz = soundPool.load(this, R.raw.d4b, 1);


        c3.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(c3z, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(c3z);
                        break;
                }
                return false;
            }
        });

        d3.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(d3z, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(d3z);
                        break;
                }
                return false;
            }

        });
        e3.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(e3z, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(e3z);
                        break;
                }
                return false;
            }


        });
        f3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(f3z, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(f3z);
                        break;
                }
                return false;
            }

        });
        g3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(g3z, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(g3z);
                        break;
                }
                return false;
            }

        });
        a3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(a3z, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(a3z);
                        break;
                }
                return false;
            }
        });
        b3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(b3z, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(b3z);
                        break;
                }
                return false;
            }
        });
        c4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(c4z, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(c4z);
                        break;
                }
                return false;
            }
        });
        d4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(d4z, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(d4z);
                        break;
                }
                return false;
            }
        });
        e4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(e4z, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(e4z);
                        break;
                }
                return false;
            }
        });

        c3b.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(c3bz, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(c3bz);
                        break;
                }
                return false;
            }
        });
        d3b.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(d3bz, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(d3bz);
                        break;
                }
                return false;
            }
        });
        f3b.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(f3bz, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(f3bz);
                        break;
                }
                return false;
            }
        });
        g3b.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(g3bz, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(g3bz);
                        break;
                }
                return false;
            }
        });
        a3b.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(a3bz, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(a3bz);
                        break;
                }
                return false;
            }
        });
        c4b.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(c4bz, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(c4bz);
                        break;
                }
                return false;
            }
        });
        d4b.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(d4bz, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(d4bz);
                        break;
                }
                return false;
            }
        });

    }
}
