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

public class child_reg extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

       // android:roundIcon="@mipmap/ic_launcher_round"

        Log.d("check","redirect");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_reg);
        EditText ed1=(EditText)findViewById(R.id.editText3);
        String str =ed1.getText().toString();
       /* SharedPreferences sharedp1 = getSharedPreferences("Count", Context.MODE_PRIVATE);
        SharedPreferences.Editor counter=sharedp1.edit();
        try {
            a = Integer.parseInt(str);
        }
        catch(Exception e){
            Log.d("e",e.toString());
        }
        counter.putInt("Count",a);
        counter.commit(); */

        Button btn = (Button)findViewById(R.id.GO);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(child_reg.this,entry.class);
                startActivity(i);
            }
        });

    }
}
