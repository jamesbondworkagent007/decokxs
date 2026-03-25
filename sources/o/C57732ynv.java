package o;

import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import com.google.android.gms.common.GoogleApiAvailability;
import com.huawei.hms.api.ConnectionResult;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;

/* JADX INFO: renamed from: o.ynv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57732ynv {
    public static boolean KWHzl() {
        C57733ynw c57733ynwEZpvd = C57791ypA.Companion.EZpvd(OneSignal.AEQbTJ, "com.google.android.gms", 128);
        if (!c57733ynwEZpvd.EZpvd() || c57733ynwEZpvd.OLrzqt() == null) {
            return false;
        }
        return !((java.lang.String) c57733ynwEZpvd.OLrzqt().applicationInfo.loadLabel(OneSignal.AEQbTJ.getPackageManager())).equals("Market");
    }

    public static void AEQbTJ() {
        if (OSUtils.DbNXlk() && KWHzl() && !OneSignal.zLjUOn() && !C57834ypr.AEQbTJ(C57834ypr.copydefault, "GT_DO_NOT_SHOW_MISSING_GPS", false)) {
            OSUtils.EZpvd(new java.lang.Runnable() { // from class: o.ynv.2
                @Override // java.lang.Runnable
                public void run() {
                    final android.app.Activity newProxyInstance = OneSignal.getNewProxyInstance();
                    if (newProxyInstance == null) {
                        return;
                    }
                    java.lang.String strAEQbTJ = OSUtils.AEQbTJ(newProxyInstance, "onesignal_gms_missing_alert_text", "To receive push notifications please press 'Update' to enable 'Google Play services'.");
                    java.lang.String strAEQbTJ2 = OSUtils.AEQbTJ(newProxyInstance, "onesignal_gms_missing_alert_button_update", "Update");
                    java.lang.String strAEQbTJ3 = OSUtils.AEQbTJ(newProxyInstance, "onesignal_gms_missing_alert_button_skip", "Skip");
                    new AlertDialog.Builder(newProxyInstance).setMessage(strAEQbTJ).setPositiveButton(strAEQbTJ2, new DialogInterface.OnClickListener() { // from class: o.ynv.2.2
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(android.content.DialogInterface dialogInterface, int i) {
                            C57732ynv.copydefault(newProxyInstance);
                        }
                    }).setNegativeButton(strAEQbTJ3, new DialogInterface.OnClickListener() { // from class: o.ynv.2.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(android.content.DialogInterface dialogInterface, int i) {
                            C57834ypr.KWHzl(C57834ypr.copydefault, "GT_DO_NOT_SHOW_MISSING_GPS", true);
                        }
                    }).setNeutralButton(OSUtils.AEQbTJ(newProxyInstance, "onesignal_gms_missing_alert_button_close", "Close"), (DialogInterface.OnClickListener) null).create().show();
                }
            });
        }
    }

    public static void copydefault(android.app.Activity activity) {
        try {
            GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
            android.app.PendingIntent errorResolutionPendingIntent = googleApiAvailability.getErrorResolutionPendingIntent(activity, googleApiAvailability.isGooglePlayServicesAvailable(OneSignal.AEQbTJ), ConnectionResult.NETWORK_ERROR);
            if (errorResolutionPendingIntent != null) {
                errorResolutionPendingIntent.send();
            }
        } catch (PendingIntent.CanceledException e) {
            e.printStackTrace();
        }
    }
}
