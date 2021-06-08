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

public class Oktava5 extends AppCompatActivity {
    Button c5, d5, e5, f5, g5, a5, b5, c6, d6, e6;
    private int c5z, d5z, e5z, f5z, g5z, a5z, b5z, c6z, d6z, e6z;
    private SoundPool soundPool;

    Button c5b, d5b, f5b, g5b, a5b, c6b, d6b;
    private int c5bz, d5bz, f5bz, g5bz, a5bz, c6bz, d6bz;
    private View view;
    Spinner spinner;
    String[] SPINNERVALUES = {"OK3", "OK4", "OK6", "OK7"};
    String SpinnerValue;
    Intent intent;
    Button GOTO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oktava5);


        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Oktava5.this, android.R.layout.simple_list_item_1, SPINNERVALUES);
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
                        intent = new Intent(Oktava5.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case "OK4":
                        intent = new Intent(Oktava5.this, Oktava4.class);
                        startActivity(intent);
                        break;

                    case "OK6":
                        intent = new Intent(Oktava5.this, Oktava6.class);
                        startActivity(intent);
                        break;
                    case "OK7":
                        intent = new Intent(Oktava5.this, Oktava7.class);
                        startActivity(intent);
                        break;

                }
            }
        });
        c5 = (Button) findViewById(R.id.p1);
        d5 = (Button) findViewById(R.id.p2);
        e5 = (Button) findViewById(R.id.p3);
        f5 = (Button) findViewById(R.id.p4);
        g5 = (Button) findViewById(R.id.p5);
        a5 = (Button) findViewById(R.id.p6);
        b5 = (Button) findViewById(R.id.p7);
        c6 = (Button) findViewById(R.id.p8);
        d6 = (Button) findViewById(R.id.p9);
        e6 = (Button) findViewById(R.id.p10);

        c5b = (Button) findViewById(R.id.b1);
        d5b = (Button) findViewById(R.id.b2);
        f5b = (Button) findViewById(R.id.b3);
        g5b = (Button) findViewById(R.id.b4);
        a5b = (Button) findViewById(R.id.b5);
        c6b = (Button) findViewById(R.id.b6);
        d6b = (Button) findViewById(R.id.b7);


        soundPool = new SoundPool.Builder().setMaxStreams(5).build();
        c5z = soundPool.load(this, R.raw.c5, 1);
        d5z = soundPool.load(this, R.raw.d5, 1);
        e5z = soundPool.load(this, R.raw.e5, 1);
        f5z = soundPool.load(this, R.raw.f5, 1);
        g5z = soundPool.load(this, R.raw.g5, 1);
        a5z = soundPool.load(this, R.raw.a5, 1);
        b5z = soundPool.load(this, R.raw.b5, 1);
        c6z = soundPool.load(this, R.raw.c6, 1);
        d6z = soundPool.load(this, R.raw.d6, 1);
        e6z = soundPool.load(this, R.raw.e6, 1);


        c5bz = soundPool.load(this, R.raw.c5b, 1);
        d5bz = soundPool.load(this, R.raw.d5b, 1);
        f5bz = soundPool.load(this, R.raw.f5b, 1);
        g5bz = soundPool.load(this, R.raw.g5b, 1);
        a5bz = soundPool.load(this, R.raw.a5b, 1);
        c6bz = soundPool.load(this, R.raw.c6b, 1);
        d6bz = soundPool.load(this, R.raw.d6b, 1);


        c5.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(c5z, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(c5z);
                        break;
                }
                return false;
            }
        });

        d5.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(d5z, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(d5z);
                        break;
                }
                return false;
            }

        });
        e5.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(e5z, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(e5z);
                        break;
                }
                return false;
            }


        });
        f5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(f5z, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(f5z);
                        break;
                }
                return false;
            }

        });
        g5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(g5z, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(g5z);
                        break;
                }
                return false;
            }

        });
        a5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(a5z, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(a5z);
                        break;
                }
                return false;
            }
        });
        b5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(b5z, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(b5z);
                        break;
                }
                return false;
            }
        });
        c6.setOnTouchListener(new View.OnTouchListener() {
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

        c5b.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(c5bz, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(c5bz);
                        break;
                }
                return false;
            }
        });
        d5b.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(d5bz, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(d5bz);
                        break;
                }
                return false;
            }
        });
        f5b.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(f5bz, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(f5bz);
                        break;
                }
                return false;
            }
        });
        g5b.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(g5bz, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(g5bz);
                        break;
                }
                return false;
            }
        });
        a5b.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventType = event.getActionMasked();
                switch (eventType) {
                    case MotionEvent.ACTION_DOWN:
                        soundPool.play(a5bz, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        soundPool.stop(a5bz);
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

    }
}