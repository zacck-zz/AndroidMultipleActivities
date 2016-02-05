package com.zacck.multipleactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView mFamilyListView = (ListView)findViewById(R.id.mFamilyList);

        //lets make an arraylist
        final List<String> mFamily = new ArrayList<String>();
        mFamily.add("Isaac");
        mFamily.add("Janet");
        mFamily.add("Samuel");
        mFamily.add("Alice");
        mFamily.add("Vannessa");
        mFamily.add("Rose");

        //set the adapter of the listview
        ArrayAdapter<String> myAdp = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mFamily);

        //use the arrayadapter for the listview
        mFamilyListView.setAdapter(myAdp);

        //set a click listener so the item gets sent to the second activity
        mFamilyListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent secondActivityIntent = new Intent(getApplicationContext(),SecondActivity.class);
                secondActivityIntent.putExtra("name", mFamily.get(position));
                startActivity(secondActivityIntent);
            }
        });
    }

    public void changeActivity(View mView)
    {
        Intent secondActivityIntent = new Intent(getApplicationContext(),SecondActivity.class);
        secondActivityIntent.putExtra("salutations", "hello dude");
        startActivity(secondActivityIntent);
    }
}
