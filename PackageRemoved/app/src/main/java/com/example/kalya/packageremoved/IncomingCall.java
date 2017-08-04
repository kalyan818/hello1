package com.example.kalya.packageremoved;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by kalya on 04-Aug-17.
 */

public class IncomingCall extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"working",Toast.LENGTH_LONG).show();
        if (intent.equals("android")){
            Toast.makeText(context,"working",Toast.LENGTH_LONG).show();
        }
    }
}
