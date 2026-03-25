package o;

import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.TradingCalendarType;

/* JADX INFO: renamed from: o.qiY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C40999qiY {
    public static final TradingCalendarType copydefault(int i) {
        if (i == 0) {
            return TradingCalendarType.ALL;
        }
        if (i == 1) {
            return TradingCalendarType.ECONOMIC;
        }
        if (i == 2) {
            return TradingCalendarType.TOKEN_UNLOCK;
        }
        return TradingCalendarType.ALL;
    }
}
