package o;

import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class LE {
    public static final java.lang.String AEQbTJ(android.content.Context context) {
        android.content.pm.PackageInfo packageInfo;
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0)) != null) {
                return packageInfo.versionName;
            }
        } catch (java.lang.Exception unused) {
        }
        return null;
    }

    public static final java.lang.String copydefault(android.content.Context context) {
        try {
            java.lang.Object systemService = context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
            if (telephonyManager != null) {
                return telephonyManager.getNetworkOperatorName();
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
