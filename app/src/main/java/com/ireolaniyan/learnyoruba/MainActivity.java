package com.ireolaniyan.learnyoruba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private View.OnClickListener mCategoryClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int id = view.getId();
            switch (id){
                case R.id.greetingsTextView:
                    Intent greetingsIntent = new Intent(view.getContext(), GreetingsActivity.class);
                    startActivity(greetingsIntent);
                    break;
                case R.id.numbersTextView:
                    Intent numbersIntent = new Intent(view.getContext(), NumbersActivity.class);
                    startActivity(numbersIntent);
                    break;
                case R.id.phrasesTextView:
                    Intent phrasesIntent = new Intent(view.getContext(), PhrasesActivity.class);
                    startActivity(phrasesIntent);
                    break;
                case R.id.proverbsTextView:
                    Intent proverbsIntent = new Intent(view.getContext(), ProverbsActivity.class);
                    startActivity(proverbsIntent);
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView greetingsTextView = (TextView) findViewById(R.id.greetingsTextView);
        TextView numbersTextView = (TextView) findViewById(R.id.numbersTextView);
        TextView phrasesTextView = (TextView) findViewById(R.id.phrasesTextView);
        TextView proverbsTextView = (TextView) findViewById(R.id.proverbsTextView);

        greetingsTextView.setOnClickListener(mCategoryClickListener);
        numbersTextView.setOnClickListener(mCategoryClickListener);
        phrasesTextView.setOnClickListener(mCategoryClickListener);
        proverbsTextView.setOnClickListener(mCategoryClickListener);
    }
}
