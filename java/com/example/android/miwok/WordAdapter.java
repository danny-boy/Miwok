package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniel on 11/6/2017.
 */

public class WordAdapter extends ArrayAdapter<Word>{

    int mRes;
    int mSound;

    public WordAdapter(Activity context, ArrayList<Word> words, int resource) {
        super(context, 0 , words);
        mRes = resource;
    }

//    int mRes;
//    int mSound;
//
//    public WordAdapter(Activity context, ArrayList<Word> words, int resource, int sound) {
//        super(context, 0 , words);
//        mRes = resource;
//        mSound = sound;
//    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miwokTranslationTextView = (TextView) listItemView.findViewById(R.id.miwok_word);
        miwokTranslationTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultTranslationTextView = (TextView) listItemView.findViewById(R.id.english_word);
        defaultTranslationTextView.setText(currentWord.getDefaultTranslation());

        ImageView wordImage = (ImageView) listItemView.findViewById(R.id.word_img);

        if(currentWord.hasImage()) {
            wordImage.setImageResource(currentWord.getImage());
            wordImage.setVisibility(View.VISIBLE);
        }
        else {
            wordImage.setVisibility(View.GONE);
        }

        MediaController playButton = (MediaController) listItemView.findViewById(R.id.audio_playback);
        playButton.playSoundEffect(mSound);

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mRes);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }



}
