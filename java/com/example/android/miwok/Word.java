package com.example.android.miwok;

/**
 * Created by Daniel on 11/6/2017.
 */

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImage = NO_IMAGE_PROVIDED;
    private int mSound = NO_IMAGE_PROVIDED;
    public static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranlation, int image){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranlation;
        mImage = image;
    }

    public Word(String defaultTranslation, String miwokTranlation, int image, int sound){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranlation;
        mImage = image;
        mSound = sound;
    }

    public Word (String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public boolean hasImage(){ return mImage != NO_IMAGE_PROVIDED;}

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImage(){return mImage;}

    public int getSound(){return mSound;}
}
