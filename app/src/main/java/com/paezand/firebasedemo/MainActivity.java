package com.paezand.firebasedemo;

import android.database.DatabaseUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
//        Map<String, String> values = new HashMap<>();
//
//        values.put("name", "andrew");
//
//        databaseReference.push().setValue(values, new DatabaseReference.CompletionListener() {
//            @Override
//            public void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
//                if (databaseError == null) {
//                    Log.d("Info", "Successful");
//                } else {
//                    Log.d("Info", "Failed");
//                }
//            }
//        });
    }
}
