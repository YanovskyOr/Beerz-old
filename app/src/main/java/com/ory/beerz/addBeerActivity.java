package com.ory.beerz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class addBeerActivity extends AppCompatActivity {

    private Toolbar addBeerToolbar;

    int getBeerInfoFromUserInput(){

        return 0;
    }
//final EditText beerName = (EditText) mView.findViewById(R.id.beerName);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_beer);

        addBeerToolbar = (Toolbar)findViewById(R.id.addBeerToolbar);
        setSupportActionBar(addBeerToolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        addBeerToolbar.setElevation(16);



        //String beerName = mView.findViewById(R.id.beerName);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.add_beer_menu, menu);
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
