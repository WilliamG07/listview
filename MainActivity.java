package com.example.listviewparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.ListView);


        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(new Person(R.drawable.rules,"New Rules","Dua Lipa"));
        arrayList.add(new Person(R.drawable.physical,"Physical","Dua Lipa"));
        arrayList.add(new Person(R.drawable.levitating,"Levitating","Dua Lipa"));
        arrayList.add(new Person(R.drawable.dontstart,"Dont Start Now","Dua Lipa"));
        arrayList.add(new Person(R.drawable.love,"Love Again","Dua Lipa"));

        PersonAdapter personAdapter = new PersonAdapter(this,R.layout.list_row,arrayList);

        listView.setAdapter(personAdapter);
    }
}