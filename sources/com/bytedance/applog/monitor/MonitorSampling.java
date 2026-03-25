package com.bytedance.applog.monitor;

import com.bytedance.applog.log.IAppLogLogger;
import com.bytedance.applog.log.LoggerImpl;
import com.bytedance.bdtracker.a;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class MonitorSampling {
    public static final MonitorSampling INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f122a = 5;
    public static final String b;
    public static boolean c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        MonitorSampling monitorSampling = new MonitorSampling();
        INSTANCE = monitorSampling;
        String string = UUID.randomUUID().toString();
        Intrinsics.AEQbTJ(string, "");
        b = string;
        c = monitorSampling.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final int getSamplingPercent() {
        return f122a;
    }

    public static /* synthetic */ void samplingPercent$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void setSamplingPercent(int i) {
        if (i < 0 || i > 100) {
            i = 5;
        }
        f122a = i;
        c = INSTANCE.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean a() {
        int iAbs = Math.abs(b.hashCode() % 100);
        LoggerImpl.global().debug("MonitorSampling hash " + iAbs, new Object[0]);
        IAppLogLogger iAppLogLoggerGlobal = LoggerImpl.global();
        StringBuilder sbA = a.a("MonitorSampling samplingPercent ");
        sbA.append(f122a);
        iAppLogLoggerGlobal.debug(sbA.toString(), new Object[0]);
        return iAbs <= f122a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGlobalColdLaunchId$agent_liteGlobalRelease() {
        return b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSampling$agent_liteGlobalRelease() {
        return c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSampling$agent_liteGlobalRelease(boolean z) {
        c = z;
    }
}
