package com.example.liuyulei.world;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class MainActivity extends Activity implements View.OnClickListener{

    private RelativeLayout relativeLayout;
    private static Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handler = new Handler() {
            @Override
            public void close() {

            }

            @Override
            public void flush() {

            }

            @Override
            public void publish(LogRecord logRecord) {

            }
        };
        relativeLayout = (RelativeLayout)this.findViewById(R.id.rootv);
        relativeLayout.setOnClickListener(this);
        findViewById(R.id.button).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.rootv:
                InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(view.getWindowToken(),0);
                break;
            case R.id.button:
                InputMethodManager imm1 = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                imm1.hideSoftInputFromWindow(view.getWindowToken(), 0);
                Toast.makeText(MainActivity.this,"Hello,world",1).show();

                Intent intent = new Intent();
                intent.setClass(this,SecondActivity.class);
                startActivity(intent);

                break;
        }
    }
}
