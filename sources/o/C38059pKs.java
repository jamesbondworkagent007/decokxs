package o;

import android.app.ActivityManager;
import com.okinc.lib.utils.OkUtils;

/* JADX INFO: renamed from: o.pKs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38059pKs {
    public static java.lang.String AEQbTJ = "";
    public static final java.lang.String KWHzl = "ProcessUtils";

    private C38059pKs() {
    }

    public static boolean KWHzl() {
        java.lang.String strOLrzqt = C38052pKl.OLrzqt();
        if (strOLrzqt == null) {
            return false;
        }
        try {
            return android.text.TextUtils.equals(strOLrzqt, copydefault());
        } catch (java.lang.Exception e) {
            OkUtils.AhwBna().copydefault(KWHzl, "isCurProcess", e);
            return false;
        }
    }

    public static java.lang.String copydefault() {
        int iMyPid;
        android.app.ActivityManager activityManagerEZpvd;
        java.lang.String str = AEQbTJ;
        if (str != null && !str.isEmpty()) {
            return AEQbTJ;
        }
        try {
            iMyPid = android.os.Process.myPid();
            activityManagerEZpvd = C38052pKl.EZpvd();
        } catch (java.lang.Exception e) {
            OkUtils.AhwBna().copydefault(KWHzl, "getCurProcessName", e);
        }
        if (activityManagerEZpvd == null) {
            OkUtils.AhwBna().KWHzl(KWHzl, "getCurProcessName: ActivityManager is null");
            return null;
        }
        java.util.List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManagerEZpvd.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            OkUtils.AhwBna().KWHzl(KWHzl, "getCurProcessName: getRunningAppProcesses returned null");
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == iMyPid) {
                java.lang.String str2 = runningAppProcessInfo.processName;
                AEQbTJ = str2;
                return str2;
            }
        }
        return null;
    }
}
