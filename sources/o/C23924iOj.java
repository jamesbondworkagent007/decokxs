package o;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iOj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23924iOj {
    public static final C23924iOj AEQbTJ = new C23924iOj();
    public static final ConcurrentHashMap<java.lang.String, ConcurrentHashMap<java.lang.Long, java.lang.String>> EZpvd = new ConcurrentHashMap<>();
    public static final int KWHzl = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return "DetailDailyBonusCacheKey";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return "DetailDataCacheKey";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return "PortfolioDataCacheKey";
    }

    private C23924iOj() {
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        ConcurrentHashMap<java.lang.Long, java.lang.String> concurrentHashMap = EZpvd.get(str);
        if (concurrentHashMap != null) {
            return concurrentHashMap.get(java.lang.Long.valueOf(j));
        }
        return null;
    }

    public final void EZpvd() {
        EZpvd.clear();
    }

    public final void AEQbTJ(@NotNull java.lang.String str, long j, java.lang.String str2) {
        ConcurrentHashMap<java.lang.Long, java.lang.String> concurrentHashMapPutIfAbsent;
        Intrinsics.checkNotNullParameter(str, "");
        ConcurrentHashMap<java.lang.String, ConcurrentHashMap<java.lang.Long, java.lang.String>> concurrentHashMap = EZpvd;
        ConcurrentHashMap<java.lang.Long, java.lang.String> concurrentHashMap2 = concurrentHashMap.get(str);
        if (concurrentHashMap2 == null && (concurrentHashMapPutIfAbsent = concurrentHashMap.putIfAbsent(str, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
            concurrentHashMap2 = concurrentHashMapPutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(concurrentHashMap2, "");
        ConcurrentHashMap<java.lang.Long, java.lang.String> concurrentHashMap3 = concurrentHashMap2;
        if (str2 == null) {
            str2 = "";
        }
        concurrentHashMap3.put(java.lang.Long.valueOf(j), str2);
    }
}
