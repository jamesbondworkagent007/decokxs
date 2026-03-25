package o;

import com.okinc.business.defi.api.bean.ChartData;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC18281ffT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ffV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18283ffV {
    public static final java.util.List<ChartData> KWHzl(java.util.List<ChartData> list, ChartData chartData) {
        return list.isEmpty() ? yDY.AhwBna() : CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) list, (java.lang.Iterable) yDY.OLrzqt(chartData));
    }

    public static final java.util.List<ChartData> EZpvd(@NotNull AbstractC18281ffT.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        return KWHzl(activity.OLrzqt(), activity.AEQbTJ());
    }
}
