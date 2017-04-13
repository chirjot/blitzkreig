package com.example.acer.firstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ContactActivity extends AppCompatActivity {

    private TextView tvabout,tvcontent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        tvabout=(TextView)findViewById(R.id.tvabout);
        tvcontent=(TextView)findViewById(R.id.tvcontent);

        tvabout.setText("CONTACT US");

        tvcontent.setText("Contact No. :"+
                          "\nTushar Gupta : +91-9911374795" +
                          "\n\n\n\nEmail Id :\n\ngulatichiransh@@gmail.com \n13chirjot@gmail.com" +
                          "\ntusharrrrr97@gmail.com ");
    }
}
