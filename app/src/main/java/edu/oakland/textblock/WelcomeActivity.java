package edu.oakland.textblock;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        // receive message once start
        Intent receiveIntent = getIntent();
        String accountName = receiveIntent.getStringExtra("accountName");
//        String password=receiveIntent.getStringExtra("password");
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText("Dear" + accountName + ", welcome!");

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_welcome);
        layout.addView(textView);
    }
}
