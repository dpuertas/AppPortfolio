package com.danielpuertas.appportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;
import android.content.Context;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


//Set Click Listeners

        //Spotify Button
        final Button spotButton = (Button) findViewById(R.id.spotifyButton);
        spotButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showButtonToast(spotButton);
            }
        });

        //Scores App
        final Button scoresButton = (Button) findViewById(R.id.scoresAppButton);
        scoresButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showButtonToast(scoresButton);
            }
        });

        //Library App
        final Button libButton = (Button) findViewById(R.id.libraryAppButton);
        libButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showButtonToast(libButton);
            }
        });

        //Build it Bigger
        final Button buildButton = (Button) findViewById(R.id.buildButton);
        buildButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showButtonToast(buildButton);
            }
        });

        //XYZ Reader
        final Button xyzButton = (Button) findViewById(R.id.xyzButton);
        xyzButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showButtonToast(xyzButton);
            }
        });

        //Capstone App
        final Button capButton = (Button) findViewById(R.id.capstoneButton);
        capButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showButtonToast(capButton);
            }
        });

    }

    //Show a toast - placeholder
    public boolean showButtonToast(Button myButton) {
        CharSequence text = "This button will launch " +  myButton.getText();
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        return true;
    }

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
