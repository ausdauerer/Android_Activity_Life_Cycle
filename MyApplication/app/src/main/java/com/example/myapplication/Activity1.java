package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;


public class Activity1 extends Activity {
    String tag="Events";
    String console_data="";
    @Override
        public void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_activity1);
            Intent input_intent=getIntent();
            Bundle b=input_intent.getExtras();
            if(b!=null){
                console_data=b.get("data_console").toString();
            }
            TextView console=findViewById(R.id.console_activity1);
            console.setMovementMethod(new ScrollingMovementMethod());
            console.append(console_data);
            console.append("Activity1:onCreate()\n");
            console_data=console_data+"Activity1:onCreate()\n";
        }
        public void onStart(){
            super.onStart();
            TextView console=findViewById(R.id.console_activity1);
            console.append("Activity1:onStart()\n");
            console_data=console_data+"Activity1:onStart()\n";
        }
        public void onRestart(){
            super.onRestart();
            TextView console=findViewById(R.id.console_activity1);
            console.append("Activity1:onRestart()\n");
            console_data=console_data+"Activity1:onRestart()\n";
        }
        public void onResume(){
            super.onResume();
            TextView console=findViewById(R.id.console_activity1);
            console.append("Activity1:OnResume()\n");
            console_data=console_data+"Activity1:onResume()\n";
        }
        public void onPause(){
            super.onPause();
            TextView console=((TextView)(findViewById(R.id.console_activity1)));
            console.append("Activity1:OnPause()\n");
            console_data=console_data+"Activity1:onPause()\n";
        }
        public void onStop(){
            super.onStop();
            TextView console=((TextView)(findViewById(R.id.console_activity1)));
            console.append("Activity1:OnStop()\n");
            console_data=console_data+"Activity1:onStop()\n";
        }
        public void onBackPressed(){
            TextView console=findViewById(R.id.console_activity1);
            console_data=console_data+"Activity1:onPause()\n"+"Activity1:onStop()\n"+"Activity1:onDestroy()\n";
            Intent data=new Intent();
            data.setData(Uri.parse(console_data));
            setResult(RESULT_OK,data);
            finish();
        }
}

