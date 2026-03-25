package com.immomo.mls.util;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.Log;
import androidx.autofill.HintConstants;
import androidx.core.content.ContextCompat;
import com.engagelab.privates.common.constants.MTCommonConstants;
import o.C7859arl;
import o.C7870arw;
import o.pUU;

/* JADX INFO: loaded from: classes14.dex */
public class NetworkUtil {
    public static C7859arl AEQbTJ;

    /* JADX INFO: loaded from: classes22.dex */
    public enum NetworkType {
        NETWORK_NONE("none"),
        NETWORK_2G(MTCommonConstants.Network.NAME_2G),
        NETWORK_3G(MTCommonConstants.Network.NAME_3G),
        NETWORK_4G(MTCommonConstants.Network.NAME_4G),
        NETWORK_WIFI("wifi"),
        NETWORK_UNKNOWN("unknown");

        String type;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getType() {
            return this.type;
        }

        NetworkType(String str) {
            this.type = str;
        }
    }

    public static void KWHzl(Context context, C7859arl.StateListAnimator stateListAnimator) {
        synchronized (NetworkUtil.class) {
            if (context != null) {
                if (AEQbTJ == null) {
                    AEQbTJ = new C7859arl();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.ACTION_SHUTDOWN");
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    try {
                        context.getApplicationContext().registerReceiver(AEQbTJ, intentFilter);
                    } catch (Exception e) {
                        pUU.copydefault("mln", Log.getStackTraceString(e));
                    }
                }
                AEQbTJ.copydefault(stateListAnimator);
            }
        }
    }

    public static void AEQbTJ(Context context, C7859arl.StateListAnimator stateListAnimator) {
        synchronized (NetworkUtil.class) {
            if (context != null) {
                C7859arl c7859arl = AEQbTJ;
                if (c7859arl != null) {
                    try {
                        c7859arl.EZpvd(stateListAnimator);
                        if (AEQbTJ.OLrzqt() == 0) {
                            context.getApplicationContext().unregisterReceiver(AEQbTJ);
                            AEQbTJ = null;
                        }
                    } catch (Exception e) {
                        pUU.copydefault("mln", Log.getStackTraceString(e));
                    }
                }
            }
        }
    }

    public static NetworkType copydefault(Context context) {
        TelephonyManager telephonyManager;
        try {
            if (!KWHzl(context)) {
                return NetworkType.NETWORK_NONE;
            }
            if (EZpvd(context)) {
                return NetworkType.NETWORK_WIFI;
            }
            try {
                telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            } catch (Exception e) {
                C7870arw.EZpvd("NetworkUtil", e);
                telephonyManager = null;
            }
            if (telephonyManager == null) {
                return NetworkType.NETWORK_NONE;
            }
            if (ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") != 0) {
                return NetworkType.NETWORK_UNKNOWN;
            }
            switch (telephonyManager.getNetworkType()) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return NetworkType.NETWORK_2G;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return NetworkType.NETWORK_3G;
                case 13:
                    return NetworkType.NETWORK_4G;
                default:
                    return NetworkType.NETWORK_UNKNOWN;
            }
        } catch (Exception e2) {
            pUU.copydefault("mln", Log.getStackTraceString(e2));
            return NetworkType.NETWORK_UNKNOWN;
        }
    }

    public static boolean KWHzl(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManagerOLrzqt = OLrzqt(context);
            if (connectivityManagerOLrzqt != null && (activeNetworkInfo = connectivityManagerOLrzqt.getActiveNetworkInfo()) != null) {
                return activeNetworkInfo.isAvailable();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean AEQbTJ(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManagerOLrzqt = OLrzqt(context);
            if (connectivityManagerOLrzqt != null && (activeNetworkInfo = connectivityManagerOLrzqt.getActiveNetworkInfo()) != null && activeNetworkInfo.isAvailable()) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean EZpvd(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManagerOLrzqt = OLrzqt(context);
        return (connectivityManagerOLrzqt == null || (activeNetworkInfo = connectivityManagerOLrzqt.getActiveNetworkInfo()) == null || !activeNetworkInfo.getTypeName().equals("WIFI")) ? false : true;
    }

    public static ConnectivityManager OLrzqt(Context context) {
        try {
            return (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        } catch (Exception unused) {
            return null;
        }
    }
}
