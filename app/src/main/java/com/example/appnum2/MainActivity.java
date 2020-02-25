package com.example.appnum2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        TextView txt1 = (TextView) findViewById(R.id.txt1); // Andriod studio ko yeh btana lazmi hai kay hum textview hee pey kaam kar rahe hain kyun kay view is the super class of textview
        TextView txt2 = (TextView) findViewById(R.id.txt2);
        TextView txt3 = (TextView) findViewById(R.id.txt3);
       /* txt1.setText("My own text");

        String str = " Hello World";
        StringTokenizer strobj = new StringTokenizer(str);

        txt2.setText(strobj.nextToken());
        txt1.setText(strobj.nextToken()); */

       String str2 = "SAIF ALAM@SSUETIAN@MANSOOR ALAM";
       StringTokenizer strobj1 = new StringTokenizer(str2 , "@");
       txt1.setText(strobj1.nextToken());
       txt2.setText(strobj1.nextToken());
       txt3.setText(strobj1.nextToken());
    }

    // StringTokenizer ko hum use karte hain jab humen same text ko divide karna hota hai or uss d=string ka ek obj bana kay uskay method ko call karte hain.



    // infaltion we cover later on this course, this is the built in code here.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
