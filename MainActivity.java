package com.example.zz.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.*;

public class MainActivity extends AppCompatActivity{

    /*private TextView textView1;
    private TextView textView2;*/
    /*private Button myButton1= (Button)findViewById(R.id.button1);
    private Button myButton2= (Button)findViewById(R.id.button2);*/




    /*private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        *//*@Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent(MainActivity.this , Another.class);
        Button myButton1= (Button)findViewById(R.id.button1);
        Button myButton2= (Button)findViewById(R.id.button2);
        myButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String inputText = "Please click on YES.";
                Toast.makeText(MainActivity.this, inputText, Toast.LENGTH_SHORT).show();
        }
        });
        myButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this , Another.class);
                startActivity(i);
        }
                                     });

    /*View.OnClickListener onclick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.button1:
                    String inputText = "Please click on button2.";
                    Toast.makeText(MainActivity.this, inputText, Toast.LENGTH_SHORT).show();
                    break;
                case R.id.button2:
                    Intent i = new Intent(MainActivity.this , Another.class);
                    startActivity(i);
                default:
                    break;

            }
        }
    };*/

        /*textView1 = (TextView) findViewById(R.id.message);
        *//*BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);*/
    }

}
