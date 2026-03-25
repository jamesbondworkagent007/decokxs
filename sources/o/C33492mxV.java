package o;

import androidx.appcompat.app.AppCompatDelegate;
import com.okinc.core.util.SPUtils;

/* JADX INFO: renamed from: o.mxV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33492mxV {
    public static final boolean KWHzl() {
        return (C32979mnm.EZpvd.OLrzqt().getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (r0.equals("nightYes") == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean OLrzqt() {
        java.lang.String string = "";
        int defaultNightMode = AppCompatDelegate.getDefaultNightMode();
        if (defaultNightMode == -1) {
            return KWHzl();
        }
        if (defaultNightMode == 1) {
            return false;
        }
        if (defaultNightMode != 2) {
            try {
                string = SPUtils.getString("nightModeV2Sp", "");
            } catch (java.lang.ClassCastException unused) {
            }
            if (string != null) {
                int iHashCode = string.hashCode();
                if (iHashCode != -859015132) {
                    if (iHashCode != 182607791) {
                        if (iHashCode == 1945552889 && string.equals("nightNo")) {
                            return false;
                        }
                    }
                } else if (string.equals("nightFollowSys")) {
                    return KWHzl();
                }
            }
            try {
                return SPUtils.getBoolean("nightModeSp", false);
            } catch (java.lang.ClassCastException unused2) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:31|4|(2:6|(2:8|(2:10|(1:16))(3:17|(0)|24))(3:20|(0)|25))|29|22|(1:24)(1:25)) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int EZpvd() {
        java.lang.String string = "";
        int defaultNightMode = AppCompatDelegate.getDefaultNightMode();
        if (defaultNightMode != -100) {
            return defaultNightMode;
        }
        try {
            string = SPUtils.getString("nightModeV2Sp", "");
        } catch (java.lang.ClassCastException unused) {
        }
        if (string != null) {
            int iHashCode = string.hashCode();
            if (iHashCode == -859015132) {
                if (!string.equals("nightFollowSys")) {
                }
            }
            if (iHashCode == 182607791) {
                if (!string.equals("nightYes")) {
                }
            }
            if (iHashCode == 1945552889 && string.equals("nightNo")) {
                return 1;
            }
        }
        return SPUtils.getBoolean("nightModeSp", false) ? 2 : -1;
    }

    public static final void djBIcL() {
        SPUtils.put("nightModeV2Sp", "nightFollowSys");
        AppCompatDelegate.setDefaultNightMode(-1);
    }

    public static final void copydefault() {
        SPUtils.put("nightModeV2Sp", "nightYes");
        AppCompatDelegate.setDefaultNightMode(2);
    }

    public static final void AEQbTJ() {
        SPUtils.put("nightModeV2Sp", "nightNo");
        AppCompatDelegate.setDefaultNightMode(1);
    }
}
