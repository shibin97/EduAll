package com.example.hp.test;

/**
 * Created by HP on 3/2/2018.
 */

import android.content.Intent;
import android.graphics.LinearGradient;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);



        Button btn = (Button)findViewById(R.id.button1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText ed1, ed2, ed3, ed4;
                ed1 = (EditText) findViewById(R.id.uName);
                ed2 = (EditText) findViewById(R.id.email);
                ed3 = (EditText) findViewById(R.id.pass);
                ed4 = (EditText) findViewById(R.id.age);

                String str1 = ed1.getText().toString();
                String str2 = ed2.getText().toString();
                String str3 = ed3.getText().toString();
                String str4 = ed4.getText().toString();


                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference();
                myRef.child("Users").child(str2).setValue(new UserDetails(str1, str4, str3)).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Log.d("push", "success");
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.d("push", "error");
                    }
                });


                Intent i = new Intent(SignUp.this, Login.class);
                startActivity(i);
            }
        });


    }
    }
