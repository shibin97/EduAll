package com.example.hp.test;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class entry extends AppCompatActivity {

    //SharedPreferences sharedp1 = getSharedPreferences("Count", Context.MODE_PRIVATE);
    //Integer a1 = sharedp1.getInt("Count",0);

    int a1 = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);


        /*try{
            a = Integer.valueOf(strt);
        }catch(Exception e){
            Log.d("e",e.toString());
        }*/

        Button btn = (Button)findViewById(R.id.button2);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText ed1,ed2,ed3;
                ed1 = (EditText)findViewById(R.id.editText5);
                ed2 = (EditText)findViewById(R.id.editText6);
                ed3 = (EditText)findViewById(R.id.editText7);

                if(a1>1) {
                    a1 = a1 - 1;
                    ed1.getText().clear();
                    ed2.getText().clear();
                    ed3.getText().clear();

                }
                else{
                    Intent i = new Intent(entry.this,success.class);
                    startActivity(i);
                }

                }



        });

    }
}
