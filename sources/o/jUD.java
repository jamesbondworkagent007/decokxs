package o;

import com.okinc.business.market.common.constants.RangeType;
import com.okinc.business.market.features.filter.domain.AdvancedFilter;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class jUD {
    public static final jUD copydefault = new jUD();
    public static final java.util.Map<java.lang.String, AdvancedFilter> KWHzl = new ConcurrentHashMap();
    public static final java.util.Map<java.lang.String, java.util.Map<RangeType, TokenFilter>> EZpvd = new ConcurrentHashMap();
    public static final int AEQbTJ = 8;

    private jUD() {
    }

    public final java.util.Map<RangeType, TokenFilter> EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return EZpvd.get(str);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.Map<RangeType, TokenFilter> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        EZpvd.put(str, map);
    }

    public final AdvancedFilter OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return KWHzl.get(str);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull AdvancedFilter advancedFilter) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(advancedFilter, "");
        KWHzl.put(str, advancedFilter);
    }

    public final AdvancedFilter AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault(str);
        return KWHzl.remove(str);
    }

    public final void copydefault() {
        KWHzl.clear();
        EZpvd.clear();
    }

    public final void copydefault(java.lang.String str) {
        EZpvd.remove(str);
    }
}
