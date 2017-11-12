package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);


    ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("father", "\u04D9p\u04D9"));
        words.add(new Word("mother", "eta"));
        words.add(new Word("son", "angsi"));
        words.add(new Word("daughter", "tune"));
        words.add(new Word("older brother", "taachi"));
        words.add(new Word("younger brother", "chalitti"));
        words.add(new Word("older sister", "tete"));
        words.add(new Word("younger sister", "kolliti"));
        words.add(new Word("grandmother", "ama"));
        words.add(new Word("grandfather", "paapa"));

    WordAdapter adapter = new WordAdapter(this, words);

    ListView listView = (ListView) findViewById(R.id.family_list);

        listView.setAdapter(adapter);
    }
}

