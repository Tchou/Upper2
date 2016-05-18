package com.example.kim.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    /** Called when the user clicks the Uppercase button */
    public void toUpper(View view) {
        // Do something in response to button
        EditText editText = (EditText) findViewById(R.id.editText);

        editText.setText(editText.getText().toString().toUpperCase());
    }



}
