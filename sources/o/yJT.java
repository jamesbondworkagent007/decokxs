package o;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yJT {
    public static final yJM<C56586yKw<? extends java.lang.Object>> OLrzqt = yJQ.EZpvd(yJU.AEQbTJ);
    public static final yJM<C56598yLh> KWHzl = yJQ.EZpvd(yJR.AEQbTJ);
    public static final yJM<InterfaceC56559yJw> AEQbTJ = yJQ.EZpvd(yJS.KWHzl);
    public static final yJM<InterfaceC56559yJw> copydefault = yJQ.EZpvd(yJV.OLrzqt);
    public static final yJM<ConcurrentHashMap<kotlin.Pair<java.util.List<KTypeProjection>, java.lang.Boolean>, InterfaceC56559yJw>> EZpvd = yJQ.EZpvd(yJZ.KWHzl);

    public static final C56586yKw AEQbTJ(java.lang.Class cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        return new C56586yKw(cls);
    }

    public static final C56598yLh copydefault(java.lang.Class cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        return new C56598yLh(cls);
    }

    public static final <T> C56586yKw<T> fetchVPNInfo(@NotNull java.lang.Class<T> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        yKQ ykqKWHzl = OLrzqt.KWHzl(cls);
        Intrinsics.copydefault(ykqKWHzl, "");
        return (C56586yKw) ykqKWHzl;
    }

    public static final <T> InterfaceC56550yJn isConnected(@NotNull java.lang.Class<T> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        return KWHzl.KWHzl(cls);
    }

    public static final InterfaceC56559yJw OLrzqt(java.lang.Class cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        return yJI.EZpvd(fetchVPNInfo(cls), yDY.AhwBna(), false, yDY.AhwBna());
    }

    public static final InterfaceC56559yJw KWHzl(java.lang.Class cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        return yJI.EZpvd(fetchVPNInfo(cls), yDY.AhwBna(), true, yDY.AhwBna());
    }

    public static final ConcurrentHashMap EZpvd(java.lang.Class cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        return new ConcurrentHashMap();
    }

    public static final <T> InterfaceC56559yJw AEQbTJ(@NotNull java.lang.Class<T> cls, @NotNull java.util.List<KTypeProjection> list, boolean z) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (!list.isEmpty()) {
            return KWHzl(cls, list, z);
        }
        if (z) {
            return copydefault.KWHzl(cls);
        }
        return AEQbTJ.KWHzl(cls);
    }

    public static final <T> InterfaceC56559yJw KWHzl(java.lang.Class<T> cls, java.util.List<KTypeProjection> list, boolean z) {
        InterfaceC56559yJw interfaceC56559yJwPutIfAbsent;
        ConcurrentHashMap<kotlin.Pair<java.util.List<KTypeProjection>, java.lang.Boolean>, InterfaceC56559yJw> concurrentHashMapKWHzl = EZpvd.KWHzl(cls);
        kotlin.Pair<java.util.List<KTypeProjection>, java.lang.Boolean> pairOLrzqt = C56390yDp.OLrzqt(list, java.lang.Boolean.valueOf(z));
        InterfaceC56559yJw interfaceC56559yJwEZpvd = concurrentHashMapKWHzl.get(pairOLrzqt);
        if (interfaceC56559yJwEZpvd == null && (interfaceC56559yJwPutIfAbsent = concurrentHashMapKWHzl.putIfAbsent(pairOLrzqt, (interfaceC56559yJwEZpvd = yJI.EZpvd(fetchVPNInfo(cls), list, z, yDY.AhwBna())))) != null) {
            interfaceC56559yJwEZpvd = interfaceC56559yJwPutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(interfaceC56559yJwEZpvd, "");
        return interfaceC56559yJwEZpvd;
    }
}
