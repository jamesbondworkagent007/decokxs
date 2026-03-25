package o;

import android.app.ActivityManager;
import android.os.Build;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.okinc.base.utils.OkUtils;

/* JADX INFO: renamed from: o.myb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@java.lang.Deprecated
public class C33551myb {
    public static java.lang.String OLrzqt = "";

    public static boolean EZpvd(android.content.Context context) throws java.lang.Throwable {
        if (context == null) {
            return false;
        }
        return android.text.TextUtils.equals(context.getPackageName(), copydefault(context));
    }

    public static boolean copydefault() {
        return EZpvd(OkUtils.AEQbTJ());
    }

    public static void AEQbTJ() {
        android.os.Process.killProcess(android.os.Process.myPid());
    }

    public static java.lang.String copydefault(android.content.Context context) throws java.lang.Throwable {
        java.lang.String str = OLrzqt;
        if (str != null && !str.isEmpty()) {
            return OLrzqt;
        }
        int iMyPid = android.os.Process.myPid();
        if (Build.VERSION.SDK_INT >= 28) {
            OLrzqt = android.app.Application.getProcessName();
        } else {
            java.lang.String strEZpvd = EZpvd(iMyPid);
            if (android.text.TextUtils.isEmpty(strEZpvd)) {
                strEZpvd = KWHzl(context, iMyPid);
            }
            OLrzqt = strEZpvd;
        }
        return OLrzqt;
    }

    public static java.lang.String KWHzl(android.content.Context context, int i) {
        java.util.List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) context.getSystemService(MTCommonConstants.Lifecycle.KEY_ACTIVITY)).getRunningAppProcesses();
        if (runningAppProcesses == null || runningAppProcesses.size() <= 0) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == i) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:31|3|36|4|(5:5|(1:7)(1:39)|32|18|22)|8|32|18|22) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        o.pUU.AEQbTJ("tag", r7);
     */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0057: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:24:0x0057 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String EZpvd(int i) throws java.lang.Throwable {
        java.io.BufferedReader bufferedReader;
        java.io.BufferedReader bufferedReader2;
        java.lang.StringBuilder sb;
        java.io.BufferedReader bufferedReader3 = null;
        string = null;
        java.lang.String string = null;
        try {
            try {
                bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream("/proc/" + i + "/cmdline"), "iso-8859-1"));
            } catch (java.lang.Exception e) {
                e = e;
                bufferedReader = null;
            } catch (java.lang.Throwable th) {
                th = th;
                if (bufferedReader3 != null) {
                }
                throw th;
            }
            try {
                sb = new java.lang.StringBuilder();
            } catch (java.lang.Exception e2) {
                e = e2;
                pUU.AEQbTJ("tag", e);
                if (bufferedReader != null) {
                }
                return string;
            }
            while (true) {
                int i2 = bufferedReader.read();
                if (i2 <= 0) {
                    break;
                }
                sb.append((char) i2);
                bufferedReader.close();
                return string;
            }
            sb.trimToSize();
            string = sb.toString();
            bufferedReader.close();
            return string;
        } catch (java.lang.Throwable th2) {
            th = th2;
            bufferedReader3 = bufferedReader2;
            if (bufferedReader3 != null) {
                try {
                    bufferedReader3.close();
                } catch (java.io.IOException e3) {
                    pUU.AEQbTJ("tag", e3);
                }
            }
            throw th;
        }
    }
}
