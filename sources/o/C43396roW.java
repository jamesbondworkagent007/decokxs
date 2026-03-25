package o;

import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import androidx.core.content.ContextCompat;
import com.engagelab.privates.common.constants.MTCommonConstants;

/* JADX INFO: renamed from: o.roW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C43396roW {
    public java.lang.String AEQbTJ;
    public boolean AYXKKw;
    public java.lang.String AhwBna;
    public android.content.BroadcastReceiver EZpvd;
    public android.content.Context KWHzl;
    public boolean OLrzqt;
    public boolean copydefault;
    public java.lang.String djBIcL;
    public final java.util.ArrayList<ActionBar> gEmmrt;
    public java.lang.String isConnected;
    public java.lang.String valueOf;

    /* JADX INFO: renamed from: o.roW$ActionBar */
    public interface ActionBar {
        void copydefault(java.lang.String str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AhwBna() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String gEmmrt() {
        return this.isConnected;
    }

    /* JADX INFO: renamed from: o.roW$Activity */
    public static class Activity {
        public static final C43396roW copydefault = new C43396roW();

        private Activity() {
        }
    }

    public static C43396roW EZpvd() {
        return Activity.copydefault;
    }

    private C43396roW() {
        this.djBIcL = "wifi";
        this.isConnected = "unknown";
        this.copydefault = false;
        this.AYXKKw = false;
        this.OLrzqt = false;
        this.AEQbTJ = "None_Network";
        this.gEmmrt = new java.util.ArrayList<>();
    }

    public void OLrzqt(android.content.Context context) {
        if (context == null) {
            throw new java.lang.IllegalStateException("Context can't be null");
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        if (this.KWHzl != null) {
            return;
        }
        this.KWHzl = context;
        this.EZpvd = new android.content.BroadcastReceiver() { // from class: o.roW.4
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context2, android.content.Intent intent) {
                try {
                    if (!isInitialStickyBroadcast() && "android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                        C43396roW.this.KWHzl(context2);
                        java.lang.String strAEQbTJ = C43396roW.this.AEQbTJ();
                        if ((!strAEQbTJ.equals("None_Network") && !strAEQbTJ.equalsIgnoreCase(C43396roW.this.AEQbTJ)) || C43396roW.this.copydefault != C43396roW.this.AYXKKw) {
                            java.util.Iterator<ActionBar> it = C43396roW.this.gEmmrt.iterator();
                            while (it.hasNext()) {
                                it.next().copydefault(strAEQbTJ);
                            }
                        }
                        C43396roW c43396roW = C43396roW.this;
                        c43396roW.AYXKKw = c43396roW.copydefault;
                        if (!strAEQbTJ.equals("None_Network")) {
                            C43396roW.this.AEQbTJ = strAEQbTJ;
                        }
                        android.net.NetworkInfo networkInfoEZpvd = C43396roW.this.EZpvd(context2);
                        C43396roW c43396roW2 = C43396roW.this;
                        c43396roW2.OLrzqt = c43396roW2.AEQbTJ(networkInfoEZpvd).booleanValue();
                        pUU.KWHzl("NetworkStateManager", "init sp=" + C43396roW.this.KWHzl() + " netType=" + C43396roW.this.valueOf + ", lastConnectedNetwork:" + C43396roW.this.AEQbTJ + ", currentNetwork:" + strAEQbTJ + ", isInVpn : " + C43396roW.this.copydefault + ", isLastInVpn :" + C43396roW.this.AYXKKw + ", isNetworkAvailable: " + C43396roW.this.OLrzqt);
                    }
                } catch (java.lang.Exception e) {
                    pUU.AEQbTJ("NetworkStateManager", e);
                }
            }
        };
        try {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            this.KWHzl.registerReceiver(this.EZpvd, intentFilter);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("NetworkStateManager", e);
        }
        KWHzl(this.KWHzl);
        this.AYXKKw = this.copydefault;
        this.OLrzqt = AEQbTJ(EZpvd(this.KWHzl)).booleanValue();
        pUU.KWHzl("NetworkStateManager", "init sp=" + KWHzl() + " netType=" + copydefault() + ", isInVpn : " + this.copydefault);
    }

    public final java.lang.String AEQbTJ() {
        try {
            android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) this.KWHzl.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                java.lang.String typeName = activeNetworkInfo.getTypeName();
                pUU.KWHzl("NetworkStateManager", "[detectCurrentNetwork] - Network name:" + typeName + " subType name: " + activeNetworkInfo.getSubtypeName());
                return typeName == null ? "None_Network" : typeName;
            }
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("NetworkStateManager", e);
        }
        return "None_Network";
    }

    public void EZpvd(ActionBar actionBar) {
        this.gEmmrt.add(actionBar);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IGET]}, finally: {[IGET, IPUT, IF, IGET, IPUT, IGET, IF] complete} */
    public void KWHzl(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager;
        java.lang.String str;
        this.AhwBna = "unknown";
        this.djBIcL = "wifi";
        this.valueOf = "unknown";
        C43453rpa c43453rpa = C43453rpa.AEQbTJ;
        this.copydefault = c43453rpa.OLrzqt();
        this.isConnected = c43453rpa.EZpvd();
        try {
            connectivityManager = (android.net.ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        } catch (java.lang.Throwable th) {
            try {
                pUU.valueOf("NetworkStateManager", "getNetType fail=" + th);
                if (this.AhwBna == null) {
                    this.AhwBna = "unknown";
                }
                if (this.valueOf != null) {
                    return;
                }
            } finally {
                if (this.AhwBna == null) {
                    this.AhwBna = "unknown";
                }
                if (this.valueOf == null) {
                    this.valueOf = "unknown";
                }
            }
        }
        if (connectivityManager == null) {
            if (str == null) {
                return;
            } else {
                return;
            }
        }
        android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            if (this.AhwBna == null) {
                this.AhwBna = "unknown";
            }
            if (this.valueOf == null) {
                this.valueOf = "unknown";
                return;
            }
            return;
        }
        if (activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()) {
            if (activeNetworkInfo.getType() == 1) {
                this.djBIcL = "wifi";
                this.valueOf = "wifi";
            } else if (activeNetworkInfo.getType() == 0) {
                java.lang.String strCopydefault = copydefault(context);
                this.AhwBna = strCopydefault;
                this.djBIcL = copydefault(strCopydefault);
                int subtype = activeNetworkInfo.getSubtype();
                if (subtype == 13) {
                    this.valueOf = MTCommonConstants.Network.NAME_4G;
                    if (this.AhwBna == null) {
                        this.AhwBna = "unknown";
                        return;
                    }
                    return;
                }
                if (subtype != 15) {
                    if (subtype == 20) {
                        this.valueOf = MTCommonConstants.Network.NAME_5G;
                        if (this.AhwBna == null) {
                            this.AhwBna = "unknown";
                            return;
                        }
                        return;
                    }
                    switch (subtype) {
                        case 0:
                            if (this.AhwBna == null) {
                                this.AhwBna = "unknown";
                            }
                            if (this.valueOf == null) {
                                this.valueOf = "unknown";
                                return;
                            }
                            return;
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            this.valueOf = MTCommonConstants.Network.NAME_2G;
                            if (this.AhwBna == null) {
                                this.AhwBna = "unknown";
                                return;
                            }
                            return;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                            break;
                        default:
                            this.valueOf = java.lang.String.valueOf(activeNetworkInfo.getSubtype());
                            break;
                    }
                }
                this.valueOf = MTCommonConstants.Network.NAME_3G;
                if (this.AhwBna == null) {
                    this.AhwBna = "unknown";
                    return;
                }
                return;
            }
            if (this.AhwBna == null) {
                this.AhwBna = "unknown";
            }
            if (this.valueOf != null) {
                return;
            }
            this.valueOf = "unknown";
            return;
        }
        if (this.AhwBna == null) {
            this.AhwBna = "unknown";
        }
        if (this.valueOf == null) {
            this.valueOf = "unknown";
        }
    }

    public static java.lang.String copydefault(android.content.Context context) {
        try {
            if (ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") != 0) {
                return "UNKNOW";
            }
            java.lang.String simOperator = ((TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)).getSimOperator();
            return !android.text.TextUtils.isEmpty(simOperator) ? simOperator : "UNKNOW";
        } catch (java.lang.Throwable th) {
            pUU.valueOf("NetworkStateManager", "getCellSP fail=" + th);
            return "UNKNOW";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String copydefault(java.lang.String str) {
        byte b;
        if (android.text.TextUtils.isEmpty(str) || "UNKNOW".equals(str)) {
            return "wifi";
        }
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != 49679502) {
            switch (iHashCode) {
                case 49679470:
                    b = !str.equals("46000") ? (byte) -1 : (byte) 0;
                    break;
                case 49679471:
                    if (str.equals("46001")) {
                        b = 1;
                        break;
                    }
                    break;
                case 49679472:
                    if (str.equals("46002")) {
                        b = 2;
                        break;
                    }
                    break;
                case 49679473:
                    if (str.equals("46003")) {
                        b = 3;
                        break;
                    }
                    break;
                default:
                    switch (iHashCode) {
                        case 49679475:
                            if (str.equals("46005")) {
                                b = 4;
                                break;
                            }
                            break;
                        case 49679476:
                            if (str.equals("46006")) {
                                b = 5;
                                break;
                            }
                            break;
                        case 49679477:
                            if (str.equals("46007")) {
                                b = 6;
                                break;
                            }
                            break;
                    }
                    break;
            }
        } else if (str.equals("46011")) {
            b = 7;
        }
        switch (b) {
            case 0:
            case 2:
            case 6:
                return "cn-mobile";
            case 1:
            case 5:
                return "cn-unicom";
            case 3:
            case 4:
            case 7:
                return "cn-telecom";
            default:
                return str;
        }
    }

    public java.lang.String OLrzqt() {
        return this.valueOf + "_" + this.AhwBna + (this.copydefault ? "_vpn" : "");
    }

    public java.lang.Boolean AYXKKw() {
        return java.lang.Boolean.valueOf(this.OLrzqt);
    }

    public final android.net.NetworkInfo EZpvd(android.content.Context context) {
        try {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
            if (connectivityManager != null) {
                return connectivityManager.getActiveNetworkInfo();
            }
            return null;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Boolean AEQbTJ(android.net.NetworkInfo networkInfo) {
        boolean z;
        if (networkInfo != null) {
            try {
                z = networkInfo.isAvailable();
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                return java.lang.Boolean.FALSE;
            }
        }
        return java.lang.Boolean.valueOf(z);
    }
}
