package com.example.hp.googlesearch;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //Creating objects of Edit text and Button.
    EditText editText;
    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) { //Main Class
        super.onCreate(savedInstanceState); //It creates and save the current instance state .
        setContentView(R.layout.activity_main);

        //Search the value of edit text through edit text ID .
        //Search the value of Button text through button ID.
        editText = (EditText) findViewById(R.id.editText2);
        button = (Button) findViewById(R.id.button5);

        // Creating OnclickListener method ().
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent in = new Intent(Intent.ACTION_VIEW); //Creating an Intent Object.
                String str = editText.getText().toString(); /*Creating a String object to get the
                                                              value from user.
                                                             */
                //Passing message from one activity to another activity through intent object.
                //Uri.parse is a function which fetch data from the resource .
                in.setData(Uri.parse("https://www.google.co.in/search?q=" + str));
                startActivity(in); //Executing the activity .
            }
        });

    }
}







