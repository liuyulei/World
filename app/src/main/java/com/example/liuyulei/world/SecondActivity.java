package com.example.liuyulei.world;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends Activity implements View.OnClickListener{

    private Button backBtn ;
    private Button newbackBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        backBtn = (Button)this.findViewById(R.id.button2);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                finish();
                Toast.makeText(SecondActivity.this, "nihaode", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(intent);

            }
        });
        newbackBtn =(Button)this.findViewById(R.id.secondback);
        newbackBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.secondback:
                finish();
                break;
        }
    }
}
