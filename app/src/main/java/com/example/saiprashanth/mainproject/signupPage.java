package com.example.saiprashanth.mainproject;


import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signupPage extends AppCompatActivity {
EditText User_Name,User_Pass;
    String username,password;
    Button reg;
    Context ctx=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page);
        User_Name= (EditText) findViewById(R.id.Name);
        User_Pass=(EditText)findViewById(R.id.UserPassword);
        reg=(Button)findViewById(R.id.submit);
        reg.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
            username=User_Name.getText().toString();
            password=User_Pass.getText().toString();
                DatabaseCreation ob=new DatabaseCreation(ctx);
                ob.putInformation(ob,username,password);
                Toast.makeText(getBaseContext(),"SIGN UP success",Toast.LENGTH_LONG);
                finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_signup_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
