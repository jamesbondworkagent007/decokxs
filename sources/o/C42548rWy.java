package o;

import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rWy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C42548rWy {
    public static boolean KWHzl;
    public static long OLrzqt;
    public static long djBIcL;
    public static final C42548rWy AEQbTJ = new C42548rWy();
    public static final java.util.HashMap<java.lang.String, java.lang.Long> gEmmrt = new LinkedHashMap();
    public static final ConcurrentHashMap<java.lang.String, kotlin.Pair<java.lang.Long, java.lang.Boolean>> AYXKKw = new ConcurrentHashMap<>();
    public static final InterfaceC56387yDm EZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.rWD
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C42548rWy.OLrzqt();
        }
    });
    public static final int copydefault = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return KWHzl;
    }

    private C42548rWy() {
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        gEmmrt.put(str, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
    }

    public final void AEQbTJ(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        final long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        gEmmrt().post(new java.lang.Runnable() { // from class: o.rWG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C42548rWy.EZpvd(str, jElapsedRealtime);
            }
        });
    }

    public static final void EZpvd(java.lang.String str, long j) {
        gEmmrt.put(str, java.lang.Long.valueOf(j));
    }

    public final android.os.Handler gEmmrt() {
        return (android.os.Handler) EZpvd.getValue();
    }

    public static final android.os.Handler OLrzqt() {
        return new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public final long AkhnZx() {
        java.util.HashMap<java.lang.String, java.lang.Long> map = gEmmrt;
        java.lang.Long l = map.get("launch_start");
        OLrzqt = l != null ? l.longValue() : 0L;
        java.lang.Long l2 = map.get("activity_end");
        djBIcL = l2 != null ? l2.longValue() : 0L;
        long j = OLrzqt;
        if (j > 0) {
            long j2 = djBIcL;
            if (j2 > 0 && j < j2) {
                return j2 - j;
            }
        }
        OLrzqt = 0L;
        djBIcL = 0L;
        return 0L;
    }

    public final long copydefault() {
        return AEQbTJ("application_attach_base_context_start", "application_attach_base_context_end");
    }

    public final long AhwBna() {
        return AEQbTJ("application_create_start", "application_create_end");
    }

    public final long djBIcL() {
        return AEQbTJ("application_attach_base_context_end", "application_create_start");
    }

    public final long EZpvd() {
        return AEQbTJ("application_create_end", "activity_end");
    }

    public final long DbNXlk() {
        return AEQbTJ("first_activity_start", "activity_end");
    }

    public final long AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.util.HashMap<java.lang.String, java.lang.Long> map = gEmmrt;
        java.lang.Long l = map.get(str);
        long jLongValue = l != null ? l.longValue() : 0L;
        java.lang.Long l2 = map.get(str2);
        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
        if (jLongValue <= 0 || jLongValue2 <= 0 || jLongValue >= jLongValue2) {
            return 0L;
        }
        return jLongValue2 - jLongValue;
    }

    public final long valueOf() {
        return AEQbTJ("application_create_end", "activity_start");
    }

    public final long copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Long l = gEmmrt.get(str);
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public static final void AEQbTJ(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        ReportManager reportManager = ReportManager.AEQbTJ;
        pUU.EZpvd("dexguard", "recordTime=> " + str + " : " + j + " : " + reportManager.fARcdN());
        if (reportManager.fARcdN()) {
            AYXKKw.put(str, C56390yDp.OLrzqt(java.lang.Long.valueOf(j), java.lang.Boolean.valueOf(reportManager.fARcdN())));
        }
    }

    public static final void KWHzl() {
        for (Map.Entry<java.lang.String, kotlin.Pair<java.lang.Long, java.lang.Boolean>> entry : AYXKKw.entrySet()) {
            java.lang.String key = entry.getKey();
            kotlin.Pair<java.lang.Long, java.lang.Boolean> value = entry.getValue();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("duration", java.lang.String.valueOf(value.getFirst().longValue()));
            linkedHashMap.put("launching", value.getSecond().booleanValue() ? "1" : "0");
            EventData eventData = new EventData();
            eventData.setAct("module_launch_time");
            eventData.setPath(key);
            eventData.setAttribute(linkedHashMap);
            ReportManager.AEQbTJ.EZpvd(eventData);
        }
    }
}
