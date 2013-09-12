package com.budziq.codeclip;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.Set;

public class NotiClickedReceiver extends BroadcastReceiver {
    private static final String TAG = "NotiClickedReceiver";

    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "----------Clicky Clicky--------");
        Bundle bundle = intent.getExtras();
        if(bundle != null){
            Set<String> set = bundle.keySet();
            for(String s : set){
                Log.i(TAG, s);
                Log.i(TAG, bundle.getString(s));
            }
        }
        Log.i(TAG, "----------END END--------");
    }
}
