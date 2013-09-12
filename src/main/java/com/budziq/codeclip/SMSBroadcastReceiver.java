package com.budziq.codeclip;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.util.Log;
import java.lang.String;
import java.util.Set;

import android.telephony.SmsMessage;

public class SMSBroadcastReceiver extends BroadcastReceiver {
    private static final String TAG = "SMSBroadcastReceiver";

    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "--- sms received! ---");
        Bundle bundle = intent.getExtras();
        if (bundle != null)
            handleMessage(context, bundle);
    }

    private void handleMessage(Context context, Bundle bundle){
        Set<String> set = bundle.keySet();
        for(String s : set){
            Log.i(TAG, s);
        }

        Intent intent = new Intent("com.budziq.codeclip.noticlicked");
        intent.putExtra("test_key", "test values 1234");
        PendingIntent pIntent = PendingIntent.getBroadcast(context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(context)
                        .setSmallIcon(R.drawable.ic_launcher)
                        .setContentTitle("My notification")
                        .setContentText("Hello World!")
                        .setContentIntent(pIntent);
        /*
        PendingIntent resultPendingIntent;
        ...
        mBuilder.setContentIntent(resultPendingIntent);
        */
        NotificationManager mNotifyMgr;
        mNotifyMgr = (NotificationManager) context.getSystemService(context.NOTIFICATION_SERVICE);
        // Builds the notification and issues it.
        mNotifyMgr.notify(0, mBuilder.build());
    }
}
