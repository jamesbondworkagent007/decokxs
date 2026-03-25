package com.bytedance.bdtracker;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.applog.log.LoggerImpl;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import o.C59449zhJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class p2 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(m2 m2Var, @NotNull String str, String str2, long j) {
        u2 s2Var;
        Intrinsics.EZpvd((Object) str, "");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int iHashCode = str.hashCode();
        if (iHashCode != -73212100) {
            s2Var = (iHashCode == 270071285 && str.equals("sdk_init")) ? new e3(jElapsedRealtime - j) : null;
        } else if (str.equals("api_usage")) {
            s2Var = new s2(str2, jElapsedRealtime - j);
        }
        if (s2Var == null || m2Var == null) {
            return;
        }
        ((r2) m2Var).a(s2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void a(m2 m2Var, @NotNull Throwable th) {
        Intrinsics.EZpvd((Object) th, "");
        if (m2Var != null) {
            ((r2) m2Var).a(new x2(th));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void b(m2 m2Var, @NotNull Throwable th) {
        Intrinsics.EZpvd((Object) th, "");
        try {
            StackTraceElement[] stackTrace = th.getStackTrace();
            Intrinsics.AEQbTJ(stackTrace, "");
            for (StackTraceElement stackTraceElement : stackTrace) {
                String string = stackTraceElement.toString();
                Intrinsics.AEQbTJ(string, "");
                if (C59449zhJ.startsWith$default(string, "com.bytedance.applog", false, 2, null) || C59449zhJ.startsWith$default(string, "com.bytedance.bdtracker", false, 2, null)) {
                    if (m2Var != null) {
                        ((r2) m2Var).a(new d3(th));
                        return;
                    }
                    return;
                }
            }
        } catch (Throwable th2) {
            LoggerImpl.global().error("TraceSDKError hasAppLog err", th2, new Object[0]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static final void a(m2 m2Var, long j, String str, int i) {
        if (str == null) {
            str = "";
        }
        y2 y2Var = new y2(j, str, 1L);
        y2Var.f306a = i;
        if (m2Var != null) {
            ((r2) m2Var).a(y2Var);
        }
    }

    public static final void a(m2 m2Var, @NotNull URL url, long j, int i, String str) {
        String[] strArrSplit;
        String str2 = "";
        Intrinsics.EZpvd((Object) url, "");
        if (m2Var != null) {
            if (url == null || TextUtils.isEmpty(url.getPath()) || !url.getPath().startsWith("/simulator/")) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                c3 c3Var = new c3();
                c3Var.e = jElapsedRealtime - j;
                int i2 = 1;
                if (url != null) {
                    String path = url.getPath();
                    if (!TextUtils.isEmpty(path)) {
                        str2 = (!path.contains("/") || (strArrSplit = url.getPath().split("/")) == null || strArrSplit.length <= 0) ? path : strArrSplit[strArrSplit.length - 1];
                    }
                }
                c3Var.d = str2;
                if (i != 200) {
                    c3Var.b = Integer.valueOf(i);
                    c3Var.c = str;
                    i2 = 0;
                }
                c3Var.f144a = i2;
                ((r2) m2Var).a(c3Var);
            }
        }
    }
}
