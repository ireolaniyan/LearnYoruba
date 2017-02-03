package com.ireolaniyan.learnyoruba;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Words> words = new ArrayList<>();
        words.add(new Words("Okan", "one"));
        words.add(new Words("Èjì ", "two"));
        words.add(new Words("Ẹta", "three"));
        words.add(new Words("Ẹrin", "four"));
        words.add(new Words("Àrún", "five"));
        words.add(new Words("Ẹfà", "six"));
        words.add(new Words("Èje", "seven"));
        words.add(new Words("Ẹjọ", "eight"));
        words.add(new Words("Ẹsan", "nine"));
        words.add(new Words("Ẹwa", "ten"));

        WordsAdapter adapter = new WordsAdapter(this, words, R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, R.raw.coldplay_adventure_of_a_lifetime);
                mMediaPlayer.start();
            }
        });
    }
}
