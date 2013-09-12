package com.budziq.codeclip;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class NotiClickedReceiver extends BroadcastReceiver {
    private static final String TAG = "NotiClickedReceiver";

    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "----------Clicky Clicky--------");
    }
}
