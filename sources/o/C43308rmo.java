package o;

import android.app.ActivityManager;
import android.os.Build;
import com.engagelab.privates.common.constants.MTCommonConstants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rmo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43308rmo {
    public static java.lang.String EZpvd;

    public static final java.lang.String copydefault(@NotNull android.content.Context context) throws java.lang.Throwable {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.String str = EZpvd;
        if (str != null) {
            return str;
        }
        java.lang.String strEZpvd = EZpvd(context);
        if (strEZpvd == null) {
            return null;
        }
        EZpvd = strEZpvd;
        return strEZpvd;
    }

    public static final java.lang.String EZpvd(@NotNull android.content.Context context) throws java.lang.Throwable {
        Intrinsics.checkNotNullParameter(context, "");
        int iMyPid = android.os.Process.myPid();
        if (Build.VERSION.SDK_INT >= 28) {
            return android.app.Application.getProcessName();
        }
        java.lang.String strOLrzqt = OLrzqt(iMyPid);
        return android.text.TextUtils.isEmpty(strOLrzqt) ? copydefault(context, iMyPid) : strOLrzqt;
    }

    public static final java.lang.String copydefault(android.content.Context context, int i) {
        java.lang.Object systemService = context.getSystemService(MTCommonConstants.Lifecycle.KEY_ACTIVITY);
        Intrinsics.copydefault(systemService, "");
        java.util.List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) systemService).getRunningAppProcesses();
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

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|33|3|31|4|(5:5|(1:7)(1:35)|29|21|25)|8|29|21|25|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        r6.printStackTrace();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String OLrzqt(int i) throws java.lang.Throwable {
        java.io.BufferedReader bufferedReader;
        java.lang.StringBuilder sb;
        java.io.BufferedReader bufferedReader2 = null;
        string = null;
        java.lang.String string = null;
        try {
            bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream("/proc/" + i + "/cmdline"), "iso-8859-1"));
        } catch (java.lang.Exception unused) {
            bufferedReader = null;
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            sb = new java.lang.StringBuilder();
        } catch (java.lang.Exception unused2) {
            if (bufferedReader != null) {
            }
            return string;
        } catch (java.lang.Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (java.io.IOException e) {
                    e.printStackTrace();
                }
            }
            throw th;
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

    public static final boolean EZpvd(@NotNull android.content.Context context, java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        return Intrinsics.EZpvd((java.lang.Object) context.getPackageName(), (java.lang.Object) str);
    }

    public static final boolean KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return Intrinsics.EZpvd((java.lang.Object) context.getPackageName(), (java.lang.Object) copydefault(context));
    }

    public static final boolean OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object systemService = context.getSystemService(MTCommonConstants.Lifecycle.KEY_ACTIVITY);
        Intrinsics.copydefault(systemService, "");
        java.util.List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses == null || runningAppProcesses.size() <= 0) {
            return false;
        }
        java.util.Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
        while (it.hasNext()) {
            int i = it.next().importance;
            if (i == 200 || i == 100) {
                return true;
            }
        }
        return false;
    }
}
