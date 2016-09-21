package com.example.administrator.wqy;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    Button loginBt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oo);
        loginBt = (Button) findViewById(R.id.btId);
        gotoAnotherActivity();
    }
    public void gotoAnotherActivity(){
        loginBt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,GotoActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"跳转到已登陆界面", Toast.LENGTH_SHORT).show();
            }
        });
        loginBt.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getApplicationContext(),"sssssk",Toast.LENGTH_LONG).show();
                return false;
            }
        });

       /* loginBt.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v){
                Toast.makeText(getApplicationContext(),"长按了登陆按钮",Toast.LENGTH_SHORT).show();
                return false;
            }
        });*/
    }
}
