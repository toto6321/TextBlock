package edu.oakland.textblock;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void logIn(View view) {
        // create an instance of Intent to connect two activity
        Intent intent = new Intent(this, WelcomeActivity.class);

        // get the value of accountName and password
        EditText accountNameEditText = (EditText) findViewById(R.id.accountNameEditText);
        EditText passwordEditText = (EditText) findViewById(R.id.passwordEditText);
        String accountNameString = accountNameEditText.getText().toString();
        String passwordString = passwordEditText.getText().toString();
        intent.putExtra("accountName", accountNameString);
        intent.putExtra("password", passwordString);

        //print on console to debug
        Log.d("where", "LogIn method:");
        Log.d("accountName", accountNameString);
        Log.d("password", passwordString);

        //if and only if the accountName matches its password, user logs in successfully
        if (LogInAuthentication(accountNameString, passwordString)) {
            //TODO add some method to authenticate the account information

            //print on console to debug
            Log.d("where", "LogInAuthentication method");
            Log.d("accountName", accountNameString);
            Log.d("password", passwordString);

            startActivity(intent);
        }

    }

    /**
     * this method is to check user's accountName and password
     *
     * @param accountNameString account name in string
     * @param passwordString    password in string
     * @return return true if the accountNameString exists in database and matches the password, otherwise return false
     */
    private boolean LogInAuthentication(String accountNameString, String passwordString) {
        // invoke some methods to check information on the database
        return true;
    }
}
