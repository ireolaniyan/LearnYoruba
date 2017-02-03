package com.ireolaniyan.learnyoruba;


/**
 * Created by Ire Olaniyan on 1/25/2017.
 */

public class Words {
    private String mYorubaTranslation;
    private String mDefaultTranslation;
//    private static final int NO_IMAGE_PROVIDED = -1;
//    private int mImageResourceId = NO_IMAGE_PROVIDED;

   /* // Use this constructor when you want to add images.

        ** public Words(String yorubaTranslation, String defaultTranslation, int imageResourceId) {
            mYorubaTranslation = yorubaTranslation;
            mDefaultTranslation = defaultTranslation;
            mImageResourceId = imageResourceId;
        }

*/
    public Words(String yorubaTranslation, String defaultTranslation) {
        mYorubaTranslation = yorubaTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    public String getYorubaTranslation() {
        return mYorubaTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

//    public int getImageResourceId() {
//        return mImageResourceId;
//    }

//    public boolean hasImage() {
//        return mImageResourceId != NO_IMAGE_PROVIDED;
//    }
}
