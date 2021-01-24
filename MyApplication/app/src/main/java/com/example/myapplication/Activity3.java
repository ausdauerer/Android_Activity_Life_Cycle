package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;


public class Activity3 extends Activity {
    String tag="Events";
    String console_data="";
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity3);
        TextView console=findViewById(R.id.console_activity3);
        Intent input_intent=getIntent();
        Bundle b=input_intent.getExtras();
        if(b!=null){
            console_data=b.get("data_console").toString();
        }
        console.append(console_data);
        console.setMovementMethod(new ScrollingMovementMethod());
        console.append("Activity3:onCreate()\n");
        console_data=console_data+"Activity3:onCreate()\n";
    }
    public void onStart(){
        super.onStart();
        TextView console=findViewById(R.id.console_activity3);
        console.append("Activity3:onStart()\n");
        console_data=console_data+"Activity3:onStart()\n";
    }
    public void onRestart(){
        super.onRestart();
        TextView console=findViewById(R.id.console_activity3);
        console.append("Activity3:onRestart()\n");
        console_data=console_data+"Activity3:onRestart()\n";
    }
    public void onResume(){
        super.onResume();
        TextView console=findViewById(R.id.console_activity3);
        console.append("Activity3:OnResume()\n");
        console_data=console_data+"Activity3:onResume()\n";
    }
    public void onPause(){
        super.onPause();
        TextView console=((TextView)(findViewById(R.id.console_activity3)));
        console.append("Activity3:OnPause()\n");
        console_data=console_data+"Activity3:onPause()\n";
    }
    public void onStop(){
        super.onStop();
        TextView console=((TextView)(findViewById(R.id.console_activity3)));
        console.append("Activity3:OnStop()\n");
        console_data=console_data+"Activity3:onStop()\n";
    }
    public void onBackPressed(){
        TextView console=findViewById(R.id.console_activity3);
        console_data=console_data+"Activity3:onPause()\n"+"Activity3:onStop()\n"+"Activity3:onDestroy()\n";
        Intent data=new Intent();
        data.setData(Uri.parse(console_data));
        setResult(RESULT_OK,data);
        finish();
    }
}

