package com.udacity.gradle.ads;

import com.udacity.gradle.builditbigger.R;
import com.google.android.gms.ads.AdView;
import android.view.View;

public class RequestAd{

    public static AdView getAd(View root){
        AdView mAdView = (AdView) root.findViewById(R.id.adView);
        return mAdView;
    }

}