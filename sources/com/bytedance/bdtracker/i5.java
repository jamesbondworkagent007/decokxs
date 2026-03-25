package com.bytedance.bdtracker;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.reown.android.pulse.model.ConnectionMethod;

/* JADX INFO: loaded from: classes2.dex */
public class i5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f192a = 0;
    public static a b = a.UNKNOWN;
    public static boolean c = false;

    public enum a {
        UNKNOWN(-1),
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5),
        MOBILE_5G(6),
        WIFI_24GHZ(7),
        WIFI_5GHZ(8),
        MOBILE_3G_H(9),
        MOBILE_3G_HP(10);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f193a;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        a(int i) {
            this.f193a = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean a() {
            return (this == UNKNOWN || this == NONE) ? false : true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static a a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (1 == type) {
                    return a.WIFI;
                }
                if (type != 0) {
                    return a.MOBILE;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
                if (telephonyManager == null) {
                    return a.NONE;
                }
                int networkType = telephonyManager.getNetworkType();
                if (networkType != 3) {
                    if (networkType == 20) {
                        return a.MOBILE_5G;
                    }
                    if (networkType != 5 && networkType != 6) {
                        switch (networkType) {
                            case 8:
                            case 9:
                            case 10:
                                break;
                            default:
                                switch (networkType) {
                                    case 12:
                                    case 14:
                                    case 15:
                                        break;
                                    case 13:
                                        return a.MOBILE_4G;
                                    default:
                                        return a.MOBILE;
                                }
                                break;
                        }
                    }
                }
                return a.MOBILE_3G;
            }
            return a.NONE;
        } catch (Throwable unused) {
            return a.MOBILE;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String a(Context context, boolean z) {
        a aVarB = b(context, z);
        return aVarB == a.WIFI ? "wifi" : aVarB == a.WIFI_24GHZ ? "wifi24ghz" : aVarB == a.WIFI_5GHZ ? "wifi5ghz" : aVarB == a.MOBILE_2G ? MTCommonConstants.Network.NAME_2G : aVarB == a.MOBILE_3G ? MTCommonConstants.Network.NAME_3G : aVarB == a.MOBILE_3G_H ? "3gh" : aVarB == a.MOBILE_3G_HP ? "3ghp" : aVarB == a.MOBILE_4G ? MTCommonConstants.Network.NAME_4G : aVarB == a.MOBILE_5G ? MTCommonConstants.Network.NAME_5G : aVarB == a.MOBILE ? ConnectionMethod.MOBILE : "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static a b(Context context, boolean z) {
        if (!c && context != null) {
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
                intentFilter.addAction("android.net.wifi.STATE_CHANGE");
                context.getApplicationContext().registerReceiver(new r3(), intentFilter);
            } finally {
                try {
                } finally {
                }
            }
        }
        if (b == a.UNKNOWN) {
            b = a(context);
        }
        if (z && System.currentTimeMillis() - f192a > 2000) {
            b = a(context);
            f192a = System.currentTimeMillis();
        }
        return b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean b(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
