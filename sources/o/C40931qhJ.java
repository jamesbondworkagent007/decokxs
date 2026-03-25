package o;

import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.ui.fragment.TradingCalendarMonth;

/* JADX INFO: renamed from: o.qhJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C40931qhJ {
    public static final TradingCalendarMonth AEQbTJ(int i) {
        if (i == -1) {
            return TradingCalendarMonth.PREVIOUS_MONTH;
        }
        if (i == 0) {
            return TradingCalendarMonth.CURRENT_MONTH;
        }
        if (i == 1) {
            return TradingCalendarMonth.NEXT_MONTH;
        }
        if (i == 2) {
            return TradingCalendarMonth.NEXT_NEXT_MONTH;
        }
        return TradingCalendarMonth.CURRENT_MONTH;
    }
}
