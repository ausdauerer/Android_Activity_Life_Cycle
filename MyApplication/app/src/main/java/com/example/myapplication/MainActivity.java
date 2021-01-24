package com.example.myapplication;

 import android.app.Activity;
 import android.net.Uri;
 import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.Toast;
import android.widget.TextView;
import android.text.method.ScrollingMovementMethod;

import org.w3c.dom.Text;


public class MainActivity extends Activity{
    String tag="Events";
    int request_Code=1;
    String console_data="";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView console=findViewById(R.id.console_main);
        console.setMovementMethod(new ScrollingMovementMethod());
        console_data=console_data+"MainActivity:onCreate()\n";
        console.setText(console_data);
        Log.d("ref","Main Activity Started");
        ((Button)(findViewById(R.id.start_activity1_button))).setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Log.d("ref","Now going to start the next Activity");
                    Intent i=new Intent("com.example.myapplication.Activity1");
                    i.putExtra("data_console",(console_data+"MainActivity:onPause()\n"+"MainActivity:onStop()\n"));
                    startActivityForResult(i,request_Code);
        }});
        ((Button)(findViewById(R.id.start_activity2_button))).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Log.d("ref","Now going to start the next Activity");
                Intent i=new Intent("com.example.myapplication.Activity2");
                i.putExtra("data_console",(console_data+"MainActivity:onPause()\n"+"MainActivity:onStop()\n"));
                startActivityForResult(i,request_Code);
            }});
        ((Button)(findViewById(R.id.start_activity3_button))).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Log.d("ref","Now going to start the next Activity");
                Intent i=new Intent("com.example.myapplication.Activity3");
                i.putExtra("data_console",(console_data+"MainActivity:onPause()\n"+"MainActivity:onStop()\n"));
                startActivityForResult(i,request_Code);
            }});
    }
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == request_Code) {
            if (resultCode == RESULT_OK) {
                console_data=data.getData().toString();
            }
        }
    }
    public void onStart(){
        super.onStart();
        TextView console=findViewById(R.id.console_main);
        console_data=console_data+"MainActivity:onStart()\n";
        console.setText(console_data);
    }
    public void onRestart(){
        super.onRestart();
        TextView console=findViewById(R.id.console_main);
        console_data=console_data+"MainActivity:onRestart()\n";
        console.setText(console_data);
    }
    public void onResume(){
        super.onResume();
        TextView console=findViewById(R.id.console_main);
        console_data=console_data+"MainActivity:onResume()\n";
        console.setText(console_data);
    }
    public void onPause(){
        super.onPause();
        TextView console=((TextView)(findViewById(R.id.console_main)));
        console_data=console_data+"MainActivity:onPause()\n";
        console.setText(console_data);
    }
    public void onStop(){
        super.onStop();
        TextView console=((TextView)(findViewById(R.id.console_main)));
        console_data=console_data+"MainActivity:onStop()\n";
        console.setText(console_data);
    }
    public void onDestroy(){
        super.onDestroy();
        TextView console=((TextView)(findViewById(R.id.console_main)));
        console_data=console_data+"MainActivity:onDestroy()\n";
        console.setText(console_data);
    }
}