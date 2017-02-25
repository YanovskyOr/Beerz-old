package com.ory.beerz;

import android.app.LauncherActivity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Outline;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    final Context c = this;
    FloatingActionButton fab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] beerNames= {
                "Bishoff",
                "Stella",
                "Bitburger",
                "macshouf",
                "Wheinshtefan",
                "Macabbi",
                "Goldstar",
                "Casteel",
                "Bishoff",
                "Stella",
                "Bitburger",
                "macshouf",
                "Wheinshtefan",
                "Macabbi",
                "Goldstar",
                "Casteel",
                "Bishoff",
                "Stella",
                "Bitburger",
                "macshouf",
                "Wheinshtefan",
                "Macabbi",
                "Goldstar",
                "Casteel"
        };

        final ArrayList<String> beerNamesList = new ArrayList<String>(Arrays.asList(beerNames));

        ArrayAdapter beerListAdapter = new ArrayAdapter<String>(
                this,
                R.layout.list_item_beer,
                R.id.List_item_beer_textview,
                beerNamesList);

        ListView listView = (ListView) findViewById(R.id.Listview_items_beer);
        listView.setAdapter(beerListAdapter);

        fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, addBeerActivity.class));
                //final EditText beerName = (EditText) mView.findViewById(R.id.beerName);

            }
        });

    }
}
