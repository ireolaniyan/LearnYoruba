package com.ireolaniyan.learnyoruba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ProverbsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

    /*    ArrayList<Words> words = new ArrayList<>();
        words.add(new Words("òkan", "one"));
        words.add(new Words("eji", "two"));
        words.add(new Words("eta", "three"));
        words.add(new Words("erin", "four"));
        words.add(new Words("arun", "five"));
        words.add(new Words("efa", "six"));
        words.add(new Words("eje", "seven"));
        words.add(new Words("ejo", "eight"));
        words.add(new Words("esan", "nine"));
        words.add(new Words("ewa", "ten"));

        WordsAdapter adapter = new WordsAdapter(this, words, R.color.category_proverbs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);*/
    }
}
