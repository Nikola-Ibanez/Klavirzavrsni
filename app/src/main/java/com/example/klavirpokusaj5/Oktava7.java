package com.example.klavirpokusaj5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Oktava7 extends AppCompatActivity {
    Button c7, d7, e7, f7, g7, a7, b7, c8, d8, e8;
    private int c7z, d7z, e7z, f7z, g7z, a7z, b7z, c8z, d8z, e8z;
    private SoundPool soundPool;

    Button c7b, d7b, f7b, g7b, a7b, c8b, d8b;
    private int c7bz, d7bz, f7bz, g7bz, a7bz, c8bz, d8bz;
    private View view;
    Spinner spinner;
    String[] SPINNERVALUES = {"OK3", "OK4", "OK5", "OK6"};
    String SpinnerValue;
    Intent intent;
    Button GOTO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oktava7);


        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Oktava7.this, android.R.layout.simple_list_item_1, SPINNERVALUES);
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


                    case "OK3":
                        intent = new Intent(Oktava7.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case "OK4":
                        intent = new Intent(Oktava7.this, Oktava4.class);
                        startActivity(intent);
                        break;

                    case "OK5":
                        intent = new Intent(Oktava7.this, Oktava5.class);
                        startActivity(intent);
                        break;
                    case "OK6":
                        intent = new Intent(Oktava7.this, Oktava6.class);
                        startActivity(intent);
                        break;

                }
            }
        });
        c7 = (Button) findViewById(R.id.p1);
        d7 = (Button) findViewById(R.id.p2);
        e7 = (Button) findViewById(R.id.p3);
        f7 = (Button) findViewById(R.id.p4);
        g7 = (Button) findViewById(R.id.p5);
        a7 = (Button) findViewById(R.id.p6);
        b7 = (Button) findViewById(R.id.p7);
        c8 = (Button) findViewById(R.id.p8);
        d8 = (Button) findViewById(R.id.p9);
        e8 = (Button) findViewById(R.id.p10);

        c7b = (Button) findViewById(R.id.b1);
        d7b = (Button) findViewById(R.id.b2);
        f7b = (Button) findViewById(R.id.b3);
        g7b = (Button) findViewById(R.id.b4);
        a7b = (Button) findViewById(R.id.b5);
        c8b = (Button) findViewById(R.id.b6);
        d8b = (Button) findViewById(R.id.b7);


        soundPool = new SoundPool.Builder().setMaxStreams(5).build();
        c7z = soundPool.load(this, R.raw.c7, 1);
        d7z = soundPool.load(this, R.raw.d7, 1);
        e7z = soundPool.load(this, R.raw.e7, 1);
        f7z = soundPool.load(this, R.raw.f7, 1);
        g7z = soundPool.load(this, R.raw.g7, 1);
        a7z = soundPool.load(this, R.raw.a7, 1);
        b7z = soundPool.load(this, R.raw.b7, 1);
        c8z = soundPool.load(this, R.raw.c8, 1);
        d8z = soundPool.load(this, R.raw.d8, 1);
        e8z = soundPool.load(this, R.raw.e8, 1);


        c7bz = soundPool.load(this, R.raw.c7b, 1);
        d7bz = soundPool.load(this, R.raw.d7b, 1);
        f7bz = soundPool.load(this, R.raw.f7b, 1);
        g7bz = soundPool.load(this, R.raw.g7b, 1);
        a7bz = soundPool.load(this, R.raw.a7b, 1);
        c8bz = soundPool.load(this, R.raw.c8b, 1);
        d8bz = soundPool.load(this, R.raw.d8b, 1);


        c7.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(c7z, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(c7z);
                        break;
                }
                return false;
            }
        });

        d7.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(d7z, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(d7z);
                        break;
                }
                return false;
            }

        });
        e7.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(e7z, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(e7z);
                        break;
                }
                return false;
            }


        });
        f7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(f7z, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(f7z);
                        break;
                }
                return false;
            }

        });
        g7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(g7z, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(g7z);
                        break;
                }
                return false;
            }

        });
        a7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(a7z, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(a7z);
                        break;
                }
                return false;
            }
        });
        b7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(b7z, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(b7z);
                        break;
                }
                return false;
            }
        });
        c8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(c8z, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(c8z);
                        break;
                }
                return false;
            }
        });
        d8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(d8z, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(d8z);
                        break;
                }
                return false;
            }
        });
        e8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(e8z, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(e8z);
                        break;
                }
                return false;
            }
        });

        c7b.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(c7bz, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(c7bz);
                        break;
                }
                return false;
            }
        });
        d7b.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(d7bz, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(d7bz);
                        break;
                }
                return false;
            }
        });
        f7b.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(f7bz, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(f7bz);
                        break;
                }
                return false;
            }
        });
        g7b.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(g7bz, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(g7bz);
                        break;
                }
                return false;
            }
        });
        a7b.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(a7bz, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(a7bz);
                        break;
                }
                return false;
            }
        });
        c8b.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(c8bz, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(c8bz);
                        break;
                }
                return false;
            }
        });
        d8b.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(d8bz, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(d8bz);
                        break;
                }
                return false;
            }
        });

    }
}