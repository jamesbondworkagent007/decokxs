package o;

import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.traderadar.ui.model.TradeRadarType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qgG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40875qgG {
    public static final TradeRadarType copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TradeRadarType tradeRadarType = TradeRadarType.ALL;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) tradeRadarType.getRequestValue())) {
            return tradeRadarType;
        }
        TradeRadarType tradeRadarType2 = TradeRadarType.WHALE;
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) tradeRadarType2.getRequestValue())) {
            tradeRadarType2 = TradeRadarType.PRICE_SURGE;
            if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) tradeRadarType2.getRequestValue())) {
                tradeRadarType2 = TradeRadarType.UNLOCKS;
                if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) tradeRadarType2.getRequestValue())) {
                    tradeRadarType2 = TradeRadarType.TRADERS;
                    if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) tradeRadarType2.getRequestValue())) {
                        return tradeRadarType;
                    }
                }
            }
        }
        return tradeRadarType2;
    }
}
