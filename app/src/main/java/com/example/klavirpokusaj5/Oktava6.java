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

public class Oktava6 extends AppCompatActivity {
    Button c6, d6, e6, f6, g6, a6, b6, c7, d7, e7;
    private int c6z, d6z, e6z, f6z, g6z, a6z, b6z, c7z, d7z, e7z;
    private SoundPool soundPool;

    Button c6b, d6b, f6b, g6b, a6b, c7b, d7b;
    private int c6bz, d6bz, f6bz, g6bz, a6bz, c7bz, d7bz;
    private View view;
    Spinner spinner;
    String[] SPINNERVALUES = {"OK3", "OK4", "OK5", "OK7"};
    String SpinnerValue;
    Intent intent;
    Button GOTO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oktava6);


        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Oktava6.this, android.R.layout.simple_list_item_1, SPINNERVALUES);
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
                        intent = new Intent(Oktava6.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case "OK4":
                        intent = new Intent(Oktava6.this, Oktava4.class);
                        startActivity(intent);
                        break;

                    case "OK5":
                        intent = new Intent(Oktava6.this, Oktava5.class);
                        startActivity(intent);
                        break;
                    case "OK7":
                        intent = new Intent(Oktava6.this, Oktava7.class);
                        startActivity(intent);
                        break;

                }
            }
        });
        c6 = (Button) findViewById(R.id.p1);
        d6 = (Button) findViewById(R.id.p2);
        e6 = (Button) findViewById(R.id.p3);
        f6 = (Button) findViewById(R.id.p4);
        g6 = (Button) findViewById(R.id.p5);
        a6 = (Button) findViewById(R.id.p6);
        b6 = (Button) findViewById(R.id.p7);
        c7 = (Button) findViewById(R.id.p8);
        d7 = (Button) findViewById(R.id.p9);
        e7 = (Button) findViewById(R.id.p10);

        c6b = (Button) findViewById(R.id.b1);
        d6b = (Button) findViewById(R.id.b2);
        f6b = (Button) findViewById(R.id.b3);
        g6b = (Button) findViewById(R.id.b4);
        a6b = (Button) findViewById(R.id.b5);
        c7b = (Button) findViewById(R.id.b6);
        d7b = (Button) findViewById(R.id.b7);


        soundPool = new SoundPool.Builder().setMaxStreams(5).build();
        c6z = soundPool.load(this, R.raw.c6, 1);
        d6z = soundPool.load(this, R.raw.d6, 1);
        e6z = soundPool.load(this, R.raw.e6, 1);
        f6z = soundPool.load(this, R.raw.f6, 1);
        g6z = soundPool.load(this, R.raw.g6, 1);
        a6z = soundPool.load(this, R.raw.a6, 1);
        b6z = soundPool.load(this, R.raw.b6, 1);
        c7z = soundPool.load(this, R.raw.c7, 1);
        d7z = soundPool.load(this, R.raw.d7, 1);
        e7z = soundPool.load(this, R.raw.e7, 1);


        c6bz = soundPool.load(this, R.raw.c6b, 1);
        d6bz = soundPool.load(this, R.raw.d6b, 1);
        f6bz = soundPool.load(this, R.raw.f6b, 1);
        g6bz = soundPool.load(this, R.raw.g6b, 1);
        a6bz = soundPool.load(this, R.raw.a6b, 1);
        c7bz = soundPool.load(this, R.raw.c7b, 1);
        d7bz = soundPool.load(this, R.raw.d7b, 1);


        c6.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(c6z, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(c6z);
                        break;
                }
                return false;
            }
        });

        d6.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(d6z, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(d6z);
                        break;
                }
                return false;
            }

        });
        e6.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(e6z, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(e6z);
                        break;
                }
                return false;
            }


        });
        f6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(f6z, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(f6z);
                        break;
                }
                return false;
            }

        });
        g6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(g6z, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(g6z);
                        break;
                }
                return false;
            }

        });
        a6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(a6z, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(a6z);
                        break;
                }
                return false;
            }
        });
        b6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(b6z, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(b6z);
                        break;
                }
                return false;
            }
        });
        c7.setOnTouchListener(new View.OnTouchListener() {
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

        c6b.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(c6bz, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(c6bz);
                        break;
                }
                return false;
            }
        });
        d6b.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(d6bz, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(d6bz);
                        break;
                }
                return false;
            }
        });
        f6b.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(f6bz, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(f6bz);
                        break;
                }
                return false;
            }
        });
        g6b.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(g6bz, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(g6bz);
                        break;
                }
                return false;
            }
        });
        a6b.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(a6bz, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(a6bz);
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

    }
}