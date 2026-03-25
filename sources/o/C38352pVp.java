package o;

import android.app.ActivityManager;
import com.engagelab.privates.common.constants.MTCommonConstants;

/* JADX INFO: renamed from: o.pVp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C38352pVp {
    public static java.lang.String EZpvd = "";

    public static java.lang.String EZpvd(android.content.Context context) throws java.lang.Throwable {
        java.lang.String str = EZpvd;
        if (str != null && !str.isEmpty()) {
            return EZpvd;
        }
        int iMyPid = android.os.Process.myPid();
        if (C38355pVs.copydefault.OLrzqt() >= 28) {
            EZpvd = android.app.Application.getProcessName();
        } else {
            java.lang.String strKWHzl = KWHzl(iMyPid);
            if (android.text.TextUtils.isEmpty(strKWHzl)) {
                strKWHzl = EZpvd(context, iMyPid);
            }
            EZpvd = strKWHzl;
        }
        return EZpvd;
    }

    public static java.lang.String EZpvd(android.content.Context context, int i) {
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

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|38|3|(2:31|4)|(5:5|(1:7)(1:40)|34|18|22)|8|34|18|22|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        android.util.Log.getStackTraceString(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String KWHzl(int i) throws java.lang.Throwable {
        java.io.BufferedReader bufferedReader;
        java.lang.StringBuilder sb;
        java.io.BufferedReader bufferedReader2 = null;
        string = null;
        java.lang.String string = null;
        try {
            bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream("/proc/" + i + "/cmdline"), "iso-8859-1"));
        } catch (java.lang.Exception e) {
            e = e;
            bufferedReader = null;
        } catch (java.lang.Throwable th) {
            th = th;
            if (bufferedReader2 != null) {
            }
            throw th;
        }
        try {
            try {
                sb = new java.lang.StringBuilder();
            } catch (java.lang.Throwable th2) {
                th = th2;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (java.io.IOException e2) {
                        android.util.Log.getStackTraceString(e2);
                    }
                }
                throw th;
            }
        } catch (java.lang.Exception e3) {
            e = e3;
            android.util.Log.getStackTraceString(e);
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
    }
}
