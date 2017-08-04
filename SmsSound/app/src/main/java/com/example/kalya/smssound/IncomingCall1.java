package com.example.kalya.smssound;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.widget.Toast;

/**
 * Created by kalya on 08-Jul-17.
 */

public class IncomingCall1 extends BroadcastReceiver {
    private NotificationManager notificationManager;
    private Notification myNotification;
    private final String myBlog = "http://niravranpara.blogspot.com/";
    @Override
    public void onReceive(Context context, Intent intent) {
       Intent a = new Intent(context, MyService.class);
        Toast.makeText(context,"workin",Toast.LENGTH_LONG).show();
        Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        Ringtone r = RingtoneManager.getRingtone(context, notification);
        r.play();
        /**  ComponentName reciever = new ComponentName(context,MainActivity.class);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(reciever,PackageManager.COMPONENT_ENABLED_STATE_DEFAULT,PackageManager.DONT_KILL_APP);
        final MediaPlayer mp = MediaPlayer.create(context,R.raw.the);
        mp.start();**/

        context.startService(a);
        /**if (intent.getStringExtra(TelephonyManager.EXTRA_STATE).equals(TelephonyManager.EXTRA_STATE_RINGING)){
            String incomingNumber = intent.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER);
            Toast.makeText(context,"call from:"+incomingNumber,Toast.LENGTH_LONG).show();
            if ("+919182717744".equals(incomingNumber)){
                Intent a = new Intent(context, MyService.class);
                context.startService(a);
            }
            if ("+918309579985".equals(incomingNumber)){
                Intent a = new Intent(context, MyService.class);
                context.stopService(a);
            }
        }**/

        /**try {
            TelephonyManager tmgr =  (TelephonyManager)context.getSystemService(Context.TELEPHONY_SERVICE);
            MyPhoneStateListner PhoneListner = new MyPhoneStateListner();
            tmgr.listen(PhoneListner, PhoneStateListener.LISTEN_CALL_STATE);
        }catch (Exception e){
            Log.e("Phone Reciever Error"," "+ e);
        }**/
    }
    /**private class MyPhoneStateListner extends PhoneStateListener{
        public void OnCallStateChanged(int state,String incomingNumber){
            Log.d("MyPhoneStateListner",state+"incoming no:"+incomingNumber);
            if (state == 1){
                String msg = "New Phone call Event.incoming Number:"+incomingNumber;
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(this,msg,duration);
                toast.show();
            }
        }
    }**/
}
