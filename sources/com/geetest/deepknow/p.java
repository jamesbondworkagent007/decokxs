package com.geetest.deepknow;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes21.dex */
public class p {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static String a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return "$unknown";
            }
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
            if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
                return "WIFI";
            }
            if (networkInfo == null) {
                return "$unknown";
            }
            NetworkInfo.State state = networkInfo.getState();
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (state == null || activeNetworkInfo == null) {
                return "$unknown";
            }
            switch (activeNetworkInfo.getSubtype()) {
                case 1:
                    return "GPRS";
                case 2:
                    return "EDGE";
                case 3:
                    return "UMTS";
                case 4:
                    return "CDMA";
                case 5:
                    return "EVDO_0";
                case 6:
                    return "EVDO_A";
                case 7:
                    return "1xRTT";
                case 8:
                    return "HSDPA";
                case 9:
                    return "HSUPA";
                case 10:
                    return "HSPA";
                case 11:
                    return "IDEN";
                case 12:
                    return "EVDO_B";
                case 13:
                    return "LTE";
                case 14:
                    return "EHRPD";
                case 15:
                    return "HSPAP";
                default:
                    return "$unknown";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "$unknown";
        }
    }
}
