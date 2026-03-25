package o;

import com.okinc.components.track.amplitude.AmplitudeName;
import com.okinc.core.util.SPUtils;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mme, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32918mme {
    public static final C32918mme copydefault = new C32918mme();
    public static final ConcurrentHashMap<AmplitudeName, ConcurrentHashMap<java.lang.String, C32921mmh<java.lang.String>>> KWHzl = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<AmplitudeName, ConcurrentHashMap<java.lang.String, C32921mmh<java.lang.Object>>> AEQbTJ = new ConcurrentHashMap<>();
    public static final int EZpvd = 8;

    private C32918mme() {
    }

    public final boolean copydefault(@NotNull AmplitudeName amplitudeName, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        Intrinsics.checkNotNullParameter(str, "");
        ConcurrentHashMap<java.lang.String, C32921mmh<java.lang.Object>> concurrentHashMap = AEQbTJ.get(amplitudeName);
        return concurrentHashMap != null && concurrentHashMap.containsKey(str);
    }

    public final java.lang.Object EZpvd(@NotNull AmplitudeName amplitudeName, @NotNull java.lang.String str) {
        C32921mmh<java.lang.Object> c32921mmh;
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        Intrinsics.checkNotNullParameter(str, "");
        ConcurrentHashMap<java.lang.String, C32921mmh<java.lang.Object>> concurrentHashMap = AEQbTJ.get(amplitudeName);
        if (concurrentHashMap == null || (c32921mmh = concurrentHashMap.get(str)) == null) {
            return null;
        }
        return c32921mmh.copydefault();
    }

    public static final ConcurrentHashMap OLrzqt(AmplitudeName amplitudeName) {
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        return new ConcurrentHashMap();
    }

    public static final ConcurrentHashMap OLrzqt(Function1 function1, java.lang.Object obj) {
        return (ConcurrentHashMap) function1.invoke(obj);
    }

    public final void AEQbTJ(@NotNull AmplitudeName amplitudeName, @NotNull java.lang.String str, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        Intrinsics.checkNotNullParameter(str, "");
        ConcurrentHashMap<AmplitudeName, ConcurrentHashMap<java.lang.String, C32921mmh<java.lang.Object>>> concurrentHashMap = AEQbTJ;
        final Function1 function1 = new Function1() { // from class: o.mmf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C32918mme.OLrzqt((AmplitudeName) obj2);
            }
        };
        ConcurrentHashMap<java.lang.String, C32921mmh<java.lang.Object>> concurrentHashMapComputeIfAbsent = concurrentHashMap.computeIfAbsent(amplitudeName, new java.util.function.Function() { // from class: o.mmd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj2) {
                return C32918mme.OLrzqt(function1, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(concurrentHashMapComputeIfAbsent, "");
        concurrentHashMapComputeIfAbsent.put(str, new C32921mmh<>(obj));
    }

    public final void copydefault() {
        synchronized (this) {
            KWHzl.clear();
            AEQbTJ.clear();
        }
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull AmplitudeName amplitudeName) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        return SPUtils.getString(str, null, C32920mmg.EZpvd(amplitudeName));
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull AmplitudeName amplitudeName) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        return SPUtils.getString("payload_key_prefix_" + str, null, C32920mmg.EZpvd(amplitudeName));
    }
}
