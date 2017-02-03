package com.ireolaniyan.learnyoruba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class GreetingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Words> words = new ArrayList<>();
        words.add(new Words("Ẹ ku aarọ", "Good morning"));
        words.add(new Words("Ẹ ku ọsan", "Good afternoon"));
        words.add(new Words("Ẹ ku alẹ", "Good evening"));
        words.add(new Words("O da aarọ", "Good night"));
        words.add(new Words("Ẹ ku abọ", "Welcome"));
        words.add(new Words("O da abọ", "Goodbye"));
        words.add(new Words("Pẹlẹ", "Sorry"));
        words.add(new Words("E se", "Thank you"));
        words.add(new Words("Ko to ọpẹ", "Reply to Thank you"));
        words.add(new Words("Ẹ ku Ayọ Ọjọ Ibi", "Happy birthday"));

        WordsAdapter adapter = new WordsAdapter(this, words, R.color.category_greetings);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
