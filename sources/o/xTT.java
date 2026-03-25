package o;

import com.okinc.tradeapi.bean.MarketDataSource;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.biz.CountDownType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xTT {
    public static final java.util.Comparator<MarketDataSource> copydefault(@NotNull final java.util.Map<java.lang.String, ? extends AbstractC54531xLw> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return new java.util.Comparator() { // from class: o.xTR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return xTT.EZpvd(map, (MarketDataSource) obj, (MarketDataSource) obj2);
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int EZpvd(java.util.Map map, MarketDataSource marketDataSource, MarketDataSource marketDataSource2) {
        CountDownInfo countDownInfoAEQbTJ;
        kotlin.Pair<java.lang.Integer, java.lang.Long> pairOLrzqt;
        kotlin.Pair<java.lang.Integer, java.lang.Long> pairOLrzqt2;
        AbstractC54531xLw abstractC54531xLw;
        AbstractC54531xLw abstractC54531xLw2;
        CountDownInfo countDownInfoAEQbTJ2 = null;
        if (marketDataSource == null || (abstractC54531xLw2 = (AbstractC54531xLw) map.get(marketDataSource.getInstType())) == null) {
            countDownInfoAEQbTJ = null;
        } else {
            java.lang.String instId = marketDataSource.getInstId();
            if (instId == null) {
                instId = "";
            }
            BizInstrument bizInstrumentValueOf = abstractC54531xLw2.valueOf(instId);
            if (bizInstrumentValueOf != null) {
                countDownInfoAEQbTJ = xUD.AEQbTJ(bizInstrumentValueOf.getInstId(), bizInstrumentValueOf.getInstType());
            }
        }
        if (marketDataSource2 != null && (abstractC54531xLw = (AbstractC54531xLw) map.get(marketDataSource2.getInstType())) != null) {
            java.lang.String instId2 = marketDataSource2.getInstId();
            BizInstrument bizInstrumentValueOf2 = abstractC54531xLw.valueOf(instId2 != null ? instId2 : "");
            if (bizInstrumentValueOf2 != null) {
                countDownInfoAEQbTJ2 = xUD.AEQbTJ(bizInstrumentValueOf2.getInstId(), bizInstrumentValueOf2.getInstType());
            }
        }
        if (countDownInfoAEQbTJ == null || (pairOLrzqt = EZpvd(countDownInfoAEQbTJ)) == null) {
            pairOLrzqt = C56390yDp.OLrzqt(11, 0L);
        }
        if (countDownInfoAEQbTJ2 == null || (pairOLrzqt2 = EZpvd(countDownInfoAEQbTJ2)) == null) {
            pairOLrzqt2 = C56390yDp.OLrzqt(11, 0L);
        }
        if (pairOLrzqt.getFirst().intValue() <= pairOLrzqt2.getFirst().intValue()) {
            if (pairOLrzqt.getFirst().intValue() >= pairOLrzqt2.getFirst().intValue()) {
                if (pairOLrzqt.getSecond().longValue() <= pairOLrzqt2.getSecond().longValue()) {
                    if (pairOLrzqt.getSecond().longValue() >= pairOLrzqt2.getSecond().longValue()) {
                        return 0;
                    }
                }
            }
            return -1;
        }
        return 1;
    }

    public static final kotlin.Pair<java.lang.Integer, java.lang.Long> EZpvd(@NotNull CountDownInfo countDownInfo) {
        Intrinsics.checkNotNullParameter(countDownInfo, "");
        CountDownType showType = countDownInfo.getShowType();
        CountDownType countDownType = CountDownType.SHOW_COUNT_DOWN;
        return C56390yDp.OLrzqt(java.lang.Integer.valueOf(showType == countDownType ? 0 : 10), java.lang.Long.valueOf(countDownInfo.getShowType() == countDownType ? C33129mqd.valueOf(countDownInfo.getOnlineTime()) : 0L));
    }
}
