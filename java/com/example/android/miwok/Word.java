package com.example.android.miwok;

/**
 * Created by Daniel on 11/6/2017.
 */

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;

    public Word(String defaultTranslation, String miwokTranlation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranlation;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
}
