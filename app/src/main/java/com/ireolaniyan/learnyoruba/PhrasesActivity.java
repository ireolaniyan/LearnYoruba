package com.ireolaniyan.learnyoruba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Words> words = new ArrayList<>();
        words.add(new Words("Ki ni orukọ rẹ?", "What is your name?"));
        words.add(new Words("Orukọ mi ni...", "My name is..."));
        words.add(new Words("Ṣe daadaa ni o wa?", "How are you?"));
        words.add(new Words("Mo wa daadaa", "I am fine"));
        words.add(new Words("O to ọjọ mẹta", "Long time no see"));
        words.add(new Words("Nibo lo wa?", "Where are you?"));
        words.add(new Words("Mo wa ni...", "I am at..."));
        words.add(new Words("Ki lo n se?", "What are you doing?"));
        words.add(new Words("Ma se be", "Don't do that"));
        words.add(new Words("Wa si ile odo mi", "Come to my house"));
        words.add(new Words("Lo si ile iwe", "Go to school"));

        WordsAdapter adapter = new WordsAdapter(this, words, R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
