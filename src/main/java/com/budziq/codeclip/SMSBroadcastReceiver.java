package com.budziq.codeclip;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.lang.String;
import java.util.Set;

import android.telephony.SmsMessage;

public class SMSBroadcastReceiver extends BroadcastReceiver {
    private static final String TAG = "SMSBroadcastReceiver";
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "--- sms received! ---");
        Bundle bundle = intent.getExtras();
        Set<String> set = bundle.keySet();
        for(String s : set){
            Log.i(TAG, s);
        }

    }
}
