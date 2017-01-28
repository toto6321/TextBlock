package edu.oakland.textblock;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class StatusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);
    }


    public void unlockMyPhone(View view) {
        Intent takePhoto = new Intent(this, TakePhotoActivity.class);
        startActivity(takePhoto);
    }

    public void unlockMyPhone2(View view) {
        Intent takePhoto = new Intent(this, TakePhotoActivity2.class);
        startActivity(takePhoto);
    }
}
