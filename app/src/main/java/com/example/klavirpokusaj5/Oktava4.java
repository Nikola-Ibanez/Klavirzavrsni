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

public class Oktava4 extends AppCompatActivity {
    Button c4, d4, e4, f4, g4, a4, b4, c5, d5, e5;
    private int c4z, d4z, e4z, f4z, g4z, a4z, b4z, c5z, d5z, e5z, f5z;
    private SoundPool soundPool;

    Button c4b, d4b, f4b, g4b, a4b, c5b, d5b;
    private int c4bz, d4bz, f4bz, g4bz, a4bz, c5bz, d5bz;
    private View view;
    float initX;
    float initY;
    Spinner spinner;
    String[] SPINNERVALUES = {"OK3", "OK5", "OK6", "OK7"};
    String SpinnerValue;
    Intent intent;
    Button GOTO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oktava4);



       spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Oktava4.this, android.R.layout.simple_list_item_1, SPINNERVALUES);
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
                        intent = new Intent(Oktava4.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case "OK5":
                        intent = new Intent(Oktava4.this, Oktava5.class);
                        startActivity(intent);
                        break;

                    case "OK6":
                        intent = new Intent(Oktava4.this, Oktava6.class);
                        startActivity(intent);
                        break;
                    case "OK7":
                        intent = new Intent(Oktava4.this, Oktava7.class);
                        startActivity(intent);
                        break;

                }
            }
        });
            c4 = (Button) findViewById(R.id.p1);
            d4 = (Button) findViewById(R.id.p2);
            e4 = (Button) findViewById(R.id.p3);
            f4 = (Button) findViewById(R.id.p4);
            g4 = (Button) findViewById(R.id.p5);
            a4 = (Button) findViewById(R.id.p6);
            b4 = (Button) findViewById(R.id.p7);
            c5 = (Button) findViewById(R.id.p8);
            d5 = (Button) findViewById(R.id.p9);
            e5 = (Button) findViewById(R.id.p10);

            c4b = (Button) findViewById(R.id.b1);
            d4b = (Button) findViewById(R.id.b2);
            f4b = (Button) findViewById(R.id.b3);
            g4b = (Button) findViewById(R.id.b4);
            a4b = (Button) findViewById(R.id.b5);
            c5b = (Button) findViewById(R.id.b6);
            d5b = (Button) findViewById(R.id.b7);



            soundPool = new SoundPool.Builder().setMaxStreams(5).build();
            c4z = soundPool.load(this, R.raw.c4, 1);
            d4z = soundPool.load(this, R.raw.d4, 1);
            e4z = soundPool.load(this, R.raw.e4, 1);
            f4z = soundPool.load(this, R.raw.f4, 1);
            g4z = soundPool.load(this, R.raw.g4, 1);
            a4z = soundPool.load(this, R.raw.a4, 1);
            b4z = soundPool.load(this, R.raw.b4, 1);
            c5z = soundPool.load(this, R.raw.c5, 1);
            d5z = soundPool.load(this, R.raw.d5, 1);
            e5z = soundPool.load(this, R.raw.e5, 1);


            c4bz = soundPool.load(this, R.raw.c4b, 1);
            d4bz = soundPool.load(this, R.raw.d4b, 1);
            f4bz = soundPool.load(this, R.raw.f4b, 1);
            g4bz = soundPool.load(this, R.raw.g4b, 1);
            a4bz = soundPool.load(this, R.raw.a4b, 1);
            c5bz = soundPool.load(this, R.raw.c5b, 1);
            d5bz = soundPool.load(this, R.raw.d5b, 1);


            c4.setOnTouchListener(new View.OnTouchListener() {
                @SuppressLint("ClickableViewAccessibility")
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
                @SuppressLint("ClickableViewAccessibility")
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
                @SuppressLint("ClickableViewAccessibility")
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
            f4.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    int eventType = event.getActionMasked();
                    switch (eventType) {
                        case MotionEvent.ACTION_DOWN:
                            soundPool.play(f4z, 1, 1, 0, 0, 1);
                            break;
                        case MotionEvent.ACTION_UP:
                            soundPool.stop(f4z);
                            break;
                    }
                    return false;
                }

            });
            g4.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    int eventType = event.getActionMasked();
                    switch (eventType) {
                        case MotionEvent.ACTION_DOWN:
                            soundPool.play(g4z, 1, 1, 0, 0, 1);
                            break;
                        case MotionEvent.ACTION_UP:
                            soundPool.stop(g4z);
                            break;
                    }
                    return false;
                }

            });
            a4.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    int eventType = event.getActionMasked();
                    switch (eventType) {
                        case MotionEvent.ACTION_DOWN:
                            soundPool.play(a4z, 1, 1, 0, 0, 1);
                            break;
                        case MotionEvent.ACTION_UP:
                            soundPool.stop(a4z);
                            break;
                    }
                    return false;
                }
            });
            b4.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    int eventType = event.getActionMasked();
                    switch (eventType) {
                        case MotionEvent.ACTION_DOWN:
                            soundPool.play(b4z, 1, 1, 0, 0, 1);
                            break;
                        case MotionEvent.ACTION_UP:
                            soundPool.stop(b4z);
                            break;
                    }
                    return false;
                }
            });
            c5.setOnTouchListener(new View.OnTouchListener() {
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
            f4b.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    int eventType = event.getActionMasked();
                    switch (eventType) {
                        case MotionEvent.ACTION_DOWN:
                            soundPool.play(f4bz, 1, 1, 0, 0, 1);
                            break;
                        case MotionEvent.ACTION_UP:
                            soundPool.stop(f4bz);
                            break;
                    }
                    return false;
                }
            });
            g4b.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    int eventType = event.getActionMasked();
                    switch (eventType) {
                        case MotionEvent.ACTION_DOWN:
                            soundPool.play(g4bz, 1, 1, 0, 0, 1);
                            break;
                        case MotionEvent.ACTION_UP:
                            soundPool.stop(g4bz);
                            break;
                    }
                    return false;
                }
            });
            a4b.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    int eventType = event.getActionMasked();
                    switch (eventType) {
                        case MotionEvent.ACTION_DOWN:
                            soundPool.play(a4bz, 1, 1, 0, 0, 1);
                            break;
                        case MotionEvent.ACTION_UP:
                            soundPool.stop(a4bz);
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

        }
    }
